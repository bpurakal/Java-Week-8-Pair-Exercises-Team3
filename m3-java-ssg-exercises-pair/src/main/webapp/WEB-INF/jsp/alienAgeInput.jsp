<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/alienAgeOutput" />
	<form method="GET" action="${formAction}">

		<h2>Alien Age Calculator</h2>

		<div class="formInputGroup">
			<label for="choosePlanet">Choose a planet</label> <select
				name="choosePlanet" id="choosePlanet">
				<option value="mercury">Mercury</option>
				<option value="venus">Venus</option>
				<option value="earth">Earth</option>
				<option value="mars">Mars</option>
				<option value="jupiter">Jupiter</option>
				<option value="saturn">Saturn</option>
				<option value="neptune">Neptune</option>
				<option value="uranus">Uranus</option>
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