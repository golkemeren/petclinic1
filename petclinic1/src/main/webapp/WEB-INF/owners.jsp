<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Owners</title>
</head>
<body>
<table>
       <thread>
           <tr style = "font-weight:bold:" bgcolor="lightblue">
               <td>ID</td>
                <td>First Name</td>
                 <td>Last Name</td>
           </tr>
       </thread> 

<c:forEach items= "${owners}" var="owner" varStatus="status"> 
<tr bgcolor= "${status.index %2 == 0 ? 'white' : 'lightgray' }"> 
    <td>${owner.id}</td>
    <td>${owner.firstName}</td>
    <td>${owner.lastName}</td>
 
 </tr>  
</c:forEach>

</table>
<c:if test="${not empty message}"/>
<div style="color:blue">
${message}
</div>

</body>
</html>