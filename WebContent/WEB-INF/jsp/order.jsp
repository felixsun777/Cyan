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

<!-- DataTables CSS -->
<link
	href="${pageContext.request.contextPath}/css/dataTables/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="${pageContext.request.contextPath}/css/dataTables/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/startmin.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- Stylish Alert -->
<script src="${pageContext.request.contextPath}/js/alertify.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/alertify.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/themes/default.min.css" />

<script type="text/javascript">
	function confirmation(id,button) {
		confirm = document.getElementById("confirm_"+id);
		button.style.display="none";
		confirm.style.display="inline";
	}
</script>
</head>
<body>

	<script type="text/javascript">
		if ("${message}" != "") {
			alertify.set('notifier','position', 'top-center');
			var flag;
			if("${message}"=="Successfully Deleted"){
				flag = "success";
			}else{
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

						<li><a
							href="${pageContext.request.contextPath }/product/products"><i
								class="fa fa-cubes fa-fw"></i> Products</a></li>

						<li><a class="active"
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

						<li><a
							href="${pageContext.request.contextPath }/email/"><i
								class="fa fa-envelope fa-fw"></i> Emails</a></li>
					</ul>
				</div>
			</div>
		</nav>



		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">
						List of all orders
						<%-- <div style="float: right">
							<button id="new" type="button" class="btn btn-primary"
								style="align: right"
								onclick="location='${pageContext.request.contextPath }/order/new'">New
								Department</button>
						</div> --%>
					</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							Result Data Table
							<%-- <span style="padding: 30%; color: green">${message}</span> --%>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="dataTable_wrapper">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th style="text-align: center">Order ID</th>
											<th style="text-align: center">Customer ID</th>
											<th style="text-align: center">Order Date</th>
											<th style="text-align: center">Order Status</th>
											<th style="text-align: center">Order Sum</th>
											<th style="text-align: center">Operations</th>
										</tr>
									</thead>
									<tbody>

										<c:forEach var="c" items="${requestScope.orders}">
											<tr class="odd gradeX">
												<td align="center">${c.orderId}</td>
												<td align="center">${c.userId}</td>
												<td align="center">${c.orderDate}</td>
												<td align="center">${c.orderStatus}</td>
												<td align="center">${c.orderSum}</td>
												<td align="center">
													<button type="button" class="btn btn-success"
														onclick="location='${pageContext.request.contextPath}/order/modify?orderId=${c.orderId}&userId=${c.userId}&orderDate=${c.orderDate}&orderStatus=${c.orderStatus}&orderSum=${c.orderSum}'"
														style="width: 80px">Status</button>
													<button type="button" class="btn btn-info"
														onclick="location='${pageContext.request.contextPath}/order/detail?orderId=${c.orderId}&userId=${c.userId}&orderDate=${c.orderDate}&orderStatus=${c.orderStatus}&orderSum=${c.orderSum}&receiverName=${c.receiverName}&phone=${c.phone}&email=${c.email}&address=${c.address}&state=${c.state}&city=${c.city}&zip=${c.zip}'"
														style="width: 80px">Detail</button>
													<%-- <button class="btn btn-warning" style="width: 80px"
														onclick="confirmation(${c.orderId},this);">Delete</button> --%>
													<%-- <button type="button" class="btn btn-danger"
														style="display: none; width: 80px"
														id="confirm_${c.orderId}"
														onclick="location='${pageContext.request.contextPath}/order/delete?orderId=${c.orderId}'">Confirm</button> --%>
												</td>
											</tr>
										</c:forEach>



									</tbody>
								</table>
							</div>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>






		</div>
		<!-- /#page-wrapper -->






	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="../js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="../js/dataTables/jquery.dataTables.min.js"></script>
	<script src="../js/dataTables/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../js/startmin.js"></script>

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                        responsive: true
                });
            });
        </script>

</body>
</html>
