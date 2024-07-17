<%@ include file="header.jspf" %>
	<h1>Update Preferences</h1>
	<hr>
	<div class="container">
		 <form:form modelAttribute="preferences" method="post">
				<label class="form-label">Require Accomodation?</label>
				<form:checkbox path="requireAccomodation" cssClass="form-control"/>
				<label class="form-label">Require Food?</label>
				<form:checkbox path="requireFood" cssClass="form-control"/>
		</form:form> 
	</div>
	
<%@ include file="footer.jspf" %>