<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<c:set var = "n1" value = "0" />
			<c:set var = "n2" value = "1" />
			<li>${n1}</li>
			<li>${n2}</li>
			<c:forEach begin = "1" end = "24">
				<c:set var = "n3" value = "${n1 + n2}" />
				<li> ${n3} </li>
				<c:set var = "n1" value = "${n2}" />
				<c:set var = "n2" value = "${n3}" />
			</c:forEach>
		</ul>
	</body>
</html>