<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/Header.jsp" />

<section id="main-content">
	<h1 id="toy-dep">Toy Department</h1>
	<c:forEach var="product" items="${productList}">
		<ul id="product-box">

			<c:url var="detailsHref" value="/productDetail">
				<c:param name="productId">${product.productId}</c:param>
			</c:url>

			<a href="${detailsHref}" ${product.productId}>

				<div id="toy-image">
					<img src="<c:url value="img/${product.imageName}"/>" />
				</div>
			</a>
			<div id="product-details">

				<a href="${detailsHref}" ${product.productId}><li>${product.name}</a>
				<c:if test="${product.topSeller}">
					<span class="best-seller"> BEST SELLER!</span>
				</c:if>
				</li>

				<li>${product.manufacturer}</li>

				<c:if test="${product.remainingStock < 4}">
					<li class="only">Only 2 left!</li>
				</c:if>

				<li class="price">$${product.price}</li>

				<li><span id="weight">Weight:</span> ${product.weightInLbs} lbs</li>

				<c:choose>
					<c:when test="${product.averageRating < 2}">
						<img class="stars" src="<c:url value="img/1-star.png"/>" />
					</c:when>
					<c:when test="${product.averageRating < 3}">
						<img class="stars" src="<c:url value="img/2-star.png"/>" />
					</c:when>
					<c:when test="${product.averageRating < 4}">
						<img class="stars" src="<c:url value="img/3-star.png"/>" />
					</c:when>
					<c:when test="${product.averageRating < 5}">
						<img class="stars" src="<c:url value="img/4-star.png"/>" />
					</c:when>
					<c:otherwise>
						<img class="stars" src="<c:url value="img/5-star.png"/>" />
					</c:otherwise>
				</c:choose>

			</div>

		</ul>
	</c:forEach>

</section>
</body>
</html>