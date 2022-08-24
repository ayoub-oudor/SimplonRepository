<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add employee</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<form action=EmployeeServlet  method="post">
<div class="container">
    <div class="row my-4">
        <div class="col-md-8 mx-auto"> 
            <div class="card">
                <div class="card-header">Add employee</div>
                <div class="card-body bg-light">
                    <form method="post">
                        <div class="form-group">
                            <label for="username">Username*</label>
                            <input type="text" name="nom" class="form-control" placeholder="Username">
                        </div>
                        <div class="form-group">
                            <label for="password">password*</label>
                            <input type="password" name="password" class="form-control" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label for="birthday">birthday*</label>
                            <input type="date" name="birthday" class="form-control" placeholder="Birthday">
                        </div>
                        <div class="form-group">
                            <label for="hiring_date">hiring date*</label>
                            <input type="date" name="hiring_date" class="form-control" placeholder="Hiring Date">
                        </div>
                        <div class="form-group">
                            <label for="salary">salary*</label>
                            <input type="number" name="salary" class="form-control" placeholder="Salary">
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary" type="submit" name="submit">Add</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</form>
</body>
</html>