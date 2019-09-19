<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hitori Game</title>
<style>
body {
	background: black;
}

.COLOURED {
	background: #e6503f;
	color: white;
}

.BLACK {
	background: #2b2b2b;
	color: white;
}

.WHITE {
	background: white;
}

#div1 {
	margin: 10px;
	font-size: 1.25em;
}

table {
	border-collapse: collapse;
	border: 1px solid #7f7f7f;
}

td {
	border: 1px solid #7f7f7f;
	width: 50px;
	height: 50px;
	text-align: center;
}

.leftSide {
	text-align: center;
	vertical-align: middle;
	float: left;
	width: 50%;
}

.rightSide {
	text-align: center;
	vertical-align: middle;
	float: right;
	width: 50%;
	color: white;
	
	}
	div
	>div
	{
	margin-left
	:
	2em;
}
</style>
</head>
<body>



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

				<input type="submit" name="quick solve" value="quick solve" /> 
			<input type="submit" name="slow solve" value="slow solve" />
			<input type="submit" name="step-by-step solve" value="steå-by-step solve" /> 
			<input type="submit" name="reset" value="reset" />
				


		</form>

		<button onClick="check()">check</button>
		<p id="solveText"></p>

	</div>


	<div class="rightSide">


		<div class="printMethods">
			<p>Sandwich: ${solver.sandwichPair}</p>
			<p>three in a row: ${solver.adjacentTriplets}</p>
			<p>shading: ${solver.shading}</p>
			<p></p>
			<p></p>
			<p></p>
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