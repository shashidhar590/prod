<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet">
     <h2> <div class="container">OAR Tool</div> </h2>
</head>
<body>

<div class="container">

	<section id="content">
	
	<div>
		 <form:form name="loginForm" action="loginAction" commandName="login" method="post" >
   <div>
        <form:input path="loginId" type="email" placeholder="yourname@email.com"></form:input>
   </div>
   <div>     
        <form:input path="password" name="password" type="password" placeholder="password"></form:input>
    </div>
    <div>    
        <input type="submit" value="Login" onclick="javascript:form.action='loginAction';"></input>
     </div>
      <div>
        <input type="submit" value="createUser" onclick="javascript:form.action='../signup/register';"></input>
   		</div>
</form:form>
	</div>
	</section><!-- content -->
</div><!-- container -->
</body>
</html>