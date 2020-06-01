<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List, com.missiontomars.models.*, com.missiontomars.db.*"
    pageEncoding="UTF-8"%>
<% 
	if (session.getAttribute("loginUser") == null) {
		response.sendRedirect("login.jsp");
	}
	List<Mission> missionList = DbOperator.getDatabase().getMissions();
	Integer missionId = Integer.parseInt(request.getParameter("missionId"));
	Mission mission = new Mission();
	if (missionId != null) {
		mission = DbOperator.getDatabase().findMissionByPk(missionId);
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Edit Mission</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="https://cdn.bootcdn.net/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" rel="stylesheet">
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
            <li><a href="index.jsp">Users</a></li>
            <li class="active"><a href="#">Missions</a></li>
            <li><a href="#">Candidates</a></li>
            <li><a href="logoutController">Logout</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-11 col-md-offset-1 main">
        	<h1><%= request.getParameter("missionId") != null ? "Edit Mission" : "New Mission" %></h1>
            <form class="form-horizontal" method="POST" action="editMissionController">
            	<input type="hidden" name="id" value="<%= mission.getId() %>">
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Mission Name</label>
				    <div class="col-sm-10">
				    	<input type="text" class="form-control" name="name" value="<%= mission.getName() %>" placeholder="mission name">
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Mission Description</label>
				    <div class="col-sm-10">
				    	<textarea class="form-control" name="description" placeholder="mission description"><%= mission.getDescription() %></textarea>
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Country of Origin</label>
				    <div class="col-sm-10">
				    	<input type="text" class="form-control" name="countryOfOrigin" value="<%= mission.getCountryOfOrigin() %>" placeholder="country of origin">
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Countries Allowed</label>
				    <div class="col-sm-10">
				    	<input type="text" class="form-control" name="countriesAllowed" value="<%= mission.getCountriesAllowed() %>" placeholder="countries allowed">
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Cargo Requirements</label>
				    <div class="col-sm-10">
				    	<select class="form-control" name="cargoRequirements" value="<%= mission.getCargoRequirements() %>">
				    		<option value="for_the_journey">For the journey</option>
				    		<option value="for_the_mission">For the mission</option>
				    		<option value="for_other_mission">For other mission</option>
				    	</select>
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Launch Date</label>
				    <div class="col-sm-10">
				    	<input type="text" id="launchDate" class="form-control" name="launchDate" value="<%= mission.getLaunchDate() %>" placeholder="launch date">
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Destination Address</label>
				    <div class="col-sm-10">
				    	<input type="text" class="form-control" name="destinationAddress" value="<%= mission.getDestinationAddress() %>" placeholder="destination address">
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Duration Of the Mission</label>
				    <div class="col-sm-10">
				    	<div class="input-group">
					    	<input type="text" class="form-control" name="durationOfMission" value="<%= mission.getDurationOfMission() %>" placeholder="duration of the mission">
					    	<div class="input-group-addon">days</div>
				    	</div>
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Status Of the Mission</label>
				    <div class="col-sm-10">
				    	<select class="form-control" name="status" value="<%= mission.getStatus() %>">
				    		<option value="planning_phase">planning phase</option>
				    		<option value="departed_earth">departed earth</option>
				    		<option value="landed_on_mars">landed on mars</option>
				    		<option value="mission_in_progress">mission in progress</option>
				    		<option value="returned_to_earth">returned to earth</option>
				    		<option value="mission_completed">mission completed</option>
				    	</select>
				    </div>
				</div>
	            <div class="form-group">
				    <div class="col-sm-12 text-center">
				    	<button type="submit" class="btn btn-primary">Submit</button>
				    </div>
				</div>
            </form>
        </div>
      </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script>
    	$(function(){
    		$("#launchDate").datepicker({
    			format: "yyyy-mm-dd"
    		});
    	});
    </script>
</body>
</html>