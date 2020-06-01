<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Login</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-offset-4 col-md-4">
	            <form class="form-horizontal" method="POST" action="loginController">
	                <h2 class="text-center" style="margin: 64px auto 32px auto;">User Login</h2>
	                <div class="form-group">
	                    <input type="text" class="form-control" name="username" placeholder="user name">
	                    <i class="fa fa-user"></i>
	                </div>
	                <div class="form-group help">
	                    <input type="password" class="form-control" name="password" placeholder="password">
	                    <i class="fa fa-lock"></i>
	                </div>
	                <div class="form-group text-center">
	                    <button type="submit" class="btn btn-primary">Login</button>
	                </div>
	            </form>
	        </div>
	    </div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>