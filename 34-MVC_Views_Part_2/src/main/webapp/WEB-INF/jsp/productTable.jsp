<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/Header.jsp" />

<section id="main-content">
	<h1 id="department">Toy Department</h1>
	<table>
		<tr>
			<th id="columns"></th>
			<c:forEach var="product" items="${productList}">
				<c:url var="detailsHref" value="/productDetail">
					<c:param name="productId">${product.productId}</c:param>
				</c:url>
				<th id="columns"><a href="${detailsHref}" ${product.productId}><img id="table-image"
					src="<c:url value="img/${product.imageName}"/>" /> </a><c:if
						test="${product.topSeller}">
						<p class="best-seller">BEST SELLER!</p>
					</c:if></th>
			</c:forEach>


		</tr>
		<tr>
			<td class="name-column">Name</td>
			<c:forEach var="product" items="${productList}">
			<c:url var="detailsHref" value="/productDetail">
					<c:param name="productId">${product.productId}</c:param>
				</c:url>
				<td><a href="${detailsHref}" ${product.productId}>${product.name}</a></td>
			</c:forEach>
		</tr>
		<tr>
			<td class="name-column">Rating</td>
			<c:forEach var="product" items="${productList}">
				<c:choose>
					<c:when test="${product.averageRating < 2}">
						<td><img class="table-stars"
							src="<c:url value="img/1-star.png"/>" /></td>
					</c:when>
					<c:when test="${product.averageRating < 3}">
						<td><img class="table-stars"
							src="<c:url value="img/2-star.png"/>" /></td>
					</c:when>
					<c:when test="${product.averageRating < 4}">
						<td><img class="table-stars"
							src="<c:url value="img/3-star.png"/>" /></td>
					</c:when>
					<c:when test="${product.averageRating < 5}">
						<td><img class="table-stars"
							src="<c:url value="img/4-star.png"/>" /></td>
					</c:when>
					<c:otherwise>
						<td><img class="table-stars"
							src="<c:url value="img/5-star.png"/>" /></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</tr>
		<tr>
			<td class="name-column">Mfr</td>
			<c:forEach var="product" items="${productList}">
				<td>${product.manufacturer}</td>
			</c:forEach>
		</tr>
		<tr>
			<td class="name-column">Price</td>
			<c:forEach var="product" items="${productList}">
				<td class="price">$${product.price}</td>
			</c:forEach>
		</tr>
		<tr>
			<td class="name-column">wt. (in lbs)</td>
			<c:forEach var="product" items="${productList}">
				<td>${product.weightInLbs}</td>
			</c:forEach>
		</tr>
	</table>




</section>
</body>
</html>