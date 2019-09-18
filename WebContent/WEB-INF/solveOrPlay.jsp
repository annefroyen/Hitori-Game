<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

<!DOCTYPE html>
<html>
<style>
body {
	background-image: linear-gradient(to right, white 50%, black 50%); 
	
}

.choose {
	text-align: center;
    vertical-align: middle;
	float: left;
	width: 50%;
	
}

.create {
	text-align: center;
	vertical-align: middle;
	float: right;
	width: 50%;
	color: white;

}
}
</style>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Hitori Game</title>
</head>
<body>



	<div class="choose">
		<h1><a class="fancy-link" href="solver">Solve</a></h1>
		
		
		

<a class="fancy-link" href="solver">Solve</a>


	</div>


	<div class="create">
		

<a class="fancy-link" href="game">Play</a>

	</div>

</body>


</html>