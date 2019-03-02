<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product Views</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
<c:url value="/productTable" var="TableURL" />
<c:url value="/productList" var="ListURL" /> 
<c:url value="/productTiles" var="TilesURL" />
    <nav>
    		<ul>
    			<li><a href="${ListURL}">List</a></li>
    			<li><a href="${TableURL}">Table</a></li>
    			<li><a href="${TilesURL}">Tiles</a></li>
    		</ul>
    </nav>
    
    <h1><c:out value="${param.pageTitle }" /></h1>