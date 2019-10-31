<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index File Test</title>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/bower_components/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
  	<link rel="stylesheet" href="/bower_components/bootstrap/dist/css/bootstrap.min.css" />
  	<link rel="stylesheet" href="/bower_components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" />
	<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
	<script src="http://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/a549aa8780dbda16f6cff545aeabc3d71073911e/src/js/bootstrap-datetimepicker.js"></script>
	<link href="http://cdn.rawgit.com/Eonasdan/bootstrap-datetimepicker/a549aa8780dbda16f6cff545aeabc3d71073911e/build/css/bootstrap-datetimepicker.css" rel="stylesheet"/>
	<link href='https://fonts.googleapis.com/css?family=Nunito' rel='stylesheet'>
	<link href='https://fonts.googleapis.com/css?family=Bowlby One' rel='stylesheet'>
	<style>
	

		
		a, h1, h3, h4, h5, h6, p {
			
			font-family: Nunito;
			color: #F8E9A1;
		
		}
		
		label {
			font-family: Nunito;
			color: #24305E;
		}
		
		
		.sub-header {
			font-family: Nunito;
			font-weight: 900;
			color: #374785;
		}
		
		.nunitoText {
			
			font-family: Nunito;
			color: #F8E9A1; 
		}
		
		.modal-content{
			
			background-color: #A8D0E6;
			border: 3px solid #24305E;
		}
		
	
	</style>
