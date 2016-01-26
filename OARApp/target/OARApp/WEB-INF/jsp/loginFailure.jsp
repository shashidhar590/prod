<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
   <h1>Login Failed!!</h1>
   
 <form:form name="loginForm" action="../login/register" method="post" >
    <ul>
        <li><input type="submit" value="Try again"></input></li>
    </ul>
</form:form>
</body>
</html>