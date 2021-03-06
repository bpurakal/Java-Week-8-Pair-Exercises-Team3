<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/productList" />

		<h2>Solar System Geek Gift Shop</h2>
		
		<div class="formInputGroup">
		
		
		<table>
			
			<c:forEach var="product" items="${products}">
				<c:url var="productUrl" value="/shoppingCart/detail/">
				<c:param name="id" value="${product.id}" />
				</c:url>
				<tr>
					<td><c:url var="imageUrl" value="/img/${product.imageName}"/>
					<a href="${productUrl}"> <img src="${imageUrl}"
					style="width:45%"></a></td>
					<td>
						<ul class="noBullet">
							<li><strong><c:out value="${product.name}" /></strong></li>
							<li class="blue-text"><c:out value="${product.price}"/> </li>
						</ul>
					</td>
				</tr>
					
		</c:forEach>
			<%-- 	<c:url var="imageName" value="/img/${product.imageName}"/>
				<c:url var="imageLink" value="/shoppingCart/detail/"/>
				<a href="${imageLink}">
				<img class="imageName" alt="${product.imageName}" src="${imageName}">
				<c:out value="${product.name}" /></a>
				<c:out value="${product.price}" /> --%>
			
			</table>
		</div>
		
	
	
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
		
		
