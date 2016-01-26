<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
   <h1>Home Page</h1>
 <script>
function  jsFunction(){
	var prodSelect = document.getElementById("prodSelect");
	var apiSelect = document.getElementById("apiSelect");
  alert(prodSelect.options[prodSelect.selectedIndex].value + apiSelect.options[apiSelect.selectedIndex].value);
  
  apiSelect.style.display = 'none'; //or
}

</script>  
 <form:form name="homeForm" action="homeForm" method="post" modelAttribute="product">
  Product: 
  <select name="productName" id="prodSelect" onchange="jsFunction()">
  <c:forEach items="${productList}" var="productVar">
  	<option value="${productVar.productName}">${productVar.productName}</option>
  </c:forEach>
  </select>
  <br/>
  <c:forEach items="${productList}" var="productVar">
  Product Details: 
    <ul>
       <li>
         <form:label path="productDL">Product DL:</form:label>${productVar.productDL}
         <form:label path="productOwner">Product Owner:</form:label>${productVar.productOwner}
         <form:label path="productDescription">Product Owner:</form:label>${productVar.productDescription}
      </li>
      <li>
      API List: 
		<select name="apiName" id="apiSelect" >
		    <c:forEach items="${productVar.apiList}" var="apiOptionList">
		        <option value="${apiOptionList.apiName}">${apiOptionList.apiName}</option>
		    </c:forEach>
		</select>
		<br/>
	</li>	
		<br/>
		<c:forEach items="${productVar.apiList}" var="api">
		
		<li>Headers:
	  		 <c:forEach items="${api.headers}" var="headerMap">
		       ${headerMap.key} : ${headerMap.value}
		       <br/>
		    </c:forEach>
		    </li>
		     <li>
		   Service URL: ${api.url}
		    </li>
		   <br/> 	
		   <li>	   
		   Input JSON Template : <input placeholder=" ${api.templateJSON} "/>
		   </li> 
		   <br/>
       </c:forEach>
      	</li>
      	
       
    </ul>
    </c:forEach>
    
     <li>
      Product Json: ${productJson}
      </li>
</form:form>

</body>
</html>