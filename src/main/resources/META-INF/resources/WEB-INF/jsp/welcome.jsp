<%@ include file="header.jspf" %>
<div class="container">
	<h2>Team Details</h2>
	<hr>
	<c:if test="${team!=null}">
		<div>
			<h4>Contact Number - ${team.mobile}</h4>
			<h4>Email ID - ${team.email}</h4>
			<h4>Require Accomodation? - ${team.requireAccomodation}</h4>
			<h4>Require Food? - ${team.requireFood}</h4>
			<a class="btn btn-warning" href="update-team">update preferences</a>
		</div>
		<hr>	
		<h3>Player details</h3>
		<c:if test="${not empty team.players}">
			<div class="container">
				<table class="table">
					<thead>
						<tr>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile</th>
							<th>Gothram</th>
						</tr>
					</thead>
					<tbody>
						 <c:forEach var="item" items="${team.players}">
							<tr>
								<td>${item.name}</td>
								<td>${item.email}</td>
								<td>${item.mobile}</td>
								<td>${item.gothram}</td>
							<tr>
						</c:forEach>
					</tbody>	
				</table>
			</div>
			</c:if>
		</c:if>
		<a class ="btn btn-warning" href="add-player">Add New Player</a>		
	<c:if test="${team==null}">
		<a class="btn btn-primary" href="add-team">Add new Team</a>
	</c:if>	
</div>
<%@ include file="footer.jspf" %>