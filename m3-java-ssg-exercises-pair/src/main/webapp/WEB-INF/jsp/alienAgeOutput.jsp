<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

	<div>

		<img class="planetAgeImage" src="img/${param.choosePlanet}.jpg" />
		
		If you are <c:out value="${param.earthAge}" />
		years on planet Earth, 
		then you are <c:out value="${calculatedAge.calculateAlienAge()}" /> years on planet <c:out value="${param.choosePlanet}" />.

	</div>


</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />