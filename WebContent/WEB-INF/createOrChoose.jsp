<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

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
	font-size: 10vw;
	font-family: 'Bungee Shade', Times, serif;
}


</style>
</head>

<body>

	<div class="row">
		<div class="column" style="background-color: white">
			
			
			<h1 class="header">CHOOSE</h1>
				
		<form method="post" class="pure-form pure-form-aligned">
			<fieldset>


				<table style="width: 100%">
					<tr>
						<th>5 x 5</th>
						<th>6 x 6</th>
						<th>7 x 7</th>
						<th>8 x 8</th>
						<th>9 x 9</th>
						<th>12 x 12</th>
					</tr>
					<tr>
						<th><input type="radio" name="size" value="5" checked /></th>
						<th><input type="radio" name="size" value="6" /></th>
						<th><input type="radio" name="size" value="7" /></th>
						<th><input type="radio" name="size" value="8" /></th>
						<th><input type="radio" name="size" value="9" /></th>
						<th><input type="radio" name="size" value="12" /></th>
					</tr>
				</table>


				<button type="submit" name="NewGame">New Game</button>


			</fieldset>
		</form>
		</div>


		<div class="column" style="background-color: black;">
			<h1 class="header" style="color: white">CREATE</h1>
		
		
<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="mobil">*visfeilMeldingHer*</label> <input style="color: black" type="text" name="input" />
			
		
			
			<button type="submit" class="pure-button pure-button-primary" name="created">Create</button>
			<a href="solveOrPlay.html">Solve or Play</a> 
			</div>
			
			
		</fieldset>
	</form>
		</div>
	</div>

</body>
</html>
