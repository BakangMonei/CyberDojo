<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
</head>
<body>
<h2>User Details</h2>
<table border="1">
    <tr>
        <th>Email</th>
        <th>First Name</th>
        <th>Last Name</th>
        <!-- Add other fields as needed -->
    </tr>
    <tr>
        <td><%= ((ResultSet)request.getAttribute("user")).getString("email") %></td>
        <td><%= ((ResultSet)request.getAttribute("user")).getString("first_name") %></td>
        <td><%= ((ResultSet)request.getAttribute("user")).getString("last_name") %></td>
        <!-- Add other fields as needed -->
    </tr>
</table>
</body>
</html>
