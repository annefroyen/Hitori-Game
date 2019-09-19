<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Bungee Shade'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<style>
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 50%;
	height: 100vh;
	text-align: center;
}


@media screen and (max-width: 600px) {
	.column {
		width: 100%;
		height: 50vh;
	}
}

.header {
	font-size: 5vw;
	font-family: 'Bungee Shade', Times, serif;
}

.titleBtn {
	font-size: 13vw;
	font-family: 'Bungee Shade', Times, serif;
	color: black;
	text-decoration: none;
}

.titleBtn:hover {
	color: white;
}

.sizeBtn {
	border: 2px solid;
	background-color: white;
	color: black;
	padding: 14px 28px;
	font-size: 16px;
	cursor: pointer;
}

.five {
	height: 50px;
	width: 50px;
}

.six {
	height: 60px;
	width: 60px;
}

.seven {
	height: 70px;
	width: 70px
}

.eight {
	height: 80px;
	width: 80px
}

.nine {
	height: 90px;
	width: 90px
}

.ten {
	height: 100px;
	width: 100px
}

sizeBtn:hover {
	background-color: #e6503f;
	color: white;
}

.btn {
	font-size: 10vw;
	font-family: 'Bungee Shade', Times, serif;
	border: none;
	background-color: inherit;
}

.btn:hover {
	color: #e6503f;
}

.play {
	color: black;
}

.solve {
	color: white;
}
</style>
</head>

<body>


	

	
		<div class="column">
			<p>rules</p>
			<p>rules</p>
			<p>rules</p>
			<p>rules</p>
			<p>rules</p>
			<p>rules</p>
			
			<p>rules</p>
			
		</div>


		<div class="column">
			

	<div class="leftSide">
		<c:set var="numCols" value="${board.size}" />
		<c:set var="numRows" value="${board.size}" />
		<c:set var="rowCount" value="0" />


		<table id="GameTable">
			<tr>
				<c:forEach items="${board.squares}" var="tall" varStatus="loop">
					<tr>
						<c:forEach items="${tall}" var="cell">


							<td id="element" class="${cell.colour}"
								>${cell.number}</td>
						</c:forEach>
					</tr>
				</c:forEach>
			</tr>
		</table>

		<p></p>


		<c:forEach items="${board.squares}" var="row">
			<tr>
				<c:forEach items="${row}" var="cell">
					<td>${cell.getNumber()}</td>
				</c:forEach>

			</tr>
		</c:forEach>




		<form action="${pageContext.request.contextPath}/solver" method="post">

			<input type="submit" name="hint" value="hint" /> 
			<input type="submit" name="check" value="check" />
			<input type="submit" name="show-solution" value="show solution" /> 
			<input type="submit" name="reset" value="reset" />


		</form>


	</div>
		</div>
	



	<script>
		function myFunction() {
			document.getElementById("solveText").innerHTML = "This is solveText";
		}

		

		function findColour(element) {
			if (element.isBlacked()) {
				element.className = "BlackBackground";
			} else if (element.isColored()) {
				element.className = "redBackground"
			}

			function check() {

				document.getElementById("demo").innerHTML = "check text";
			}

		}
	</script>
	
	</body>
</html>
