<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet">
    <h2>
    <div class="container">    Sign Up!!!<br/>
It's free and always will be.</div>
</h2>
</head>
<body>
<div class="container">
	<section id="content">
	<div>
	
 <form:form name="createUserForm" action="createUser" commandName="user" method="post" >
        <form:input path="fname" type="text" placeholder="First Name"></form:input>
     	<form:input path="lname" type="text" placeholder="Last Name"></form:input>
        <form:input path="emailId" name="emailId" type="email" placeholder="Email"></form:input>
   		 <form:input path="confirmEmailId" name="confirmEmailId" type="email" placeholder="Re-enter Email"></form:input>
   		 <form:input path="login.password" name="password" type="password" placeholder="Password"></form:input>
   		<form:input path="dob" name="dob" type="date" placeholder="Birthday" title="DOB"></form:input>
        <input type="submit" value="Signup"></input>
</form:form>
</div>
</section>
</div>

</body>
</html>