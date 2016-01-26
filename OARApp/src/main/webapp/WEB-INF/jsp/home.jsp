<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

    <link href="<c:url value="/css/main.css" />" rel="stylesheet">
</head>
<body>
   
<%--  <form:form align="right" id="logoutForm" name="logoutForm" action="../login/register" method="post" modelAttribute="product">
  	<button type="submit" value="logout">Logout</button>
 </form:form> --%>
<script>
function  fetchProdDetails(){
	var prodSelect = document.getElementById("prodSelect");
  	var prodName= prodSelect.options[prodSelect.selectedIndex].value;
 	document.getElementById("homeForm").submit();
 }
 
function  onSubmitButton(){
	//alert("coming soon..")
	
	var prodName= prodSelect.options[prodSelect.selectedIndex].value;
 	document.getElementById("homeForm").submit();
 }
  
</script>  
 <form:form id="homeForm" name="homeForm" action="getProductDetails" method="post" modelAttribute="product">
<h1>Home Page</h1>
<div align="right">
<button type="submit" value="logout" onclick="javascript:form.action='../login/register';" >Logout</button>
</div>
 <legend>Product:</legend>
  <form:select name="prodSelect" path="productName" id="prodSelect" onchange="javascript:fetchProdDetails()">
  <c:set var="counter" value="0" scope="page" />
  <c:forEach items="${productList}" var="productVar">
		    <c:if test="${counter== 0}">
		        <form:option value="N/A" disabled="disabled">--Choose Product--</form:option>
		        <c:set var="counter" value="1"/>
		    </c:if>
  	<form:option value="${productVar.productName}">${productVar.productName}</form:option>
  </c:forEach>
  </form:select>

<c:if test="${showProdDetails == 'Y' }">
  		<legend>Product Details:</legend>
<fieldset>
         <label for="productDL">Product DL: ${product.productDL}</label>
         <label for="productOwner">Product Owner:${product.productOwner}</label>
         <label for="productDescription">Product Owner:${product.productDescription}</label>
</fieldset>
    <legend> Services:</legend>
		<form:select path="apiList[0].apiName" name="apiName" id="apiSelect" >
		    <c:forEach items="${product.apiList}" var="apiOptionList">
		       <form:option value="${apiOptionList.apiName}">${apiOptionList.apiName}</form:option>
		    </c:forEach>
		</form:select>
		<c:forEach items="${product.apiList}" var="api">
		   <legend> Service URL:</legend> <input type="url" name="Service URL:" value="${api.url}">
		   <form:hidden path="apiList[0].url"/>
		<legend>Service Headers:</legend>
		<fieldset>
	  		 <c:forEach items="${api.headers}" var="headerMap">
		       <label for="headerKey">${headerMap.key} : ${headerMap.value}</label>
		    </c:forEach>
		 </fieldset>
		   <legend>Input JSON Template : </legend><textarea rows="4" cols="50" valign="bottom"> ${api.templateJSON}</textarea>
		   <form:hidden path="apiList[0].templateJSON" value="${api.templateJSON}"/>
       </c:forEach>
    <div align="center">
     <!-- <button type="submit" value="Execute API" onclick="onSubmitButton()">Execute API</button> -->
    <button type="submit" value="Execute API" onclick="javascript:form.action='executeApi';">Execute API</button>
     </div>

     <%-- <li>
      Final Json used: ${productJson}
      </li> --%>
      </c:if>   
    
</form:form>
</body>
</html>