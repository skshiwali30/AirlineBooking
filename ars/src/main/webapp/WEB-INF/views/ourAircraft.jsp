<div class="main">
	<!-- content -->
	<section id="content">
		<article class="col1">
			<div class="pad_1">
				<h2>Your Flight Planner</h2>
				<form id="form_1" action="" method="post">
					<div class="wrapper pad_bot1">
						<div class="radio marg_right1">
							<input type="radio" name="name1">Round Trip<br> <input
								type="radio" name="name1">One Way
						</div>
						<div class="radio">
							<input type="radio" name="name1">Empty-Leg<br> <input
								type="radio" name="name1">Multi-Leg
						</div>
					</div>
					<div class="wrapper">
						Leaving From:
						<div class="bg">
							<input type="text" class="input input1"
								value="Enter City or Airport Code"
								onBlur="if(this.value=='') this.value='Enter City or Airport Code'"
								onFocus="if(this.value =='Enter City or Airport Code' ) this.value=''">
						</div>
					</div>
					<div class="wrapper">
						Going To:
						<div class="bg">
							<input type="text" class="input input1"
								value="Enter City or Airport Code"
								onBlur="if(this.value=='') this.value='Enter City or Airport Code'"
								onFocus="if(this.value =='Enter City or Airport Code' ) this.value=''">
						</div>
					</div>
					<div class="wrapper">
						Departure Date and Time:
						<div class="wrapper">
							<div class="bg left">
								<input type="text" class="input input2" value="mm/dd/yyyy "
									onBlur="if(this.value=='') this.value='mm/dd/yyyy '"
									onFocus="if(this.value =='mm/dd/yyyy ' ) this.value=''">
							</div>
							<div class="bg right">
								<input type="text" class="input input2" value="12:00am"
									onBlur="if(this.value=='') this.value='12:00am'"
									onFocus="if(this.value =='12:00am' ) this.value=''">
							</div>
						</div>
					</div>
					<div class="wrapper">
						Return Date and Time:
						<div class="wrapper">
							<div class="bg left">
								<input type="text" class="input input2" value="mm/dd/yyyy "
									onBlur="if(this.value=='') this.value='mm/dd/yyyy '"
									onFocus="if(this.value =='mm/dd/yyyy ' ) this.value=''">
							</div>
							<div class="bg right">
								<input type="text" class="input input2" value="12:00am"
									onBlur="if(this.value=='') this.value='12:00am'"
									onFocus="if(this.value =='12:00am' ) this.value=''">
							</div>
						</div>
					</div>
					<div class="wrapper">
						<p>Passenger(s):</p>
						<div class="bg left">
							<input type="text" class="input input2" value="# passengers"
								onBlur="if(this.value=='') this.value='# passengers'"
								onFocus="if(this.value =='# passengers' ) this.value=''">
						</div>
						<a href="#" class="button2"
							onClick="document.getElementById('form_1').submit()">go!</a>
					</div>
				</form>
				<h2>Did You Know?</h2>
				<p>
					<strong>Lorem ipsum dolor</strong> sit amet, consectetur
					adipisicing elit, sed do eiusmod tempor incididunt ut labore et
					dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
					exercitation ullamco laboris nisi ut aliquip ex ea commodo.
				</p>
				<div class="wrapper pad_bot2">
					<a href="#" class="button2">Read More</a>
				</div>
			</div>
		</article>
		<article class="col2 pad_left1">
			<h2>Aircraft Sales</h2>
			<div class="wrapper">
				<figure class="left marg_right1">
					<img src="images/page2_img1.jpg" alt="">
				</figure>
				<p>
					<strong>Sed ut perspiciatis</strong> unde omnis iste natus error
					sit voluptatem accusantium doloremque laudantium, totam rem
					aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
					architecto beatae.
				</p>
			</div>
			<p>Vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia
				voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur
				magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro
				quisquam est, qui dolorem:</p>
			<div class="wrapper pad_bot1">
				<ul class="list1 cols marg_right1">
					<li><a href="#">Lipsum quia dolor amet consectetur</a></li>
					<li><a href="#">Vdipisci velit, sed quia non numquam</a></li>
					<li><a href="#">Dius modi tempora incidunt</a></li>
					<li><a href="#">Uliquam quaerat voluptatem enim</a></li>
				</ul>
				<ul class="list1 cols">
					<li><a href="#">Quis nostrum exercitationem</a></li>
					<li><a href="#">Quis autem vel eum iure reprehender</a></li>
					<li><a href="#">Ullam corporis suscipit laboriosam</a></li>
					<li><a href="#">Nisi ut aliquid ex commodi</a></li>
				</ul>
			</div>
			<div class="wrapper">
				<a href="#" class="button1">Read More</a>
			</div>
			<h2>Aircraft Management</h2>
			<div class="wrapper">
				<figure class="right marg_left1">
					<img src="images/page2_img2.jpg" alt="">
				</figure>
				<p>
					<strong>At vero eos et accusamus</strong> et iusto odio dignissimos
					ducimus qui blanditiis praesentium voluptatum deleniti atque
					corrupti quos dolores et quas molestias excep- turi sint occaecati
					cupiditate.
				</p>
				<p>
					<strong>Non provident</strong>, similique sunt in culpa qui officia
					deserunt mollitia animi, id est laborum et dolorum fuga. Et harum
					quidem rerum facilis est et expedita distinctio. Nam libero
					tempore, cum soluta nobis est eligendi optio cumque nihil impedit
					quo minus id quod maxime placeat facere possimus omnis.
				</p>
			</div>
		</article>
	</section>
	<!-- / content -->
</div>