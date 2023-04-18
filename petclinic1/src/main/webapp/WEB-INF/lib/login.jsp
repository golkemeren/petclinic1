<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html;  charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>PetClinic Login Page</h1>
<form action="Login" method="post"/>
   Username:<input type="text" name="username/"><br/>
   Password:<input type="password" name="password"/> <br/>
   
   <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
   <input type="submit" value="Login"/>
   <font color="red">
   <c:if test="${not empty param.loginFailed}"/>


</body>
</html>