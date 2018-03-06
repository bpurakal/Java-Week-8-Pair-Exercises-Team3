<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

	<div>

		<img class="planetAgeImage" src="img/${param.choosePlanet}.jpg" />
		<span class="ageResult">
			If you are
			<c:out value="${param.earthAge}" />
			years on planet Earth, then you are
			<c:out value="${calculatedAge.calculateAlienAge()} " />
			<c:out value="${param.choosePlanet}" /> years old.
		</span>
	</div>


</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />