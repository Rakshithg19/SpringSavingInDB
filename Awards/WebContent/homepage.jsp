<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<!-- ICONS LINK -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body
	style="background-image: url('./image/stars.jpg'); background-repeat: no-repeat; background-size: auto;">

	<a class="fa fa-home" href="homepage.jsp"
		style="font-size: 34px; color: black"></a>

	<div class="container">


		<div
			class="cover-container d-flex w-100 h-100 p-5 mx-auto flex-column">



			<nav class="navbar  navbar-expand-md navbar-dark bg-dark"
				style="opacity: 0.5"; >
				<div
					class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							href="ActorForm.jsp" style="font-family: cursive; color: gold">Actors
								Nomination</a></li>
					</ul>
				</div>
				<div class="mx-auto order-0">
					<a class="navbar-brand mx-auto" href="Award.jsp" href="Award.jsp"
						style="font-family: cursive; color: gold">Award</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target=".dual-collapse2">
						<span class="navbar-toggler-icon"></span>
					</button>
				</div>

				<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="MovieForm.jsp" style="font-family: cursive; color: gold">Movie
								Nomination</a></li>
					</ul>
				</div>
			</nav>
		</div>

	</div>
	</div>


	<footer class="mastfoot mt-auto">
		<div class="text-center" align="center"
			style="position: fixed; bottom: 0px; width: 100%; text-align: center;">
			<p>
				<b>Follow Us</b>
			</p>
			<p>
				<a href="https://Facebook.com/" class="fa fa-facebook"
					style="font-size: 24px"> </a> <a href="https://twitter.com/"
					class=" fa fa-twitter" style="font-size: 24px"> </a> <a
					href="https://Instagram.com/" class="fa fa-instagram"
					style="font-size: 24px"> <a></a>
			</p>
		</div>
	</footer>

</body>
</html>