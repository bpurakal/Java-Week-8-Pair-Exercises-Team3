<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<h1>Enter Alien Age</h1>

<c:url var="formAction" value="/alienAgeOutput"/>
<form method="GET" action="${formAction}">

	<div class="formInputGroup">
		<label for="choosePlanet">Choose a planet</label>
		<select name="choosePlanet" id="choosePlanet">
			<option value="Mercury">Mercury</option>
			<option value="Venus">Venus</option>
			<option value="Earth">Earth</option>
			<option value="Mars">Mars</option>
			<option value="Jupiter">Jupiter</option>
			<option value="Saturn">Saturn</option>
			<option value="Neptune">Neptune</option>
			<option value="Uranus">Uranus</option>
		</select>
	</div>
	<div class="formInputGroup">
	<label for="earthAge">Enter your Earth age</label>
	<input type="text" name="earthAge" id="earthAge"/>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Calculate Age"/>

</form>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />