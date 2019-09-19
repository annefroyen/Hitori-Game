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
		<div class="column" style="background-color: white">
			<form method="post" class="pure-form pure-form-aligned">
				<fieldset>
					
						<button type="submit" class="btn play" name="play">PLAY</button>
				
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