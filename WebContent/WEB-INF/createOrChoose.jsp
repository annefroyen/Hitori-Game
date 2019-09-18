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
		<h1>Choose</h1>


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


	<div class="create">
		<h1>Create</h1>
		
		
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

</body>


</html>
