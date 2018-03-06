<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/alienAgeOutput" />
	<form method="GET" action="${formAction}">

		<h2>Alien Age Calculator</h2>

		<div class="formInputGroup">
			<label for="choosePlanet">Choose a planet</label> <select
				name="choosePlanet" id="choosePlanet">
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
			<label for="earthAge">Enter your Earth age</label> <input type="text"
				name="earthAge" id="earthAge" />
		</div>
		<div class="formInputGroup">
		<label></label>
			<input class="formSubmitButton" type="submit" value="Calculate Age" />
		</div>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />