<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="today" value="<%=new Date()%>"/>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/savePost" />
	<form method="POST" action="${formAction}">

		<h2>New Geek Post</h2>
		
		<div class="formInputGroup">
			<label for="username">Username</label> <input type="text"
				name="username" id="username" />
		</div>
		
		<div class="formInputGroup">
			<label for="subject">Subject</label> <input type="text"
				name="subject" id="subject" />
		</div>
		
		<div class="formInputGroup">
			<label for="message">Message</label> 
			<textarea name="message" id="message" rows="10" cols="40"> </textarea>
		</div>
		
		<div class="formInputGroup">
			<input class="formSubmitButton" type="submit" value="Post">
		</div>
		<div class="formInputGroup">
		
		<input type="hidden" name="post_date" value="${today}">
		</div>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
		
		
