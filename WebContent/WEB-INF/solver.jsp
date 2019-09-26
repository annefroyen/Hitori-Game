<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Bungee Shade'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<style>
* {
	box-sizing: border-box;
	color: white;
	background-color: black;
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

.homeBtn{
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
	font-size: 2vmin;
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
	margin-left:auto; 
    margin-right:auto;
    font-size: 3vmin;
	
}

td {
	border: 1px solid #7f7f7f;
	width: 10vmin;
	height: 10vmin;
	text-align: center;
}

	.button_light{
  background-color: white;
  color:black;
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

.button_dark{
  background-color:black;
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

.button_light:hover{
background-color: black;
color: white;

}


.button_dark:hover{
background-color: white;
color: black;

}

.homeBtn{

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
							<td id="element"  
								class="${cell.colour} ${cell.correct}">${cell.number}</td>
								
								<input type="hidden" name ="${cell}" />
						</c:forEach>
					</tr>
				</c:forEach>
			</table>

<P></P>




			<form action="${pageContext.request.contextPath}/solver" method="post">

          	<p>
          	
			<input class="button_dark" type="submit" name="solve" value="solve" />
			<input class="button_dark" type="submit" name="stepByStepSolve" value="step-by-step solve" <c:if test="${sbsDisabled == true}"><c:out value="disabled='disabled'"/></c:if> /> 
			<input class="button_dark" type="submit" name="reset" value="reset" />
		
			
			</p>
			
			
		</form>
			
		</div>
	</div>

	<div class="column">
		<div class="rightDiv">
		
			<form action="${pageContext.request.contextPath}/game" method="post">
               <div>
               <button type="submit" class = "homeBtn" name="home"> 
               <i class="glyphicon glyphicon-home " style="font-size: 4vmin; color: white;"></i></button>
		
               </div>
					</form>

			
			<p style ="font-weight: bold;">Starting Techniques</p>
			<p><span class= "${solver.sandwichPair} ? "true" : "false"">&#10004;</span> Sandwich Pair</p>
			<p><span class= "${solver.adjacentTriplets} ? "true" : "false"">&#10004;</span> Adjacent Triplets</p>
			<p><span class= "${solver.pairInduction} ? "true" : "false"">&#10004;</span> Pair Induction</p>
			<p><span class= "${solver.doubleCorner} ? "true" : "false"">&#10004;</span> Double Corner</p>
		    <p><span class= "${solver.impossiblePair} ? "true" : "false"">&#10004;</span> Impossible Pair</p>
		
			<p style ="font-weight: bold;">Shading and Un-Shading</p>
			<p><span class= "${solver.shadingAndUnshadingAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.shadingAndUnshading} ? "true" : "false"">&#10004;</span> Shading and Un-Shading</p>
		
		    <p style ="font-weight: bold;">Avoiding Isolation</p>
			<p><span class= "${solver.cornerCloseAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.cornerClose} ? "true" : "false"">&#10004;</span> Corner close</p>
		    <p><span class= "${solver.edgeCloseAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.edgeClose} ? "true" : "false"">&#10004;</span> Edge Close</p>
		    <p><span class= "${solver.quadMiddleAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.quadMiddle} ? "true" : "false"">&#10004;</span> Quad Middle</p>
		    
		    <p style ="font-weight: bold;">Advanced Techniques</p>
		    <p><span class= "${solver.cornerTechniquesAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.cornerTechniques} ? "true" : "false"">&#10004;</span> Corner Techniques</p>
		    <p><span class= "${solver.advancedTechniqueOneAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.advancedTechniqueOne} ? "true" : "false"">&#10004;</span> Advanced Technique One</p>
		    <p><span class= "${solver.advancedTechniqueTwoAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.advancedTechniqueTwo} ? "true" : "false"">&#10004;</span> Advanced Technique Two</p>
		   <p><span class= "${solver.advancedTechniqueThreeAgain} ? "true" : "false"">&#10004;</span><span class= "${solver.advancedTechniqueThree} ? "true" : "false"">&#10004;</span> Advanced Technique Three</p>
	
		   
		    <p style ="font-weight: bold;">Solution: <input type="text" value="${solver.solution}"><br> </p>
		  
		
		
		</div>





	</div>




	<script>
	 
		function changeColour(element) {
			if (element.className == "BLACK") {
				element.className = "COLOURED";
				element.setColour(ColourEnum.BLACK);
				${cell.setColour(ColourEnum.BLACK)};
			} else if (element.className == "COLOURED") {
				element.className = "WHITE";
			} else if (element.className = "WHITE") {
				element.className = "BLACK";
			}
		}
		
		function isSPExecuted() {
			
			if(${solver.sandwichPair}){
				document.getElementById(sandwichPairResult).innerHTML = <span style="color: #3ae80e">&#10004;</span>;
			}
		}
			
		}

		function findColour(element) {
			if (element.isBlacked()) {
				element.className = "BlackBackground";
			} else if (element.isColored()) {
				element.className = "redBackground"
			}

			function show() {

				document.getElementById("demo").innerHTML = "check text";
			}

		}
	</script>

</body>



</html>