<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>Register</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-offset-2 col-md-8">
	            <form class="form-horizontal" method="POST" action="registerController">
	                <h2 class="text-center" style="margin: 64px auto 32px auto;">Candidate Register</h2>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Name</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="name">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Date of Birth</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="birthday">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Address</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="address">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Nationality</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="nationality">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Identification Number</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="idNumber">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Gender</label>
					    <div class="col-sm-10">
					    	<select class="form-control" name="gender">
					    		<option value="Male">Male</option>
					    		<option value="Female">Female</option>
					    	</select>
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Allergies</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="allergies">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Food preferences</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="food">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Qualification</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="qualification">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Work Experience</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="work">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Occupations</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="occupations">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Computer Skills</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="computer">
					    </div>
					</div>
		            <div class="form-group">
					    <label class="col-sm-2 control-label">Languages spoken</label>
					    <div class="col-sm-10">
					    	<input type="text" class="form-control" name="languages">
					    </div>
					</div>
	                <div class="form-group text-center">
	                    <button type="submit" class="btn btn-primary">Submit</button>
	                </div>
	            </form>
	        </div>
	    </div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>