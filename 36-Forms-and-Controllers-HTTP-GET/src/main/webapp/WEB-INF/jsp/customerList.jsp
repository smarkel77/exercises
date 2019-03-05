<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/customerList/results" />

<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="search">Search:</label> 
		<input type="text" name="search" /> 
		<label for=sort>Sort:</label> 
		<select name="sort">
			<option value="last_name">Last Name</option>
			<option value="email">Email</option>
			<option value="active">Active</option>
		</select>
	</div>
	<input class="formSubmitButton" type="submit" />
	</div>
</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach items="${customers}" var="customer">
		<tr>
			<td>${customer.firstName} ${customer.lastName}</td>
			<td>${customer.email}</td>
			<td>${customer.active}</td>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>