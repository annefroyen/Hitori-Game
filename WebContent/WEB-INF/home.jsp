<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>

<!DOCTYPE html>
<html>
<style>
body {
  background: orange;
}

.content {

  margin: auto;
  padding: 10px;
   text-align:center;
  }
  
.info {

 
 }
 
}
</style>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Hitori</title>
</head>
<body>
	<h2>New Game</h2>
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="size">Fornavn:</label> <input type="text"
					name="fornavn" value="${skjema.fornavn}" /> 
					<font color="red">${skjema.fornavnFeilmelding}</font>
			</div>
		
			
			<div class="pure-control-group">
				<label for="difficulty">Difficulty:</label> <input type="radio" name="kjonn"
					value="easy" ${skjema.easychecked}
					 />easy
				<input type="radio" name="difficulty" value="medium" ${skjema.mediumchecked}
					 />medium
				<font color="red">${skjema.difficultyError}</font>
			</div>
			
			
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary">New Game</button>
			</div>
		</fieldset>
	</form>
	
	
	
	
	
<div class="content">
<h1>New Game Scene</h1>


<table style="width:100%">
  <tr>
    <th>Easy</th>
    <th>Medium</th> 
    <th>Hard</th>
  </tr>
  <tr>
    <th><input type="radio" id="easy" name="drone" value="easy"></th>
    <th><input type="radio" id="medium" name="medium" value="medium"></th>
    <th><input type="radio" id="hard" name="hard" value="hard"></th>
  </tr>
</table>



<div>
 <input type="range" min="1" max="100" value="50">
</div>

<div>

<button type="button">New Game!</button>
<button type="button">Random Game!</button>
</div>

</div>
</body>
</html>
