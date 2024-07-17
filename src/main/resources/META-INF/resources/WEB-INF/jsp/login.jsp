<%@ include file="header.jspf" %>
<div class="container">
	<h2>Login Form</h2>
	<hr>
	<form method="post">
		<pre class="text-danger">${loginError}</pre>
		<div class="mb-3">
			<label class="form-label">username</label> 
			<input class="form-control" type="text" name="username">
		</div>
		<div class="mb-3">
			<label class="form-label">password</label> 
			<input class="form-control" type="password" name="password">
		</div>
		<div class="mb-6">
			<input class="btn btn-primary like" type="submit" value="Login"/>
			<a class="btn btn-warning" href="register-user">Register</a>
		</div>
	</form>
</div> 
		
<%@ include file="footer.jspf" %>