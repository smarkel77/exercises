<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="pageTitle" value="Registration"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>
<c:url var="formAction" value="/newUser" />
<form:form method="POST" action="${formAction}" modelAttribute="newUser">
	
		<div>
			<label for="firstName">First Name</label> 
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
		</div>
		<div>
			<label for="lastName">Last Name</label> 
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</div>
		<div>
			<label for="email">Email</label> 
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
		</div>
		<div>
			<label for="confirmEmail">Confirm Your Email</label> 
			<form:input path="confirmEmail" />
			<form:errors path="confirmEmail" cssClass="error" />
		</div>
		<div>
			<label for="password">Password</label> 
			<form:input path="password" />
			<form:errors path="password" cssClass="error" />
		</div>
		<div>
			<label for="birthDate">Birth Date</label> 
			<form:input path="birthDate" />
			<form:errors path="birthDate" cssClass="error" />
		</div>
		<div>
			<label for="numOfTickets"># of Tickets</label> 
			<form:input path="numOfTickets" />
			<form:errors path="numOfTickets" cssClass="error" />
		</div>
		<div>
			<input class="formSubmitButton" type="submit" />
		</div>
	
</form:form>



<%@include file="common/footer.jspf" %>