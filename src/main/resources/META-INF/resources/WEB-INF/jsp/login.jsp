<%@ include file="header.jspf" %>
<div class="container-login">
	<h2>Login Form</h2>
	<hr>
	<form method="post">
		<pre class="text-danger">${loginError}</pre>
		<div class="mb-3 cust-label-form-group">
			<label class="form-label">*Username:</label> 
			<input class="form-control" type="text" name="username">
		</div>
		<div class="mb-3 cust-label-form-group">
			<label class="form-label">*Password:</label> 
			<input class="form-control" type="password" name="password">
		</div>
		<div class="mb-3 cust-label-form-group">
			<input class="btn btn-primary like cust-login-btn" type="submit" value="Login"/>
		</div>
		<div class="mb-3 cust-label-form-group">
			<span>Don't have an account? </span>
			<a class="cust-login-register" href="register-user">Signup Now</a>
		</div>
	</form>
</div> 
		
<%@ include file="footer.jspf" %>