<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>JPA APP</title>
</head>
<body>
	<div class="container" >
		<form action="addAlien">
			 <div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">ID</label>
			  <input type="text" class="form-control" id="exampleFormControlInput1" name="aid" >
			</div>
			<div class="mb-3">
			  <label for="exampleFormControlTextarea1" class="form-label">Name</label>
			  <input type="text" class="form-control" id="exampleFormControlInput1" name="aname" >
			</div>
			<button type="submit" class="btn btn-primary">Save</button>
		</form>
		
		<form action="getAlien">
			 <div class="mb-3">
			  <label for="exampleFormControlInput1" class="form-label">ID</label>
			  <input type="text" class="form-control" id="exampleFormControlInput1" name="aid" >
			</div>
			<button type="submit" class="btn btn-primary">Fetch</button>
		</form> 
	</div>
</body>
</html>