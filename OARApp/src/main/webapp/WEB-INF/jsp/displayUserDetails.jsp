<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
   <h1>Welcome !!</h1>
   <h3>Your LoginId : ${user.emailId}</h3>

<form:form name="userDetails" action="../login/register">
<table>
	<tr>
		<td>
		Firstname: ${user.fname}
		</td>
	</tr>
	<tr>
		<td>
		LastName: ${user.lname}
		</td>
	</tr>
	<tr>
		<td>
		emailid: ${user.emailId}
		</td>
	</tr>
	
</table>
<input type="submit" value="login Now">

</form:form>
</body>
</html>
