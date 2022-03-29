<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Create a new game </title>
</head>

<body>


<form:form action="/v1/games/create"  method="POST" modelAttribute="game">
<form:hidden path="id" />
 <div class="mb-3">
    <form:label path="name" class="form-label">Name</form:label>
    <form:input type="text" class="form-control" path="name"  />
  </div>
  <div class="mb-3">
    <form:label path="price" class="form-label">Price</form:label>
    <form:input type="text" class="form-control" path="price" />
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>

</form:form>
</body>