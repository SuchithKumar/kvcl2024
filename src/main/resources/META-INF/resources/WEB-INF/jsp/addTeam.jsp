<%@ include file="header.jspf" %>
	<div class="container">
		<h2>Add / Update Team Details</h2>
		<hr>
		<form:form modelAttribute="team" method="post">		
			<form:input type="hidden" path="id" />
	
		<div class="mb-3 form-group">
			<label class="form-label">Team name</label> 
			<form:input class="form-control" type="text" path="name" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Captain name</label> 
			<form:input class="form-control" type="text" path="captain" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Email ID</label> 
			<form:input class="form-control" type="text" path="email" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Contact Number</label> 
			<form:input class="form-control" type="text" path="mobile" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Require Accomodation?</label> 
			<br>
			Yes <form:radiobutton path="requireAccomodation" value="Yes" required="required"/>
			No <form:radiobutton  path="requireAccomodation" value="No" required="required"/>
		</div>
		<div class="mb-3 form-group">		
			<label class="form-label">Require Food?</label> 
			<br>
			Yes <form:radiobutton  path="requireFood" value="Yes" required="required"/>
			No <form:radiobutton   path="requireFood" value="No" required="required"/>
		</div>
		
		<input class="btn btn-primary like" type="submit" value="Save Details"/>

		</form:form>
	</div>

<%@ include file="footer.jspf" %>