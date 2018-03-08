<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

		<h2>Solar System Geek Gift Shop</h2>
		<form method="POST" action="${formAction}">
		<div class="formInputGroup">
				
				<div class="productDetails">
				<c:url var="imageName" value="/img/${product.imageName}"/>
				<img class="imageName" alt="${product.imageName}" src="${imageName}">
				<c:out value="${product.name}" />
				<c:out value="${product.price}" />
				<c:out value="${product.description}"/>
				<label for="quantity">Quantity to Buy</label>
				<input type="text" id="quantity" />
				<c:url var="formAction" value="/shoppingCart/detail/${product.id}"  />
				
					<input type="hidden" name="id" value="${product.id}"/>
					<input type="submit" value="Add To Cart" id="addToCart"/>
					
				</div>

			
		</div>
		</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
		
		
