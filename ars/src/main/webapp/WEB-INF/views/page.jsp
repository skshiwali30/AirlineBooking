<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">
<head>
<title>Airline Reservation System - ${title}</title>
<meta charset="utf-8">
<link rel="stylesheet" href="${css}/reset.css" type="text/css"
	media="all">
<link rel="stylesheet" href="${css}/layout.css" type="text/css"
	media="all">
<link rel="stylesheet" href="${css}/style.css" type="text/css"
	media="all">
<script type="text/javascript" src="${js}/jquery-1.4.2.js"></script>
<script type="text/javascript" src="${js}/cufon-yui.js"></script>
<script type="text/javascript" src="${js}/cufon-replace.js"></script>
<script type="text/javascript" src="${js}/Myriad_Pro_italic_600.font.js"></script>
<script type="text/javascript" src="${js}/Myriad_Pro_italic_400.font.js"></script>
<script type="text/javascript" src="${js}/Myriad_Pro_400.font.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="http://info.template-help.com/files/ie6_warning/ie6_script_other.js"></script>
	<script type="text/javascript" src="js/html5.js"></script>
<![endif]-->
</head>
<body id="page1">
	<div class="body1">
		<div class="main">
			<!-- header -->
			<header>
				<div class="wrapper">
					<h1>
						<a href="index.html" id="logo">Air Lines</a><span id="slogan">International
							Travel</span>
					</h1>
					<!-- Navigation -->
					<%@include file="./shared/navbar.jsp"%>
				</div>
			</header>
		</div>
	</div>
	<div class="ic">More Website Templates at TemplateMonster.com!</div>
	<div class="main">
		<div id="banner">
			<div class="text1">
				COMFORT<span>Guaranteed</span>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
			</div>
			<a href="#" class="button_top">Order Tickets Online</a>
		</div>
	</div>
	<!-- / header -->

	<!-- Main Page content -->
	<c:if test="${userClickHome == true }">
		<%@include file="home.jsp"%>
	</c:if>
	
	<c:if test="${userClickOurAircraft == true }">
		<%@include file="ourAircraft.jsp"%>
	</c:if>
	
	<c:if test="${userClickSafety == true }">
		<%@include file="safety.jsp"%>
	</c:if>
	
	<c:if test="${userClickCharters == true }">
		<%@include file="charters.jsp"%>
	</c:if>
	
	<c:if test="${userClickContacts == true }">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>