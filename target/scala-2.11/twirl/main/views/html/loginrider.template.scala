
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginrider_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object loginrider_Scope1 {
import helper._

class loginrider extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Rider],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(riderform: Form[Rider]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<html>
	<head>
		<title>Rider Login</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/login.css")),format.raw/*19.112*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>


	</head>
	<style>
			.nav_text """),format.raw/*27.14*/("""{"""),format.raw/*27.15*/("""
				"""),format.raw/*28.5*/("""color: white;
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/("""
			"""),format.raw/*30.4*/(""".navbar-header"""),format.raw/*30.18*/("""{"""),format.raw/*30.19*/("""
				"""),format.raw/*31.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			"""),format.raw/*34.4*/(""".navcontainer """),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
				"""),format.raw/*35.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""

			"""),format.raw/*39.4*/("""body """),format.raw/*39.9*/("""{"""),format.raw/*39.10*/("""
				"""),format.raw/*40.5*/("""margin: auto;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""
			"""),format.raw/*42.4*/(""".navbar, .navbar-fixed """),format.raw/*42.27*/("""{"""),format.raw/*42.28*/("""
				"""),format.raw/*43.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""
			"""),format.raw/*48.4*/("""#navbar """),format.raw/*48.12*/("""{"""),format.raw/*48.13*/("""
				"""),format.raw/*49.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/(""".navbar-brand """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
				"""),format.raw/*53.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""
			"""),format.raw/*57.4*/(""".nav-link """),format.raw/*57.14*/("""{"""),format.raw/*57.15*/("""
				"""),format.raw/*58.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/("""
			"""),format.raw/*62.4*/("""nav.navbar.fixed-top """),format.raw/*62.25*/("""{"""),format.raw/*62.26*/("""
				"""),format.raw/*63.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""

			"""),format.raw/*67.4*/(""".navbar-footer """),format.raw/*67.19*/("""{"""),format.raw/*67.20*/("""
				"""),format.raw/*68.5*/("""background-color: white;

			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/("""
			"""),format.raw/*71.4*/("""#footerlink """),format.raw/*71.16*/("""{"""),format.raw/*71.17*/("""
				"""),format.raw/*72.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*75.4*/("""}"""),format.raw/*75.5*/("""
			"""),format.raw/*76.4*/("""#bottom-brand """),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
				"""),format.raw/*77.5*/("""color: black;
			"""),format.raw/*78.4*/("""}"""),format.raw/*78.5*/("""

			"""),format.raw/*80.4*/(""".wrapper """),format.raw/*80.13*/("""{"""),format.raw/*80.14*/("""
				"""),format.raw/*81.5*/("""padding-top: 10em;
				padding-left: 16em;
				padding-right: 16em;
				padding-bottom: 5em;
			"""),format.raw/*85.4*/("""}"""),format.raw/*85.5*/("""
			"""),format.raw/*86.4*/(""".holder """),format.raw/*86.12*/("""{"""),format.raw/*86.13*/("""
				"""),format.raw/*87.5*/("""background-color: indianred;
				padding-top: 3em;
				padding-left: 9em;
				padding-right: 9em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*97.4*/("""}"""),format.raw/*97.5*/("""
			"""),format.raw/*98.4*/("""h2, label """),format.raw/*98.14*/("""{"""),format.raw/*98.15*/("""
				"""),format.raw/*99.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;

			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/("""
			"""),format.raw/*103.4*/("""h1 """),format.raw/*103.7*/("""{"""),format.raw/*103.8*/("""
				"""),format.raw/*104.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
	"""),format.raw/*107.2*/("""</style>

	<body>
	"""),_display_(/*110.3*/helper/*110.9*/.form(action= routes.RiderController.validate())/*110.57*/ {_display_(Seq[Any](format.raw/*110.59*/("""

		"""),format.raw/*112.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
			<div class="container navcontainer">
				<a class="navbar-brand" href="#">
					<img src="https://images.vexels.com/media/users/3/127711/isolated/preview/384e0b3361d99d9c370b4037115324b9-flat-vintage-car-icon-by-vexels.png" width="30" height="30" class="d-inline-block align-top" alt="">
					RideShare</a>
				<ul class="nav">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Register</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Rider</a>
							<a class="dropdown-item" href="#!">Driver</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href="#!" role="button" aria-haspopup="true" aria-expanded="false">
							Login</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#!">Rider</a>
							<a class="dropdown-item" href="#!">Driver</a>
						</div>
					</li>
				</ul>
			</div>
		</nav>

		<div class="wrapper">
			<div class="container holder">
				<h1>Rider Login</h1>
				<hr>
				<h2>Welcome back! Let's find a ride to share.<br></h2>
				<hr>
				<form>
					<div class="form-group">
					"""),_display_(/*148.7*/inputText(
						riderform("email"),
						'_showConstraints -> true,
						'type -> "email",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter Email"
					)),format.raw/*155.7*/("""
					"""),format.raw/*156.6*/("""</div>
					<div class="form-group">
					"""),_display_(/*158.7*/inputText(
						riderform("password"),
						'_showConstraints -> true,
						'type -> "password",
						'class -> "form-control",
						'id -> "exampleInputPassword1",
						'placeholder -> "Password"
					)),format.raw/*165.7*/("""
					"""),format.raw/*166.6*/("""</div>
					<button type="submit" class="btn btn-primary btn-block btn-success">Rider Sign In!</button>
				</form>
			</div>
		</div>




		<nav class="navbar cnavbar-collapse collapse fixed-bottom navbar-footer">
			<div class="container navcontainer">
				<a class="navbar-brand" id="bottom-brand" href="#">
					RideShare</a>
				<ul class="nav">
					<li class="nav-item-bottom">
						<a class="nav-link" id="footerlink" href="#">Terms</a>
					</li>
					<li class="nav-item-bottom">
						<a class="nav-link" id="footerlink" href="#">Services</a>
					</li>
					<li class="nav-item-bottom">
						<a class="nav-link" id="footerlink" href="#">Financial</a>
					</li>
					<li class="nav-item-bottom">
						<a class="nav-link" id="footerlink" href="#">Security</a>
					</li>
					<li class="nav-item-bottom">
						<a class="nav-link" id="footerlink" href="#">Social Media</a>
					</li>
				</ul>
			</div>
		</nav>
	""")))}),format.raw/*198.3*/("""
	"""),format.raw/*199.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(riderform:Form[Rider]): play.twirl.api.HtmlFormat.Appendable = apply(riderform)

  def f:((Form[Rider]) => play.twirl.api.HtmlFormat.Appendable) = (riderform) => apply(riderform)

  def ref: this.type = this

}


}
}

/**/
object loginrider extends loginrider_Scope0.loginrider_Scope1.loginrider
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:19 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/loginrider.scala.html
                  HASH: eb9fbe97d7ff4550223e7fcd27885c0fb7b579a7
                  MATRIX: 809->21|928->45|958->49|2144->1208|2159->1214|2223->1256|2587->1592|2616->1593|2649->1599|2694->1617|2722->1618|2754->1623|2796->1637|2825->1638|2858->1644|2923->1682|2951->1683|2983->1688|3025->1702|3054->1703|3087->1709|3159->1754|3187->1755|3221->1762|3253->1767|3282->1768|3315->1774|3360->1792|3388->1793|3420->1798|3471->1821|3500->1822|3533->1828|3663->1931|3691->1932|3723->1937|3759->1945|3788->1946|3821->1952|3893->1997|3921->1998|3953->2003|3995->2017|4024->2018|4057->2024|4159->2099|4187->2100|4219->2105|4257->2115|4286->2116|4319->2122|4421->2197|4449->2198|4481->2203|4530->2224|4559->2225|4592->2231|4686->2298|4714->2299|4748->2306|4791->2321|4820->2322|4853->2328|4911->2359|4939->2360|4971->2365|5011->2377|5040->2378|5073->2384|5175->2459|5203->2460|5235->2465|5277->2479|5306->2480|5339->2486|5384->2504|5412->2505|5446->2512|5483->2521|5512->2522|5545->2528|5672->2628|5700->2629|5732->2634|5768->2642|5797->2643|5830->2649|6181->2973|6209->2974|6241->2979|6279->2989|6308->2990|6341->2996|6438->3065|6467->3066|6500->3071|6531->3074|6560->3075|6594->3081|6675->3134|6704->3135|6735->3138|6785->3161|6800->3167|6858->3215|6899->3217|6933->3223|8334->4597|8571->4813|8606->4820|8678->4865|8915->5081|8950->5088|9942->6049|9973->6052
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|118->86|118->86|118->86|119->87|129->97|129->97|130->98|130->98|130->98|131->99|134->102|134->102|135->103|135->103|135->103|136->104|138->106|138->106|139->107|142->110|142->110|142->110|142->110|144->112|180->148|187->155|188->156|190->158|197->165|198->166|230->198|231->199
                  -- GENERATED --
              */
          