</head>
<body> 
	<div style="background-color: #A8D0E6">
		<nav class="navbar navbar-expand-lg" style="background-color: #24305E; font-family: Nunito">
		  <a class="navbar-brand" href="#">SIO</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav">
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Home</a>
		      </li>
		    </ul>
		    <ul class="nav navbar-nav  w-100">
		   		<li class="ml-auto"><button class="btn text-center" data-toggle="modal" data-target="#modalLoginForm" style="background-color: #F8E9A1; color: #24305E">
					Login</button></li>
   			</ul>
		  </div>
		</nav>
		
		<br><br><br>
		
		<h2 class="text-center sub-header">Prenotazione On-line</h2>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="center col-md-8" style="background-color: #374785; height: 7px; width: 100%"></div>
			<div class="col-md-2"></div>
		</div><br><br><br>
		
		<div class="row justify-content-md-center">
		<div class="col-md-8">
		 <form action="prenotaVisita" method="post">
	          <div class="form-row">
	
	            <div class="form-group col-md-6">
	              <label for="inputName">Nome</label>
	              <input type="text" required="required" name="nome" class="form-control" id="inputName" placeholder="Jhonny">
	            </div>
	            <div class="form-group col-md-6">
	              <label for="inputLastName">Cognome</label>
	              <input type="text" required="required" name="cognome" class="form-control" id="inputLastName" placeholder="Appleseed">
	            </div>
	
	          </div>
	          <div class="form-row">
	
	            <div class="form-group col-md-12">
	              <label for="inputAddress">Residenza</label>
	              <input type="text" required="required" name="residenza" class="form-control" id="inputAddress" placeholder="Piazza Navona 12">
	            </div>
	
	          </div>
	          <div class="form-row">
	
	            <div class="form-group col-md-6">
	              <label for="inputCF">Codice Fiscale</label>
	              <input type="text" required="required" name="codiceFiscale" class="form-control" id="inputCF" placeholder="JNNAPP96G19H501D">
	            </div>
	         
			   	<div class="col-md-6">
			   	<label for="inputDOB">Data di Nascita</label>
				    <div class='input-group date datepicker'>
					  <input type='text' class="form-control" id="inputDOB" />
					  <span class="input-group-addon">
					   <span class="glyphicon glyphicon-calendar"></span>
					  </span>
				 </div>
				</div>			    
				
	          </div>
	          
	          <div class="form-row">
	          	<div class="form-group col-md-4">
	              <label for="numeroRicetta">Numero Ricetta</label>
	              <input type="text" required="required" name="numeroRicetta" class="form-control" id="numeroRicetta" placeholder="FUEI4432S">
	            </div>
	            <div class="form-group col-md-4">
	              <label for="inputVisita">Tipo Visita</label>
	              <select name="tipoVisita" class="form-control" id="inputVisita" required="required">
	              	<option value="Visita Cardiologica">Visita Cardiologica</option>
	              	<option value="Esame">Esame</option>
	              </select>
	            </div>
	            <div class="form-group col-md-4">
	              <label for="inputEsame">Esame</label>
	              <select name="esame" class="form-control" id="inputEsame" required="required">
	              	<option selected="selected" value=null>-</option>
	              	<option value="ECC">ECC</option>
	              </select>
	            </div>
	           </div>
	            
	          <br><br>
	          <div class="form-row justify-content-md-center">
	            <div class="form-group col-md-8">
	              <button type="submit" class="btn" style="background-color: #24305E; color: #F8E9A1; width: 100%">Sign in</button>
	            </div>
	          </div>
	    </form>
	    </div>
	    </div>
		
		<div>
		
		
		</div>
		<br><br><br><br>
		<footer class="page-footer font-small unique-color-dark" style="background-color: #374785">
		
		  <div  style="background-color: #24305E">
		    <div class="container">

		      <div class="row py-4 d-flex align-items-center">

		        <div class="col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0">
		          <h6 class="mb-0">Get connected with us on social networks!</h6>
		        </div>
		      </div>
		    </div>
		  </div>

		  <div class="container text-center text-md-left mt-5">

		    <div class="row mt-3">

		      <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">

		        <h6 class="text-uppercase font-weight-bold">SIO</h6>
		        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px; background-color: #F76C6C;">
		        <p>Questa WebApplication e' stata sviluppata dal team ancora alle prime armi dei Testimoni di Java con sede a Sincrono</p>
		
		      </div>
		      <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">

		        <h6 class="text-uppercase font-weight-bold">Login</h6>
		        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px; background-color: #F76C6C;">
		        <p>
		          <a href="#!">Personale Medico</a>
		        </p>
		        <p>
		          <a href="#!">Personale Ausiliario</a>
		        </p>
		        
		
		      </div>
		      <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
		        <h6 class="text-uppercase font-weight-bold">Useful links</h6>
		        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px; background-color: #F76C6C;">
		        <p>
		          <a href="#!">Homepage</a>
		        </p>
		        <p>
		          <a href="#!">Prenota Visita</a>
		        </p>
		        <p>
		          <a href="#!">Area Privata</a>
		        </p>

		
		      </div>
		      <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4"">
		
		        <!-- Links -->
		        <h6 class="text-uppercase font-weight-bold">Contact</h6>
		        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px; background-color: #F76C6C;">
		        <p>
		          <i class="fas fa-home mr-3"></i> Via Mosca 10, 00144, RM</p>
		        <p>
		          <i class="fas fa-envelope mr-3"></i> info@example.com</p>
		        <p>
		          <i class="fas fa-phone mr-3"></i> + 01 234 567 88</p>
		        <p>
		          <i class="fas fa-print mr-3"></i> + 01 234 567 89</p>
		
		      </div>
		
		    </div>
		
		  </div>

		  <div class="footer-copyright text-center py-3 nunitoText" style="background-color: #24305E">© 2019 Copyright:
		    <a href="https://mdbootstrap.com/education/bootstrap/"> sio.sincrono.com</a>
		  </div>
		</footer>
		
	<div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
	  aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header text-center">
	        <h4 class="modal-title w-100 font-weight-bold" style="color: #374785;">Sign in</h4>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <form action="loginUser" method="post">
		      <div class="modal-body mx-3">
		        <div class="md-form mb-5">
		          <i class="fas fa-envelope prefix grey-text"></i>
		          <label data-error="wrong" data-success="right" for="defaultForm-email"  style="color: #374785;">Username</label>
		          <input type="text" id="defaultForm-email" class="form-control validate">
		        </div>
		
		        <div class="md-form mb-4">
		          <i class="fas fa-lock prefix grey-text"></i>
		          <label data-error="wrong" data-success="right" for="defaultForm-pass"  style="color: #374785;">Password</label>
		          <input type="password" id="defaultForm-pass" class="form-control validate">
		        </div>
		
		      </div>
		      <div class="modal-footer d-flex justify-content-center">
		        <button class="btn btn-default" style="background-color: #24305E; color: #F8E9A1; width: 100%">Login</button>
		      </div>
	      </form>
	    </div>
	  </div>
	</div>
		
	</div>
	
	
	<script type="text/javascript">

	    $('.datepicker').datepicker({
	        format: 'mm/dd/yyyy',
	        viewMode: 'years'  
	    });
	</script>

</body>
</html>