<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet">
</head>
<body>
   <h1 align="Center">Home Page</h1>
   <div align="right" class="logoutContent">
 <form:form id="logoutForm" name="logoutForm" action="../login/register" method="post" modelAttribute="product">
  	<input type="submit" value="logout"/>
 </form:form>
 </div>
<script>
function  fetchProdDetails(){
	var prodSelect = document.getElementById("prodSelect");
  	var prodName= prodSelect.options[prodSelect.selectedIndex].value;
 	document.getElementById("homeForm").submit();
 }
 
function  onSubmitButton(){
	alert("coming soon..")
 }
  
</script>  
 <div class="container">
	<section id="content">
 <form:form id="homeForm" name="homeForm" action="getProductDetails" method="post" modelAttribute="product">
 <div>
 Product:
 </div>
  <form:select name="prodSelect" path="productName" id="prodSelect" onchange="javascript:fetchProdDetails()">
  <c:set var="counter" value="0" scope="page" />
  <c:forEach items="${productList}" var="productVar">
		    <c:if test="${counter== 0}">
		        <form:option value="N/A}" disabled="disabled">--Choose Product--</form:option>
		        <c:set var="counter" value="1"/>
		    </c:if>
  	<form:option value="${productVar.productName}">${productVar.productName}</form:option>
  </c:forEach>
  </form:select>

<c:if test="${showProdDetails == 'Y' }">
<br/>
<fieldset>
  		<legend>Product Details:</legend>
  
    <ul>
       <li>
         <form:label path="productDL">Product DL:</form:label>${product.productDL}
         <form:label path="productOwner">Product Owner:</form:label>${product.productOwner}
         <form:label path="productDescription">Product Owner:</form:label>${product.productDescription}
      </li>
      <li>
     Services:
       
		<form:select path="apiList[0].apiName" name="apiName" id="apiSelect" >
		    <c:forEach items="${product.apiList}" var="apiOptionList">
		       <form:option value="${apiOptionList.apiName}">${apiOptionList.apiName}</form:option>
		    </c:forEach>
		</form:select>
		<br/>
	</li>	
		<br/>
		<fieldset>
  		<legend>API Details</legend>
		<c:forEach items="${product.apiList}" var="api">
		  <li>
		    <input type="url" name="Service URL:" value="${api.url}">
		   Service URL: ${api.url}
		    </li>
		<li>Headers:
		<br>
	  		 <c:forEach items="${api.headers}" var="headerMap">
		       ${headerMap.key} : ${headerMap.value}
		       <br/>
		    </c:forEach>
		    </li>
		   <br/> 	
		   <li>	   
		   Input JSON Template : <textarea rows="4" cols="50"> ${api.templateJSON}</textarea>
		   </li> 
		   <br/>
       </c:forEach>
       </fieldset>
      	</li>
      	
       
    </ul>
     <input type="submit" value="Execute API" onclick="onSubmitButton()">
    </fieldset>

     <%-- <li>
      Final Json used: ${productJson}
      </li> --%>
      </c:if>   
    
</form:form>
</section>
</div>
</body>
</html>