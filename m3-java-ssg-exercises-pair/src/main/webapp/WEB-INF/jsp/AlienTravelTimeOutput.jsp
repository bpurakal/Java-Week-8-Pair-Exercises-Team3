<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

	<div>

		<img class="planetAgeImage" src="img/${param.choosePlanet}.jpg" />
		<span class="ageResult">
			Traveling by
			<c:out value="${transportation}" />
			you will reach
			<c:out value="${param.choosePlanet}" />
			in
			<c:out value="${calculatedTravelTime} " />
			years. You will be 
			<!-- Age after time traveled-->
			<c:out value="${param.earthAge + calculatedTravelTime}" />
			years old.
		</span>
	</div>


</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />