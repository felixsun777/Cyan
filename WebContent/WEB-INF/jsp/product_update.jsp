<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Cyan Management System</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="${pageContext.request.contextPath}/css/metisMenu.min.css"
	rel="stylesheet">

<!-- Timeline CSS -->
<link href="${pageContext.request.contextPath}/css/timeline.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/startmin.css"
	rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="${pageContext.request.contextPath}/css/morris.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">


<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<!-- Stylish Alert -->
<script src="${pageContext.request.contextPath}/js/alertify.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/alertify.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/themes/default.min.css" />

<!-- File Input -->
<script src="${pageContext.request.contextPath}/js/fileinput.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/fileinput.css" />

</head>
<body>

	<script type="text/javascript">
		if ("${message}" != "") {
			alertify.set('notifier', 'position', 'top-center');
			var flag;
			if ("${message}" == "Successfully Updated") {
				flag = "success";
			} else {
				flag = "error";
			}
			alertify.notify('${message}', flag, 5, function() {
				console.log('dismissed');
			});
		}
	</script>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
			style="background-color: #3071a9">
			<div class="navbar-header">
				<a class="navbar-brand"
					href="${pageContext.request.contextPath }/menu"
					style="color: white; font-family: sans-serif; font-size: 22px">Cyan
					Management System</a>
			</div>

			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>


			<ul class="nav navbar-right navbar-top-links">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#" style="background-color: #3071a9">
						<i class="fa fa-user fa-fw"></i>Welcome, ${user.getUsername()} <b
						class="caret"></b>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="${pageContext.request.contextPath}/logout"><i
								class="fa fa-sign-out fa-fw"></i> Logout</a></li>
					</ul></li>
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">

						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="Search...">
								<span class="input-group-btn">
									<button class="btn btn-primary" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> <!-- /input-group -->
						</li>

						<li><a href="${pageContext.request.contextPath }/menu"><i
								class="fa fa-dashboard fa-fw"></i> Dashboard</a></li>

						<li><a class="active"
							href="${pageContext.request.contextPath }/product/products"><i
								class="fa fa-cubes fa-fw"></i> Products</a></li>

						<li><a
							href="${pageContext.request.contextPath }/order/orders"><i
								class="fa fa-cart-arrow-down fa-fw"></i> Orders</a></li>

						<li><a
							href="${pageContext.request.contextPath }/customer/customers"><i
								class="fa fa-users fa-fw"></i> Customers</a></li>

						<li><a
							href="${pageContext.request.contextPath }/department/departments"><i
								class="fa fa-building-o fa-fw"></i> Departments</a></li>

						<li><a
							href="${pageContext.request.contextPath }/category/categories"><i
								class="fa fa-book fa-fw"></i> Categories</a></li>

						<li><a href="${pageContext.request.contextPath }/email/"><i
								class="fa fa-envelope fa-fw"></i> Emails</a></li>
					</ul>
				</div>
			</div>
		</nav>



		<!-- Content Begin  -->
		<c:set var="productId"  value = "${product.getProductId()}"></c:set>
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">
						Update the product
						<div style="float: right">
							<button id="new" type="button" class="btn btn-danger"
								style="align: right; width: 120px"
								onclick="location='${pageContext.request.contextPath }/product/products'">Return</button>
						</div>
					</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							Please input the information.
							<%-- <span style="padding: 20%; color: green">${message}</span> --%>
						</div>
						<form role="form" method="POST" enctype="multipart/form-data"
							action="${pageContext.request.contextPath}/product/update">
							<div class="panel-body">

								<div class="row">
									<div class="col-lg-6">

										<div class="form-group">
											<label style="color: red">Product ID</label> <input
												name="productId" class="form-control"
												value="${product.getProductId()}" readonly>
										</div>

										<div class="form-group">
											<label>Product Name(*)</label> <input name="productName"
												class="form-control" value="${product.getProductName()}"
												required>
										</div>

										<div class="form-group">
											<label>Price</label> <input name="price" class="form-control"
												value="${product.getPrice()}">
										</div>
										<div class="form-group">
											<label>Stock</label> <input name="stock" class="form-control"
												value="${product.getStock()}">
										</div>

										<div class="form-group">
											<label>Available Date</label> <input name="availableDate"
												class="form-control"
												value="<fmt:formatDate value='${product.getAvailableDate()}' type='date' pattern='MM-dd-yyyy'/>">
										</div>

									</div>

									<div class="col-lg-6" style="margin: 0 auto">
										<div class="form-group">
											<label for="password">Category Id(*)</label> <input
												class="form-control" name="categoryId"
												value="${product.getCategoryId()}" required>
										</div>

										<div class="form-group">
											<label>Brand</label> <input name="brand" class="form-control"
												value="${product.getBrand()}">
										</div>

										<div class="form-group">
											<label>MSRP</label> <input name="msrp" class="form-control"
												value="${product.getMsrp()}">
										</div>
										<div class="form-group">
											<label>Average Stars</label> <input name="averageRanking"
												class="form-control" value="${product.getAverageRanking()}">
										</div>
										<div class="form-group">
											<label>Image Path</label> <input name="image"
												class="form-control" value="${product.getImage()}" readonly>
										</div>

									</div>



								</div>

								<div class="row">

									<div class="form-group" style="width: 96%; margin-left: 2%">
										<label>Description</label>
										<textarea class="form-control" name="description" rows="3">${product.getDescription()}</textarea>
									</div>
								</div>


								<div class="panel-body">
									<div class="row"
										style="width: 600px; text-align: center; margin: auto">
										<label>Upload Representative Image</label> <input name="pic"
											type="file" class="file">
									</div>
									<br>
								</div>



								<div class="row">
									<div class="col-lg-6">
										<div style="text-align: center">
											<button type="submit" class="btn btn-primary"
												style="width: 130px">Submit</button>
										</div>
									</div>
									<div class="col-lg-6">
										<div style="text-align: center">
											<button type="reset" class="btn btn-primary"
												style="width: 130px">Reset</button>
										</div>
									</div>
								</div>


								<!-- /.row (nested) -->
							</div>
							<!-- /.panel-body -->


						</form>



					</div>
					<!-- /.panel -->
					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
								<div class="panel-heading">
									Please upload the detailed pictures. 
									<%-- <span style="padding: 20%; color: green">${message}</span> --%>
								</div>
								<form role="form" method="POST" enctype="multipart/form-data"
									action="${pageContext.request.contextPath}/product/pictures">
									<div class="panel-body">
										<div class="row">
											<div class="panel-body">
												<div class="row"
													style="width: 600px; text-align: center; margin: auto">
													<label>Upload Detailed Pictures</label> 
													<input type="hidden" name="productId" class="form-control" value="${product.getProductId()}" readonly>
													<div class="file-loading">
														<input name="pictures" id="pictures" type="file" class="file" multiple>
													</div>
												</div>
												<br>
											</div>
										</div>
									</div>
								</form>
							</div>
							<!-- /.col-lg-12 -->
						</div>
						<!-- /.row -->


						<!-- /#page-wrapper -->


						<!-- Content End  -->






					</div>
					<!-- /#wrapper -->


					<!-- Metis Menu Plugin JavaScript -->
					<script
						src="${pageContext.request.contextPath}/js/metisMenu.min.js"></script>

					<!-- Morris Charts JavaScript -->
					<script src="${pageContext.request.contextPath}/js/raphael.min.js"></script>
					<script src="${pageContext.request.contextPath}/js/morris.min.js"></script>
					<script src="${pageContext.request.contextPath}/js/morris-data.js"></script>

					<!-- Custom Theme JavaScript -->
					<script src="${pageContext.request.contextPath}/js/startmin.js"></script>
</body>
</html>
