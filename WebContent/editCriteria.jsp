<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List,java.util.ArrayList, com.missiontomars.models.*, com.missiontomars.db.*"
    pageEncoding="UTF-8"%>
<% 
	if (session.getAttribute("loginUser") == null) {
		response.sendRedirect("login.jsp");
		return;
	}
	String jobId = request.getParameter("jobId");
	Criteria criteria = new Criteria(Integer.parseInt(jobId));
	String missionId = request.getParameter("missionId");
	List<Criteria> criteriaList = DbOperator.getDatabase().getCriterias();
	for(Criteria c : criteriaList) {
		if(criteria.getJobId() == c.getJobId()){
			criteria = c;
			break;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Edit Criteria</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-offset-2 col-md-8">
	            <form class="form-horizontal" method="POST" action="editCriteria">
	                <h2 class="text-center" style="margin: 64px auto 32px auto;">Edit Criteria</h2>
	                <input type="hidden" name="jobId" value="<%= criteria.getJobId() %>"/>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Employment Title</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="title" value="<%= criteria.getTitle() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Quantity</label>
					    <div class="col-sm-10">
					    	<input type="number" class="form-control" name="quantity" value="<%= criteria.getQuantity() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Minimal Age</label>
					    <div class="col-sm-10">
					    	<input type="number" class="form-control" name="minAge" value="<%= criteria.getMinAge() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Maximal Age</label>
					    <div class="col-sm-10">
					    	<input type="number" class="form-control" name="maxAge" value="<%= criteria.getMaxAge() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Years of work experience</label>
					    <div class="col-sm-10">
					    	<input type="number" class="form-control" name="workExperience" value="<%= criteria.getWorkExperience() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Occupations</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="occupations" value="<%= criteria.getOccupations() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Health records</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="health" value="<%= criteria.getHealth() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Criminal records</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="criminal" value="<%= criteria.getCriminal() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Computer Skills</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="computer" value="<%= criteria.getComputer() %>">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Language spoken</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="languages" value="<%= criteria.getLanguages() %>">
					    </div>
					</div>
	                <div class="form-group text-center">
	                    <button type="submit" class="btn btn-primary">Submit</button>
	                    <a href="missionEdit.jsp?missionId=<%= missionId %>" class="btn btn-primary">Back to Mission</a>
	                </div>
	            </form>
	        </div>
	    </div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>