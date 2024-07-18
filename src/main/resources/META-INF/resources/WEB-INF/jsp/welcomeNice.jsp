<%@ include file="header.jspf" %>
<div class="container">
	<h2>Team Details</h2>
	<hr>
	<c:if test="${team!=null}">
		<div>
			<section class="vh-10" style="background-color: #f4f5f7;">	
			  <div class="container py-2 h-10">
			    <div class="row d-flex justify-content-center align-items-center h-30">
			      <div class="col col-lg-6 mb-1 mb-lg-0">
			        <div class="card mb-3" style="border-radius: .5rem;">
			          <div class="row g-0">
			            <div class="col-md-4 gradient-custom text-center text-white"
			              style="border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;">
			              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
			                alt="Avatar" class="img-fluid my-5" style="width: 80px;" />
			              <h5 style="color: black">${team.name}</h5>
			              <h6 style="color: black">Captain : ${team.captain}</h6>
			              <p> update preferences <a href="update-team" class="fa fa-edit mb-5"></a></p>
			            </div>
			            <div class="col-md-8">
			              <div class="card-body p-4">
		                	<h6>Information</h6> 	
			                <hr class="mt-0 mb-4">
			                <div class="row pt-1">
			                  <div class="col-6 mb-3">
			                    <h6>Email ID</h6>
			                    <p class="text-muted">${team.email}</p>
			                  </div>
			                  <div class="col-6 mb-3">
			                    <h6>Contact Number</h6>
			                    <p class="text-muted">${team.mobile}</p>
			                  </div>
			                </div>
			                <hr class="mt-0 mb-4">
			                <div class="row pt-1">
			                  <div class="col-6 mb-3">
			                    <h6>Require Accomodation?</h6>
			                    <p class="text-muted">${team.requireAccomodation}</p>
			                  </div>
			                  <div class="col-6 mb-3">
			                    <h6>Require Food?</h6>
			                    <p class="text-muted">${team.requireFood}</p>
			                  </div>
			                </div>
			              </div>
			            </div>
			          </div>
			        </div>
			      </div>
			    </div>
			  </div>
		  </section>
			
		</div>
		<hr>	
		<h3>Player details</h3>
		<c:if test="${not empty team.players}">
			<div class="container">
			
			<c:forEach var="item" items="${team.players}">
			 <section class="vh-10" style="background-color: #f4f5f7;">	
			  <div class="container py-2 h-10">
			    <div class="row d-flex justify-content-center align-items-center h-30">
			      <div class="col col-lg-6 mb-1 mb-lg-0">
			        <div class="card mb-3" style="border-radius: .5rem;">
			          <div class="row g-0">
			            <div class="col-md-4 gradient-custom text-center text-white"
			              style="border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;">
			              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
			                alt="Avatar" class="img-fluid my-5" style="width: 80px;" />
			              <h5 style="color: black;">${item.name}</h5>
			              <p style="color: black;">${team.name}</p>
			              <p> Edit Player Info <a href="edit-player" class="fa fa-edit mb-5"></a></p>
			            </div>
			            <div class="col-md-8">
			              <div class="card-body p-4">
		                	<h6>Information</h6> 	
			                <hr class="mt-0 mb-4">
			                <div class="row pt-1">
			                  <div class="col-6 mb-3">
			                    <h6>Email</h6>
			                    <p class="text-muted">${item.email}</p>
			                  </div>
			                  <div class="col-6 mb-3">
			                    <h6>Phone</h6>
			                    <p class="text-muted">${item.mobile}</p>
			                  </div>
			                </div>
			                <hr class="mt-0 mb-4">
			                <div class="row pt-1">
			                  <div class="col-6 mb-3">
			                    <h6>Gothram</h6>
			                    <p class="text-muted">${item.gothram}</p>
			                  </div>
			                  <div class="col-6 mb-3">
			                    <h6>T Shirt Size</h6>
			                    <p class="text-muted">${item.shirtsize}</p>
			                  </div>
			                </div>
			                <div class="d-flex justify-content-start">
			                 
			                </div>
			              </div>
			            </div>
			          </div>
			        </div>
			      </div>
			    </div>
			  </div>
		  </section>
		</c:forEach>
		
	</div>
	<br>
	</c:if>
		<div class="container">
			<a class ="btn btn-warning" href="add-player">Add New Player</a>	
		</div>	
	</c:if>
		
	<c:if test="${team==null}">
		<a class="btn btn-primary" href="add-team">Add new Team</a>
	</c:if>	
</div>
<%@ include file="footer.jspf" %>

