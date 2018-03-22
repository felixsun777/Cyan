<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="author" content="Kodinger">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Cyan Management System</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/my-login.css">


<!-- Stylish Alert -->
<script src="${pageContext.request.contextPath}/js/alertify.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/alertify.min.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/themes/default.min.css" />

</head>
<body class="my-login-page"
	background="${pageContext.request.contextPath}/img/caribbean1.png">

	<script type="text/javascript">
		if ("${message}" != "") {
			alertify.set('notifier', 'position', 'top-center');
			alertify.notify('${message}', 'error', 5, function() {
				console.log('dismissed');
			});
		}
	</script>


	<div>
		<br> <br>
	</div>
	<!-- <div><h1 style="text-align:center;color:white">Cyan Management System</h1></div> -->
	<div style="text-align: center">
		<img src="${pageContext.request.contextPath}/img/logo.png"
			style="margin: 0 auto">
	</div>
	<div>
		<br> <br>
	</div>
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<!-- <div class="brand"> -->
					<div>
						<%-- <img src="${pageContext.request.contextPath}/img/logo.jpg"> --%>

					</div>
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title">Login</h4>
							<form method="POST"
								action="${pageContext.request.contextPath}/login">

								<div class="form-group">
									<label for="username">Username</label> <input id="username"
										type="text" class="form-control" name="username" value=""
										required autofocus>
								</div>

								<div class="form-group">
									<label for="password">Password </label> <input id="password"
										type="password" class="form-control" name="password" required
										data-eye>
								</div>

								<div class="form-group">
									<label> <input type="checkbox" name="remember">
										Remember Me
									</label>
									<%-- <div style="text-align: center; color: red">${message}<br></div> --%>
								</div>

								<div class="form-group no-margin">
									<button type="submit" class="btn btn-primary btn-block">
										Login</button>
								</div>
								<div class="margin-top20 text-center"></div>
							</form>
						</div>
					</div>
					<div class="footer"></div>
				</div>
			</div>
		</div>
	</section>
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>

	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/my-login.js"></script>

</body>
</html>