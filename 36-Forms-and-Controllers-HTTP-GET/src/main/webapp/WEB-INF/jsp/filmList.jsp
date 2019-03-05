<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmList/results" />

<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="minLength">Minimum Length:</label> 
		<input type="text" name="minLength" />
	    <label for="maxLength">Maximum Length:</label>
	    <input type="text" name="maxLength" />

		<div>

			<label for=genre>Genre:</label> 
			<select name="genre">
			
				<c:forEach  var="category" items="${categories}" >
					<option value="${category}">${category}</option>
				</c:forEach>
			</select> 
		</div>
		<input class="formSubmitButton" type="submit" />
	</div>
</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Description</th>
		<th>Release Year</th>
		<th>Length</th>
		<th>Rating</th>
	</tr>
	<c:forEach items="${films}" var="film">
		<tr>
			<td>${film.title}</td>
			<td>${film.description}</td>
			<td>${film.releaseYear}</td>
			<td>${film.length}</td>
			<td>${film.rating}</td>
		</tr>
	</c:forEach>
</table>
<%@include file="common/footer.jspf"%>