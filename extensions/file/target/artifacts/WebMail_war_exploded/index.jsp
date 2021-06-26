
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Register</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/RegisterServlet.do" method="post">
  username: <input type="text" name="username"><br/>
  password: <input type="password" name="password"><br/>
  email: <input type="text" name="email"><br/>
  <input type="submit" value="Register">
</form>
</body>
</html>
