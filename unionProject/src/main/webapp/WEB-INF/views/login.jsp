<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body class="loginDiv">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<div class="logoDiv">
						<img src="/img/logo.jpg">
					</div>
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title text-center text-dark">
								Welcome to My System
								<span class="badge badge-secondary">
								v1.0
								</span>
							</h4>
							<form method="POST" action="/authenticate">
								<div class="form-group">
									<label for="id" class="text-secondary">Account</label>
									<input id="account" class="form-control" name="USERNAME" value="" required autofocus>
								</div>
								<div class="form-group">
									<label for="id" class="text-secondary">Password</label>
									<input id="password" type="password" class="form-control" name="PASSWORD" required>
								</div>
								<div class="form-group no-margin">
									<button type="submit" class="btn btn-info btn-block">
										Login
									</button>
								</div>
							</form>
							<div class="right-align">
								<a href="#">ID/PW?</a>
								<a href="#">Sign In</a>
							</div>
						</div>
					</div>
					<div class="footer">
						Copyright © <a href="#" class="badge badge-info">BJLee</a> 2020
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="/webjars/jquery/3.3.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>