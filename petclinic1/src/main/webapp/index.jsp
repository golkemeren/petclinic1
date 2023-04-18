<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1> index page </h1>
    <form action= "Logout" method="post"/>
     <input type="submit" value ="Logout"/>
     <input type="hidden" name ="${_csrf.parameterName}" value="${_csrf.token}"/>
     
</body>
</html>