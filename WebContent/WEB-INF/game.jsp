<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Hitori Game</title>
<style>
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

div>div {
	margin-left: 2em;
}
</style>
</head>
<body>

	<c:set var="numCols" value="${board.size}" />
	<c:set var="numRows" value="${board.size}" />
	<c:set var="rowCount" value="0" />


	<table id="GameTable">
		<tr>
			<c:forEach items="${board.squares}" var="tall" varStatus="loop">
				<tr>
					<c:forEach items="${tall}" var="cell">
					
				 
					<td id ="element" class="${cell.colour}" onclick="changeColour(this)">${cell.number}</td>
			
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




	<form action="${pageContext.request.contextPath}/game" method="post">

		<input type="submit" name="hint" value="hint" /> <input type="submit"
			name="solve" value="solve" />
	</form>

	<button onClick="check()">check</button>
	<p id="solveText"></p>





	<script>
function myFunction(){
	document.getElementById("solveText").innerHTML = "This is solveText";
}

function changeColour(element) {
	if (element.className == "BLACK") {
		element.className = "COLOURED";
	} else if (element.className == "COLOURED") {
		element.className = "WHITE";
	} else if (element.className = "WHITE") {
		element.className = "BLACK";
	}
}
	

function findColour(element){
	if(element.isBlacked()){
		element.className = "BlackBackground";
	}else if( element.isColored()){
		element.className = "redBackground"
	}
}


function check(){

	var table = document.getElementById("gameTable");
	for (var i = 0, cell; cell = table.cells[i]; i++) {
	   
		//
		//table.cells[i]
	   //if  test = " ${colour[i]} == table.cells[i].getColour()"
	      //set text colour green.
	    // c:if
	    // -->
	}
	
	
}

</script>
</body>
</html>