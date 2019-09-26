<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Bungee Shade'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
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
	.leftDiv {
		margin-bottom: 60px;
	}
	.homeBtn {
		position: absolute;
		bottom: 50px;
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

sizeBtn:hover {
	background-color: #e6503f;
	color: white;
}

.leftDiv {
	text-align: center;
	font-size: 3vmin;
	padding: 10%;
}

.rightDiv {
	text-align: left;
	font-size: 3vmin;
	font-style: Helvetica;
	padding: 10%;
}

.true {
	color: #16de4c;
}

.false {
	color: black;
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
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	font-size: 3vmin;
}

td {
	border: 1px solid #7f7f7f;
	width: 10vmin;
	height: 10vmin;
	text-align: center;
}

.button_light {
	background-color: white;
	color: black;
	padding: 10px 24px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 3vmin;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 10px;
	border: 2px solid black;
}

.button_dark {
	background-color: black;
	color: white;
	padding: 10px 24px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 14px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 10px;
	border: 1px solid white;
}

.button_light:hover {
	background-color: black;
	color: white;
}

.button_dark:hover {
	background-color: white;
	color: black;
}

.homeBtn {
	background-color: transparent;
	border: none;
	outline: 0;
	float: right;
}
</style>
</head>

<body>

	<div class="column">
		<div class="leftDiv">
			<table>
				<c:forEach items="${board.squares}" var="row">
					<tr>
						<c:forEach items="${row}" var="cell">
							<td id="element" onclick="changeColour(this);"
								class="${cell.colour} ${cell.correct}">${cell.number}</td>

							<input type="hidden" name="${cell}" />
						</c:forEach>
					</tr>
				</c:forEach>
			</table>

			<P></P>




			<form action="${pageContext.request.contextPath}/game" method="post">

				<input type="submit" class="button_light" name="hint" value="hint" />
				<input type="submit" class="button_light" name="check" value="check" />
				<input type="submit" class="button_light" name="showSolution"
					value="show solution" /> <input type="submit" class="button_light"
					name="reset" value="reset" />


			</form>
		</div>
	</div>

	<div class="column">
		<div class="rightDiv">

			<form action="${pageContext.request.contextPath}/game" method="post">
				<div>
					<button type="submit" class="homeBtn" name="home">
						<i class="glyphicon glyphicon-home " style="font-size: 4vmin;"></i>
					</button>

				</div>
			</form>

			<h1>Rules:</h1>
			<p>1. No number appears in a row or column more than once.</p>
			<p>2. Shaded (black) squares do not touch each other vertically
				or horizontally.</p>
			<p>3. When completed, all un-shaded (coloured) squares create a
				single continuous area.</p>

		</div>

	</div>

	<script>
	
		function changeColour(element) {
			if (element.className == "BLACK") {
				element.className = "COLOURED";
			} else if (element.className == "COLOURED") {
				element.className = "WHITE";
			} else if (element.className = "WHITE") {
				element.className = "BLACK";
			}
		}

		function check() {

		}
	</script>

</body>
</html>
