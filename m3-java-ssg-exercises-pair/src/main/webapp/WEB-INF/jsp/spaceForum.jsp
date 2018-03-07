<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section class="centeredPanel">

	<c:url var="formAction" value="/spaceForum" />
	<form method="GET" action="${formAction}">

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
			<label for="message">Message</label> <textarea
				name="message" id="message" rows="10" cols="40"> </textarea>
		</div>
		
		<div class="formInputGroup">
		<label></label>
			<input class="formSubmitButton" type="submit" value="Submit" />
		</div>
	</form>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
		
		
