<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/shoppingCart/addToCart" />
	<form  method="POST" action="${formAction} ">

		<input type="hidden" name="id" value="${product.id}">
		<h2>Solar System Geek Gift Shop</h2>
		
		<table>
		<tr>
		<th> </th>
		<th style="color:black">Name</th>
		<th style="color:black">Price</th>
		<th style="color:black">Qty.</th>
		<th style="color:black">Total</th>
		</tr>
		
		<c:forEach var="entry" items="${shoppingCart}">
		<tr>
		<td> <c:url var="imageUrl" value="/img/${entry.key.imageName}"/>
		<a href="${productUrl}"> <img src="${imageUrl}"
		style="width:45%"></a> </td>
		 <td><c:out value="${entry.key.name}" /> </td>
		 <td>$<c:out value="${entry.key.price}"/> </td>
		 <td><c:out value="${entry.value}"/></td>
		 <td>$<c:out value="${entry.key.price * entry.value}"/>
		</tr>
		</c:forEach>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td style="color:black">Grand Total:</td>
			<td>$<c:out value="${total}"/></td>
		</tr>
		</table>
		
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />