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
html{
scroll-behavior: smooth;
}

body{
 overflow: hidden;
   background: linear-gradient(to right, red 50%, blue 50%);
}
* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 50%;
	height: 100vh;
	text-align: center;
}

.columnTitlePage {
	float: left;
	width: 100%;
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

.titleBtn{
    font-size: 13vw;
	font-family: 'Bungee Shade', Times, serif;
	color:black;
	text-decoration: none;
}

.titleBtn:hover {
	color: white;
}

.sizeBtn{
  border: 2px solid ;
  background-color: white;
  color: black;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;

}
.five {height: 50px; width: 50px;}
.six {height: 60px; width: 60px;}
.seven {height: 70px; width: 70px}
.eight {height: 80px; width: 80px}
.nine {height: 90px; width: 90px}
.ten {height: 100px; width: 100px}

sizeBtn:hover{
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


	<div class="row">
	
	
<div class="columnTitlePage" style="background-color: #e6503f">

				
	<a class = "titleBtn" href="#createOrChoose">HITORI</a>
	</div>
	
	</div>

	
	<div class="row">
		<div class="column" style="background-color: white" id="createOrChoose">
			<h1 class="header">CHOOSE</h1>
				
		<form method="post" class="pure-form pure-form-aligned" id="sizeForm">
			<fieldset>			
			
						
				
				<<input type="radio" name="size" value="5" />
				
				<a href="#solveOrPlay" class="sizeBtn five" ><Button type="submit"   name="size" value="5" >5x5</Button></a>
				<a href="#solveOrPlay"  class="sizeBtn six" type="submit" name="size" value="6">6x6</a>
				<a href="#solveOrPlay" onclick="setParameter(5);" class="sizeBtn seven" type="button" name="size" value="7">7x7</a>
				<a href="#solveOrPlay" onclick="setParameter(5);" class="sizeBtn eight" type="button" name="size" value="8">8x8</a>
				<a href="#solveOrPlay" onclick="setParameter(5);" class="sizeBtn nine" type="button" name="size" value="9">9x9</a>
				<a href="#solveOrPlay" onclick="setParameter(5);" class="sizeBtn ten" type="button" name="size" value="10">10x10</a>
				
			</fieldset>
		</form>
		</div>


		<div class="column" style="background-color: black;">
			<h1 class="header" style="color: white">CREATE</h1>
		
		
<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			
				
				 <input style="color: black" type="text" name="input" placeholder=" Ex: 3 4 10 1 7 6 ..." />
			
			
			<button type="submit" class="pure-button pure-button-primary" name="created">Create</button>
			<a href="#solveOrPlay" class="sizeBtn" type="submit" name="create">Ok</a>
				
			
			<label for="mobil" style="color: white;">*visfeilMeldingHer*</label>
			
			
			
			
		</fieldset>
	</form>
		</div>
		</div>
		
		<div class="row">
		
		<div class="column" style="background-color: white" id="solveOrPlay">
			<form method="post" class="pure-form pure-form-aligned">
				<fieldset>
					
						<button onclick="submit(#sizeForm)" type="submit" class="btn play" name="play">PLAY</button>
				
				</fieldset>
			</form>
		</div>


		<div class="column" style="background-color: black;">
			<form method="post" class="pure-form pure-form-aligned">
				<fieldset>
						<button type="submit" class="btn solve" name="solve">SOLVE</button>
				</fieldset>
			</form>
		</div>
	</div>

</body>
</html>
