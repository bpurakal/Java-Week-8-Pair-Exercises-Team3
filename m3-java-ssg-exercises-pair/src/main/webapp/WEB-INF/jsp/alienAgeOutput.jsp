<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h1>Alien Age Result</h1>

<div class="formOutputGroup">

<table id="alienAgeCalculationResults">
	<tr>
		<th>Earth Age:</th>
		<td><c:out value="${param.earthAge}"/> years</td>
	</tr>
		<tr>
		<th>Selected Planet:</th>
		<td><c:out value="${param.choosePlanet}" /></td>
	</tr>
	<tr>
		<th>Alien Age:</th>
		<td><c:out value="${calculatedAge.calculateAlienAge()}"/> years</td>
	</tr>

	

</table>
</div>


</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />