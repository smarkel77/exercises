<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/actorList/results" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="search">Name</label>
		<input type="text" name="search" />
	</div>
	<input class="formSubmitButton" type="submit" />
</form>
<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actors}" var="actor">
		<tr>
			<td>${actor.firstName} ${actor.lastName}</td>
		</tr>
	</c:forEach>
</table>
<%@include file="common/footer.jspf"%>