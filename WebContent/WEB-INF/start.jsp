<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<link rel="icon" type="image/png" sizes="32x32"
	href="/favicon-32x32.png">

<link href='https://fonts.googleapis.com/css?family=Bungee Shade'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<style>
html {
	scroll-behavior: smooth;
}

body {
	overflow: hidden;
	background: #e6503f;
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

*:focus {
	outline: none !important
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

.radio-toolbar {
	margin: 10px;
}

.radio-toolbar input[type="radio"] {
	opacity: 0;
	position: fixed;
	width: 0;
}

.radio-toolbar label {
	display: inline-block;
	background-color: #ddd;
	padding: 10px 20px;
	font-family: sans-serif, Arial;
	font-size: 16px;
	border: 2px solid #444;
	border-radius: 4px;
	
	
}

.radio-toolbar label:hover {
	background-color: #e6503f;
}

.radio-toolbar input[type="radio"]:checked+label {
	background-color: #e6503f;
	border-color: black;
}


	.button_light{
  background-color: white;
  color:black;
  padding: 10px 24%;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 14px;
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
  border: 2px solid white;
}

.button_light:hover{
background-color: black;
color: white;

}


.button_dark:hover{
background-color: white;
color: black;

}
</style>
</head>

<body>
	<form method="post" class="pure-form pure-form-aligned" id="chooseForm">
		<fieldset>




			<div class="columnTitlePage" style="background-color: #e6503f">


				<a class="titleBtn" href="#createOrChoose">HITORI</a>
			</div>



			<div class="row">
				<div class="column" style="background-color: white"
					id="createOrChoose">
					<h1 class="header">CHOOSE</h1>


					<div class="radio-toolbar">
						<input type="radio" id="radioFive" name="size" value="5">
						<label for="radioFive">5x5</label> <input type="radio"
							id="radioSix" name="size" value="6"> <label
							for="radioSix">6x6</label> <input type="radio" id="radioSeven"
							name="size" value="7"> <label for="radioSeven">7x7</label>

						<input type="radio" id="radioEight" name="size" value="8">
						<label for="radioEight">8x8</label> 
						
						
						<a href="#solveOrPlay" class="button_light" type="submit"> Next</a>
						
					</div>

					

				</div>


				<div class="column" style="background-color: black;">
					<h1 class="header" style="color: white">CREATE</h1>



					<input style="color: black" type="text" name="createInput" id="numbers"
						placeholder=" Ex: 3 4 10 1 7 6 ..." /> <a href="#solveOrPlay"
						class="button_dark" type="submit" >Ok</a> 
						
						<p><label for="numbers" style="color: white;">*visfeilMeldingHer*</label></p>




				</div>
			</div>

			<div class="row">

				<div class="column" style="background-color: white" id="solveOrPlay">


					<button type="submit" class="btn play" name="play">PLAY</button>
					<p>(Ikke implementert, kun UI)</p>


				</div>


				<div class="column" style="background-color: black;">

					<button type="submit" class="btn solve" name="solve">SOLVE</button>

				</div>
			</div>


		</fieldset>
	</form>

	<script>

var numbers [];
function JSArray(){
	numbersvalue = document.getElementById('numbers').value;
	  items.push(numbersvalue);  
	  console.log(items);
	
}

function submitForms(){
	    document.getElementById("chooseForm").submit();
	    document.getElementById("createForm").submit();
	}
	
</script>
</body>
</html>
