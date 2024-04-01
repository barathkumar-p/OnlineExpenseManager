package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.HibernateUtil;
import com.entity.User;


@WebServlet("/userRegister")
public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname =req.getParameter("fullname");
		String email=req.getParameter("email");
		String phoneNumber =req.getParameter("phoneNumber");
		String password=req.getParameter("password");
		String about=req.getParameter("about");
		
		User u=new User(fullname,email,phoneNumber,password,about);
 
		//System.out.println(u);
		UserDao dao=new UserDao(HibernateUtil.getSessionFactory());
		boolean f=dao.saveuser(u);
		
		HttpSession session = req.getSession();
		
		
		
		if(f) {
			//System.out.print("REgisterd Succesfully");
			session.setAttribute("msg","Registered Succesfully");
			resp.sendRedirect("Register.jsp");
		}else {
			session.setAttribute("msg", "something went wrong");
			//System.out.print("Something wrong at server"); 
			resp.sendRedirect("Register.jsp");
		} 
		
	}

	
}
