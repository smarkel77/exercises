<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/header.jsp" />
<c:url var="formAction" value="/reviewForm" />
<form method="POST" action="${formAction}">
	<div class="formInputGroup">
		<div>
			<label for="username">Username</label> <input type="text"
				name="username" />
		</div>
		<div>
			<select name="rating">
				<option value="0">0 Star Rating</option>
				<option value="1">1 Star Rating</option>
				<option value="2">2 Star Rating</option>
				<option value="3">3 Star Rating</option>
				<option value="4">4 Star Rating</option>
				<option value="5">5 Star Rating</option>
			</select>
		</div>
		<div>
			<label for="title">Rating Title</label> <input type="text"
				name="title" />
		</div>
		<div>
			<textarea name="text" cols="40" rows="5">Write review here</textarea>
		</div>
	</div>
	<input class="formSubmitButton" type="submit" />
</form>

<c:import url="/WEB-INF/jsp/footer.jsp" />