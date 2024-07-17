<%@ include file="header.jspf" %>
<div class="container">
	<h2>Register new user</h2>
	<hr>
	<pre>${registerErrors}</pre>
	<form:form method="post" modelAttribute="login">
			<div class="mb-3">
				<label class="form-label">username</label> 
				<form:input class="form-control" type="text" path="username" required="required"></form:input>
			</div>
			<div class="mb-3">
				<label class="form-label">password</label> 
				<form:input class="form-control" type="password" path="password" required="required"></form:input>
			</div>
				<form:input className="form-control" type="hidden" path="type"></form:input>
				<form:input className="form-control" type="hidden" path="team"></form:input>
			<div class="center">
				<input class="btn btn-primary" type="submit" value="Register" />
			</div>
	</form:form>
</div>
<%@ include file="footer.jspf" %>