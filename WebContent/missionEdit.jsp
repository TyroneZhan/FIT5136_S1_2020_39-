<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List,java.util.ArrayList, com.missiontomars.models.*, com.missiontomars.db.*"
    pageEncoding="UTF-8"%>
<% 
	if (session.getAttribute("loginUser") == null) {
		response.sendRedirect("login.jsp");
		return;
	}
	User user = (User)session.getAttribute("loginUser");
	List<Mission> missionList = DbOperator.getDatabase().getMissions();
	String missionId = request.getParameter("missionId");
	Mission mission = new Mission();
	List<MissionJob> missionJobs = new ArrayList<MissionJob>();
	Shuttle shuttle = null;
	List<Shuttle> shuttles = DbOperator.getDatabase().getShuttles();
	if (missionId != null) {
		mission = DbOperator.getDatabase().findMissionByPk(Integer.parseInt(missionId));
		missionJobs = DbOperator.getDatabase().getMissionJobsByMissionId(Integer.parseInt(missionId));
		if(mission.getShuttleId() > 0){
			for(Shuttle sh : shuttles) {
				if(sh.getId() == mission.getShuttleId()){
					shuttle = sh;
				}
			}
		}
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
				    	<select class="form-control" name="cargoRequirements">
				    		<option value="for_the_journey" <%= mission.getCargoRequirements().equals("for_the_journey") ? "selected" : "" %>>For the journey</option>
				    		<option value="for_the_mission" <%= mission.getCargoRequirements().equals("for_the_mission") ? "selected" : "" %>>For the mission</option>
				    		<option value="for_other_mission" <%= mission.getCargoRequirements().equals("for_other_mission") ? "selected" : "" %>>For other mission</option>
				    	</select>
				    </div>
				</div>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Launch Date</label>
				    <div class="col-sm-10">
				    	<input type="text" id="launchDate" class="form-control" name="launchDate" value="<%= mission.getLaunchDateStr() %>" placeholder="launch date">
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
				<% if(mission.getId() != 0) { %>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Status Of the Mission</label>
				    <div class="col-sm-10">
				    	<select class="form-control" name="status">
				    		<option value="planning_phase" <%= mission.getStatus().equals("planning_phase") ? "selected" : "" %>>planning phase</option>
				    		<option value="departed_earth" <%= mission.getStatus().equals("departed_earth") ? "selected" : "" %>>departed earth</option>
				    		<option value="landed_on_mars" <%= mission.getStatus().equals("landed_on_mars") ? "selected" : "" %>>landed on mars</option>
				    		<option value="mission_in_progress" <%= mission.getStatus().equals("mission_in_progress") ? "selected" : "" %>>mission in progress</option>
				    		<option value="returned_to_earth" <%= mission.getStatus().equals("returned_to_earth") ? "selected" : "" %>>returned to earth</option>
				    		<option value="mission_completed" <%= mission.getStatus().equals("mission_completed") ? "selected" : "" %>>mission completed</option>
				    	</select>
				    </div>
				</div>
				<% if(user.getRole().equals("admin")){ %>
	            <div class="form-group">
				    <label class="col-sm-2 control-label">Select Shuttle</label>
				    <div class="col-sm-10">
				    	<select class="form-control" name="shuttle">
				    		<option value="0">Select Shuttle</option>
				    	<% for(Shuttle sh : shuttles){ %>
				    		<option value="<%= sh.getId() %>" <%= mission.getShuttleId() == sh.getId() ? "selected" : "" %>><%= sh.getName() %></option>
				    	<% } %>
				    	</select>
				    </div>
				</div>
				<% } %>
				<% } %>
	            <div class="form-group">
				    <div class="col-sm-12 text-center">
				    	<button type="submit" class="btn btn-primary">Submit</button>
				    </div>
				</div>
				<% if(mission.getId() != 0) { %>
				<div>
					<h3>Jobs</h3>
					<table class="table table-striped">
						<tr>
							<th>Name</th>
							<th>Required Number</th>
							<th>Description</th>
							<th></th>
						</tr>
						<tr>
						<% for(MissionJob job : missionJobs) { %>
							<td><%= job.getName() %></td>
							<td><%= job.getRequiredNumber() %></td>
							<td><%= job.getDescription() %></td>
							<td></td>
						<% } %>
						</tr>
						<tr>
							<td>
								<input id="job-name" placeholder="Job name" />
							</td>
							<td>
								<input id="job-number" type="number" placeholder="Job Required number" />
							</td>
							<td>
								<input id="job-description" placeholder="Job description" />
							</td>
							<td>
								<input type="button" id="add-job" value="Add Job" />
							</td>
						</tr>
					</table>
				</div>
				<% } %>
				<% if(mission.getShuttleId() != 0) { %>
				<div>
					<h3>Selected Shuttled</h3>
					<table class="table table-striped">
						<tr>
							<th>Name</th>
							<th>Manufacture Year</th>
							<th>Fuel Capability (kg)</th>
							<th>Passenger capacity</th>
							<th>Cargo capacity (m^3)</th>
							<th>Travel speed (km/s)</th>
							<th>Origin</th>
						</tr>
						<tr>
							<td><%= shuttle.getName() %></td>
							<td><%= shuttle.getManufactureYear() %></td>
							<td><%= shuttle.getFuelCapacity() %></td>
							<td><%= shuttle.getPassengerCapacity() %></td>
							<td><%= shuttle.getCargoCapacity() %></td>
							<td><%= shuttle.getSpeed() %></td>
							<td><%= shuttle.getOrigin() %></td>
						</tr>
					</table>
				</div>
				<% } %>
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
    		$("#add-job").click(function(){
    			if(!$("#job-name").val() || !$("#job-number").val() || !$("#job-description").val()) {
    				alert("fill the form before submit please.");
    				return;
    			}
    			$.ajax({
    				url: "AddMissionJob",
    				method: "POST",
    				data: {
    					missionId: <%= missionId %>,
    					name: $("#job-name").val(),
    					requiredNumber: $("#job-number").val(),
    					description: $("#job-description").val(),
    				},
    				success: function(){
    					alert("added");
    					window.location.reload();
    				},
    				error: function(){
    					alert("server error.")
    				}
    			});
    		});
    	});
    </script>
</body>
</html>