<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />


	<body>
		
		<c:forEach var="review" items="${allReviews}">
			<ul>
				<li>${review.username}</li>
				<li>${review.rating}</li>
				<li>${review.dateSubmitted}</li>
				<li>${review.text}</li>
			</ul>
		</c:forEach>
		
		<h1>Would you like to submit a review for Squirrel Cigar Parties for Dummies?</h1>
		<h2>Click <a href="reviewForm">HERE</a> if that is the case.</h2>
		
		
<c:import url="/WEB-INF/jsp/footer.jsp" />


