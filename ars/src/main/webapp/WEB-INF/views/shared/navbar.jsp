<!-- Navigation -->

<div class="right">
	<nav>
		<ul id="top_nav">
			<li><a href="index.html"><img src="${images}/img1.gif"
					alt=""></a></li>
			<li><a href="index-4.html"><img src="${images}/img2.gif"
					alt=""></a></li>
			<li class="bg_none"><a href="#"><img src="${images}/img3.gif" alt=""></a></li>
		</ul>
	</nav>
	<nav>
		<ul id="menu">
			<li id="home"><a href="${contextRoot}/home">Home</a></li>
			<li id="ourAircraft"><a href="${contextRoot}/our-aircraft">Our Aircraft</a></li>
			<li id="safety"><a href="${contextRoot}/safety">Safety</a></li>
			<li id="charters"><a href="${contextRoot}/charters">Charters</a></li>
			<li id="contacts"><a href="${contextRoot}/contact">Contacts</a></li>
			<li id = "flightDetails"><a href="${contextRoot}/show/all/flightDetails">View All Flight</a></li>
			
			<c:forEach items="${users}" var="details">
				<li id="contacts"><a href="${contextRoot}/contact">${details.typeOfUser}</a></li>
			</c:forEach>
			<c:forEach items="${flights}" var="details">
			<li id = "flightDetails"><a href="${contextRoot}/show/all/flightDetails"></a></li>
			</c:forEach>
		</ul>
	</nav>
</div>