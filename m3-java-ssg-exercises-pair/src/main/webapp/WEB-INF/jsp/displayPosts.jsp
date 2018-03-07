<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/displayPosts" />

		<h2>Solar System Geek Form</h2>
		<h5 style= "text-align:center"><a href="http://localhost:8080/m3-java-ssg-exercises-pair/createNewPost">Post a Message</a></h5>
		
		<div class="formInputGroup">
			<c:forEach var="post" items="${posts}">
				<c:out value="${post.username}" />
				<c:out value="${post.subject}" />
				<c:out value="${post.message}" />
				
			</c:forEach>
			
		</div>
		
	
	
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
		
		
