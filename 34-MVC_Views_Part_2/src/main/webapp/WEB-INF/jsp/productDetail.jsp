<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/Header.jsp" />


<section id="main-content">
	<div class="main">
		<div>
			<img src="<c:url value="img/${product.imageName}"/>" />
		</div>
		<div id="cheese">
			<li>${product.name}<c:if test="${product.topSeller}">
					<span class="best-seller"> BEST SELLER!</span>
				</c:if>
			</li>

			<li>${product.manufacturer}</li>

			<c:choose>
				<c:when test="${product.averageRating < 2}">
					<img class="starss" src="<c:url value="img/1-star.png"/>" />
				</c:when>
				<c:when test="${product.averageRating < 3}">
					<img class="starss" src="<c:url value="img/2-star.png"/>" />
				</c:when>
				<c:when test="${product.averageRating < 4}">
					<img class="starss" src="<c:url value="img/3-star.png"/>" />
				</c:when>
				<c:when test="${product.averageRating < 5}">
					<img class="starss" src="<c:url value="img/4-star.png"/>" />
				</c:when>
				<c:otherwise>
					<img class="starss" src="<c:url value="img/5-star.png"/>" />
				</c:otherwise>
			</c:choose>
			<li><c:if test="${product.remainingStock < 4}">
					<li class="only">Only 2 left!</li>
				</c:if></li>
			<li class="price">$${product.price}</li>
			<li><span id="weight">Weight:</span> ${product.weightInLbs} lbs</li>
			<li>${product.description}</li>
		</div>
	</div>

</section>



