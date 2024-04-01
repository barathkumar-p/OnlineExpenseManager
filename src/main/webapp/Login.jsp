<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="component/all_css.jsp" %>
</head>
<body>
<%@include file="component/NavBar.jsp" %>
<div class="container p-5">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card cars-sh">
				<div class="card-header">
					<p class="text-center fs-3">Login Page</p>
					
				</div>
				<div class="card-body">
				<form action="" method="">
				<div class=mb-3>
					<label>Enter User Name: </label><input type="text"
					name="username" class=form-control>
				</div>
				<div class=mb-3>
					<label>Enter Password: </label><input type="password"
					name="password" class=form-control>
				</div>
				<button class="btn btn-success col-md-12">Login</button>
				<div class="text-center mt-2">
					Don't have an account <a href=Register.jsp
					class="text-decoration-none">create one</a>
				</div>
				</form>
				</div>
				
			</div>
		</div> 
	</div>
</div>
</body>
</html>