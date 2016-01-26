<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
   <h1 align="Center">Home Page</h1>
 <form:form id="logoutForm" name="logoutForm" action="../login/register" method="post" modelAttribute="product">
  <p align="right">
  <input type="submit" value="logout" >
  </p>
 </form:form>
 
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
 <fieldset>
  		<legend>OAR Tool</legend>
 
 <form:form id="homeForm" name="homeForm" action="getProductDetails" method="post" modelAttribute="product">
   Product: 
  <form:select name="prodSelect" path="productName" id="prodSelect" onchange="javascript:fetchProdDetails()">
  <c:forEach items="${productList}" var="productVar">
		    <c:if test="${productVar.index = 0}">
		        <form:option value="N/A}" disabled="disabled">--Choose Product--</form:option>
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
      API List: 
		<select name="apiName" id="apiSelect" >
		    <c:forEach items="${product.apiList}" var="apiOptionList">
		        <option value="${apiOptionList.apiName}">${apiOptionList.apiName}</option>
		    </c:forEach>
		</select>
		<br/>
	</li>	
		<br/>
		<fieldset>
  		<legend>API Details</legend>
		<c:forEach items="${product.apiList}" var="api">
		  <li>
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

     <li>
      Final Json used: ${productJson}
      </li>
      </c:if>   
    
</form:form>
</fieldset>
</body>
</html>