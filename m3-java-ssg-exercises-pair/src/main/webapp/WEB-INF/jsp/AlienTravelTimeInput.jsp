<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/AlienTravelTimeOutput" />
	<form method="GET" action="${formAction}">

		<h2>Alien Travel Time Calculator</h2>
		
		<div class="formInputGroup">
			<label for="choosePlanet">Choose a planet</label> 
			<select name="choosePlanet" id="choosePlanet">
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
			<label for="chooseTransportation">Choose a mode of transport</label> 
			<select name="chooseTransportation" id="chooseTransportation">
				<option value="3">Walking</option>
				<option value="100">Car</option>
				<option value="200">Bullet Train</option>
				<option value="570">Boeing 747</option>
				<option value="1350">Concorde</option>
			</select>
		</div>
		<div class="formInputGroup">
			<label for="earthAge">Enter your Earth age</label> <input type="text"
				name="earthAge" id="earthAge" />
		</div>
		<div class="formInputGroup">
		<label></label>
			<input class="formSubmitButton" type="submit" value="Calculate Travel Time" />
		</div>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />