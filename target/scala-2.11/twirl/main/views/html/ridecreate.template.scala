
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridecreate_Scope0 {
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

     object ridecreate_Scope1 {
import helper._

class ridecreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Ride],Driver,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(rideform: Form[Ride], driver: Driver):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.40*/("""

"""),format.raw/*6.1*/("""<html>
	<head>
		<title>Rider Registration</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*20.64*/routes/*20.70*/.Assets.versioned("stylesheets/registration.css")),format.raw/*20.119*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

	</head>

	<style>
			.nav_text """),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
				"""),format.raw/*29.5*/("""color: white;
			"""),format.raw/*30.4*/("""}"""),format.raw/*30.5*/("""
			"""),format.raw/*31.4*/(""".navbar-header"""),format.raw/*31.18*/("""{"""),format.raw/*31.19*/("""
				"""),format.raw/*32.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/("""
			"""),format.raw/*35.4*/(""".navcontainer """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
				"""),format.raw/*36.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*38.4*/("""}"""),format.raw/*38.5*/("""

			"""),format.raw/*40.4*/("""body """),format.raw/*40.9*/("""{"""),format.raw/*40.10*/("""
				"""),format.raw/*41.5*/("""margin: auto;
			"""),format.raw/*42.4*/("""}"""),format.raw/*42.5*/("""
			"""),format.raw/*43.4*/(""".navbar, .navbar-fixed """),format.raw/*43.27*/("""{"""),format.raw/*43.28*/("""
				"""),format.raw/*44.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/("""
			"""),format.raw/*49.4*/("""#navbar """),format.raw/*49.12*/("""{"""),format.raw/*49.13*/("""
				"""),format.raw/*50.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*52.4*/("""}"""),format.raw/*52.5*/("""
			"""),format.raw/*53.4*/(""".navbar-brand """),format.raw/*53.18*/("""{"""),format.raw/*53.19*/("""
				"""),format.raw/*54.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
			"""),format.raw/*58.4*/(""".nav-link """),format.raw/*58.14*/("""{"""),format.raw/*58.15*/("""
				"""),format.raw/*59.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*62.4*/("""}"""),format.raw/*62.5*/("""
			"""),format.raw/*63.4*/("""nav.navbar.fixed-top """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
				"""),format.raw/*64.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*66.4*/("""}"""),format.raw/*66.5*/("""

			"""),format.raw/*68.4*/(""".navbar-footer """),format.raw/*68.19*/("""{"""),format.raw/*68.20*/("""
				"""),format.raw/*69.5*/("""background-color: white;

			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/("""
			"""),format.raw/*72.4*/("""#footerlink """),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
				"""),format.raw/*73.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*76.4*/("""}"""),format.raw/*76.5*/("""
			"""),format.raw/*77.4*/("""#bottom-brand """),format.raw/*77.18*/("""{"""),format.raw/*77.19*/("""
				"""),format.raw/*78.5*/("""color: black;
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""

			"""),format.raw/*81.4*/(""".formdiv """),format.raw/*81.13*/("""{"""),format.raw/*81.14*/("""
				"""),format.raw/*82.5*/("""padding-top: 5em;
				padding-left: 10em;
				padding-right: 10em;
				padding-bottom: 5em;
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/("""

			"""),format.raw/*88.4*/(""".holder """),format.raw/*88.12*/("""{"""),format.raw/*88.13*/("""
				"""),format.raw/*89.5*/("""background-color: indianred;
				padding-top: 3em;
				padding-left: 7em;
				padding-right: 7em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*99.4*/("""}"""),format.raw/*99.5*/("""
			"""),format.raw/*100.4*/("""label """),format.raw/*100.10*/("""{"""),format.raw/*100.11*/("""
				"""),format.raw/*101.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*103.4*/("""}"""),format.raw/*103.5*/("""

			"""),format.raw/*105.4*/(""".fg2 """),format.raw/*105.9*/("""{"""),format.raw/*105.10*/("""
				"""),format.raw/*106.5*/("""padding-top: 1em;
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
			"""),format.raw/*108.4*/(""".invalid-feedback """),format.raw/*108.22*/("""{"""),format.raw/*108.23*/("""
				"""),format.raw/*109.5*/("""color: orange;
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*111.4*/("""}"""),format.raw/*111.5*/("""
	"""),format.raw/*112.2*/("""</style>

	<body>
	"""),_display_(/*115.3*/helper/*115.9*/.form(action= routes.RideController.save())/*115.52*/ {_display_(Seq[Any](format.raw/*115.54*/("""

		"""),format.raw/*117.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
		<div class="container formdiv">
			<div class="holder">
				<form id="needs-validation" novalidate>

					<div class="form-row">
						<div class="col fg2">
						"""),_display_(/*150.8*/helper/*150.14*/.select(
							rideform("vehicle.vehicleId"),
							options(driver.options),
							'_label -> "Vehicles", '_default -> "-- Choose your Vehicle --",
							'_showConstraints -> false
						)),format.raw/*155.8*/("""
						"""),format.raw/*156.7*/("""</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*161.9*/inputText(
								rideform("source"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "source",
								'placeholder -> "Source or Start Location"
							)),format.raw/*168.9*/("""
							"""),format.raw/*169.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>


					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*178.9*/inputText(
								rideform("destination"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "destination",
								'placeholder -> "Destination or Stop Location"
							)),format.raw/*185.9*/("""
							"""),format.raw/*186.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*194.9*/inputText(
								rideform("cost"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "cost",
								'placeholder -> "Cost of the ride"
							)),format.raw/*201.9*/("""
							"""),format.raw/*202.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>

					<div class="form-row">
						<div class="col fg2">
							"""),_display_(/*210.9*/inputText(
								rideform("startTime"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "startTime",
								'placeholder -> "Starting time of the ride"
							)),format.raw/*217.9*/("""
							"""),format.raw/*218.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>

					<button type="submit" class="btn btn-success btn-block">Create Ride!</button>



				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*232.17*/("""{"""),format.raw/*232.18*/("""
					"""),format.raw/*233.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*234.49*/("""{"""),format.raw/*234.50*/("""
						"""),format.raw/*235.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*236.55*/("""{"""),format.raw/*236.56*/("""
							"""),format.raw/*237.8*/("""if (form.checkValidity() === false) """),format.raw/*237.44*/("""{"""),format.raw/*237.45*/("""
								"""),format.raw/*238.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*240.8*/("""}"""),format.raw/*240.9*/("""
							"""),format.raw/*241.8*/("""form.classList.add('was-validated');
						"""),format.raw/*242.7*/("""}"""),format.raw/*242.8*/(""", false);
					"""),format.raw/*243.6*/("""}"""),format.raw/*243.7*/(""", false);
				"""),format.raw/*244.5*/("""}"""),format.raw/*244.6*/(""")();
		</script>
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
	""")))}),format.raw/*269.3*/("""
	"""),format.raw/*270.2*/("""</body>
</html>


"""))
      }
    }
  }

  def render(rideform:Form[Ride],driver:Driver): play.twirl.api.HtmlFormat.Appendable = apply(rideform,driver)

  def f:((Form[Ride],Driver) => play.twirl.api.HtmlFormat.Appendable) = (rideform,driver) => apply(rideform,driver)

  def ref: this.type = this

}


}
}

/**/
object ridecreate extends ridecreate_Scope0.ridecreate_Scope1.ridecreate
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridecreate.scala.html
                  HASH: af27d768236e187caee90e001b4241b239f94596
                  MATRIX: 815->23|948->61|978->65|2171->1231|2186->1237|2257->1286|2621->1622|2650->1623|2683->1629|2728->1647|2756->1648|2788->1653|2830->1667|2859->1668|2892->1674|2957->1712|2985->1713|3017->1718|3059->1732|3088->1733|3121->1739|3193->1784|3221->1785|3255->1792|3287->1797|3316->1798|3349->1804|3394->1822|3422->1823|3454->1828|3505->1851|3534->1852|3567->1858|3697->1961|3725->1962|3757->1967|3793->1975|3822->1976|3855->1982|3927->2027|3955->2028|3987->2033|4029->2047|4058->2048|4091->2054|4193->2129|4221->2130|4253->2135|4291->2145|4320->2146|4353->2152|4455->2227|4483->2228|4515->2233|4564->2254|4593->2255|4626->2261|4720->2328|4748->2329|4782->2336|4825->2351|4854->2352|4887->2358|4945->2389|4973->2390|5005->2395|5045->2407|5074->2408|5107->2414|5209->2489|5237->2490|5269->2495|5311->2509|5340->2510|5373->2516|5418->2534|5446->2535|5480->2542|5517->2551|5546->2552|5579->2558|5705->2657|5733->2658|5767->2665|5803->2673|5832->2674|5865->2680|6216->3004|6244->3005|6277->3010|6312->3016|6342->3017|6376->3023|6457->3076|6486->3077|6521->3084|6554->3089|6584->3090|6618->3096|6668->3118|6697->3119|6730->3124|6777->3142|6807->3143|6841->3149|6937->3217|6966->3218|6997->3221|7047->3244|7062->3250|7115->3293|7156->3295|7190->3301|8546->4630|8562->4636|8780->4833|8816->4841|8932->4930|9177->5154|9214->5163|9418->5340|9677->5578|9714->5587|9916->5762|10149->5974|10186->5983|10388->6158|10640->6389|10677->6398|10967->6659|10997->6660|11032->6667|11124->6730|11154->6731|11190->6739|11330->6850|11360->6851|11397->6860|11462->6896|11492->6897|11530->6907|11624->6973|11653->6974|11690->6983|11762->7027|11791->7028|11835->7044|11864->7045|11907->7060|11936->7061|12799->7893|12830->7896
                  LINES: 30->4|35->4|37->6|51->20|51->20|51->20|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|65->34|65->34|66->35|66->35|66->35|67->36|69->38|69->38|71->40|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|79->48|79->48|80->49|80->49|80->49|81->50|83->52|83->52|84->53|84->53|84->53|85->54|88->57|88->57|89->58|89->58|89->58|90->59|93->62|93->62|94->63|94->63|94->63|95->64|97->66|97->66|99->68|99->68|99->68|100->69|102->71|102->71|103->72|103->72|103->72|104->73|107->76|107->76|108->77|108->77|108->77|109->78|110->79|110->79|112->81|112->81|112->81|113->82|117->86|117->86|119->88|119->88|119->88|120->89|130->99|130->99|131->100|131->100|131->100|132->101|134->103|134->103|136->105|136->105|136->105|137->106|138->107|138->107|139->108|139->108|139->108|140->109|142->111|142->111|143->112|146->115|146->115|146->115|146->115|148->117|181->150|181->150|186->155|187->156|192->161|199->168|200->169|209->178|216->185|217->186|225->194|232->201|233->202|241->210|248->217|249->218|263->232|263->232|264->233|265->234|265->234|266->235|267->236|267->236|268->237|268->237|268->237|269->238|271->240|271->240|272->241|273->242|273->242|274->243|274->243|275->244|275->244|300->269|301->270
                  -- GENERATED --
              */
          