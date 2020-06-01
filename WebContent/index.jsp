<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List, com.missiontomars.models.*, com.missiontomars.db.*"
    pageEncoding="UTF-8"%>
<% 
	if (session.getAttribute("loginUser") == null) {
		response.sendRedirect("login.jsp");
	}
	List<User> userList = DbOperator.getDatabase().getUsers();
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Main Page</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<style>
		.sidebar {
		    position: fixed;
		    top: 51px;
		    bottom: 0;
		    left: 0;
		    z-index: 1000;
		    display: block;
		    padding: 20px 0;
		    overflow-x: hidden;
		    overflow-y: auto;
		    background-color: #f5f5f5;
		    border-right: 1px solid #eee;
		}
		.nav-sidebar > .active > a, .nav-sidebar > .active > a:hover, .nav-sidebar > .active > a:focus {
		    color: #fff;
		    background-color: #428bca;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Mission to Mars</a>
        </div>
      </div>
    </nav>

    <div class="container-fluid" style="padding-top: 51px">
      <div class="row">
        <div class="col-sm-3 col-md-1 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Users</a></li>
            <li><a href="missions.jsp">Missions</a></li>
            <li><a href="#">Candidates</a></li>
            <li><a href="logoutController">Logout</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-11 col-md-offset-1 main">
        	<h1>User List</h1>
        	<table class="table table-bordered">
        		<thead>
        			<tr>
        				<th>#</th>
        				<th>username</th>
        				<th>name</th>
        				<th>mobile</th>
        				<th>role</th>
        			</tr>
        		</thead>
        		<tbody>
        		<% for(User user : userList){ %>
        			<tr>
        				<td><%= user.getId() %></td>
        				<td><%= user.getUsername() %></td>
        				<td><%= user.getName() %></td>
        				<td><%= user.getMobile() %></td>
        				<td><%= user.getRole() %></td>
        			</tr>
        		<% } %>
        		</tbody>
			</table>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>