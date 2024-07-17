<%@ include file="header.jspf" %>
	<div class="container">
		<h1>Add / Update Player</h1>
		<hr>
		<form:form modelAttribute="player" method="post">
		
		<div class="mb-3 form-group">
			<label class="form-label">Player name</label> 
			<form:input class="form-control" type="text" path="name" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Email ID</label> 
			<form:input class="form-control" type="text" path="email" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">Contact Number</label> 
			<form:input class="form-control" type="text" path="mobile" required="required"/>
		</div>
		
		<form:input class="form-control" type="hidden" path="photo" required="required"/>
		
		<div class="mb-3 form-group">
			<label class="form-label">Gothram</label> 
			<form:input class="form-control" type="text" path="gothram" required="required"/>
		</div>
		<div class="mb-3 form-group">
			<label class="form-label">T Shirt Size</label>
			<br>
			S<form:radiobutton cssClass="form-check-input" path="shirtsize" value="S" required="required"/>
			M<form:radiobutton cssClass="form-check-input"  path="shirtsize" value="M" required="required"/>
			L<form:radiobutton cssClass="form-check-input" path="shirtsize" value="L" required="required"/>
			XL<form:radiobutton cssClass="form-check-input"  path="shirtsize" value="XL" required="required"/>
			XXL<form:radiobutton cssClass="form-check-input" path="shirtsize" value="XXL" required="required"/>
		</div>
		<input class="btn btn-primary like" type="submit" value="Save Player"/>
		</form:form>
	</div>	
<%@ include file="footer.jspf" %>