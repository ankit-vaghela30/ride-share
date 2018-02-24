
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object drivershow_Scope0 {
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

class drivershow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Driver,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(driver: Driver):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		<title>Driver Profile</title>


			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*18.64*/routes/*18.70*/.Assets.versioned("stylesheets/profile.css")),format.raw/*18.114*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

	</head>
	<style>

			.nav_text """),format.raw/*26.14*/("""{"""),format.raw/*26.15*/("""
				"""),format.raw/*27.5*/("""color: white;
			"""),format.raw/*28.4*/("""}"""),format.raw/*28.5*/("""
			"""),format.raw/*29.4*/(""".navbar-header"""),format.raw/*29.18*/("""{"""),format.raw/*29.19*/("""
				"""),format.raw/*30.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			"""),format.raw/*33.4*/(""".navcontainer """),format.raw/*33.18*/("""{"""),format.raw/*33.19*/("""
				"""),format.raw/*34.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*36.4*/("""}"""),format.raw/*36.5*/("""

			"""),format.raw/*38.4*/("""body """),format.raw/*38.9*/("""{"""),format.raw/*38.10*/("""
				"""),format.raw/*39.5*/("""margin: auto;
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/("""
			"""),format.raw/*41.4*/(""".navbar, .navbar-fixed """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
				"""),format.raw/*42.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*46.4*/("""}"""),format.raw/*46.5*/("""
			"""),format.raw/*47.4*/("""#navbar """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
				"""),format.raw/*48.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*50.4*/("""}"""),format.raw/*50.5*/("""
			"""),format.raw/*51.4*/(""".navbar-brand """),format.raw/*51.18*/("""{"""),format.raw/*51.19*/("""
				"""),format.raw/*52.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/("""
			"""),format.raw/*56.4*/(""".nav-link """),format.raw/*56.14*/("""{"""),format.raw/*56.15*/("""
				"""),format.raw/*57.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/("""
			"""),format.raw/*61.4*/("""nav.navbar.fixed-top """),format.raw/*61.25*/("""{"""),format.raw/*61.26*/("""
				"""),format.raw/*62.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*64.4*/("""}"""),format.raw/*64.5*/("""

			"""),format.raw/*66.4*/(""".navbar-footer """),format.raw/*66.19*/("""{"""),format.raw/*66.20*/("""
				"""),format.raw/*67.5*/("""background-color: white;

			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""
			"""),format.raw/*70.4*/("""#footerlink """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
				"""),format.raw/*71.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/("""
			"""),format.raw/*75.4*/("""#bottom-brand """),format.raw/*75.18*/("""{"""),format.raw/*75.19*/("""
				"""),format.raw/*76.5*/("""color: black;
			"""),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""


			"""),format.raw/*80.4*/(""".wrapper """),format.raw/*80.13*/("""{"""),format.raw/*80.14*/("""
				"""),format.raw/*81.5*/("""padding-top: 2em;
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
			"""),format.raw/*98.4*/("""h1 """),format.raw/*98.7*/("""{"""),format.raw/*98.8*/("""
				"""),format.raw/*99.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""h2 """),format.raw/*102.7*/("""{"""),format.raw/*102.8*/("""
				"""),format.raw/*103.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;
				font-size: 18px;

			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
			"""),format.raw/*108.4*/("""h3 """),format.raw/*108.7*/("""{"""),format.raw/*108.8*/("""
				"""),format.raw/*109.5*/("""color: white;
				font-family: 'Bitter', serif;
				font-size: 20px;
			"""),format.raw/*112.4*/("""}"""),format.raw/*112.5*/("""
			"""),format.raw/*113.4*/("""p """),format.raw/*113.6*/("""{"""),format.raw/*113.7*/("""
				"""),format.raw/*114.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*116.4*/("""}"""),format.raw/*116.5*/("""
			"""),format.raw/*117.4*/(""".section-header """),format.raw/*117.20*/("""{"""),format.raw/*117.21*/("""
				"""),format.raw/*118.5*/("""font-size: 25px
			"""),format.raw/*119.4*/("""}"""),format.raw/*119.5*/("""
			"""),format.raw/*120.4*/("""a.btn.btn-success.btn-block """),format.raw/*120.32*/("""{"""),format.raw/*120.33*/("""
				"""),format.raw/*121.5*/("""color: white;
			"""),format.raw/*122.4*/("""}"""),format.raw/*122.5*/("""

	"""),format.raw/*124.2*/("""</style>

	<body>
		<nav class="navbar fixed-top cnavbar-collapse collapse">
			<div class="container navcontainer">
				<a class="navbar-brand" href="#!">
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
			<div class="holder">
				<h1>Welcome, """),_display_(/*159.19*/driver/*159.25*/.firstName),format.raw/*159.35*/("""</h1>
				<hr>
				<h2>From here, you can add vehicles, create rides, and delete your account!</h2>
				<hr>
				<h3>Driver Information</h3>
				<p>Driver Id: """),_display_(/*164.20*/driver/*164.26*/.driverId),format.raw/*164.35*/("""</p>
				<p>Driver First Name: """),_display_(/*165.28*/driver/*165.34*/.firstName),format.raw/*165.44*/("""</p>
				<p>Driver Last Name: """),_display_(/*166.27*/driver/*166.33*/.lastName),format.raw/*166.42*/("""</p>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*169.50*/routes/*169.56*/.VehicleController.create()),format.raw/*169.83*/("""">Create a Vehicle</a>
				</div>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*173.50*/routes/*173.56*/.RideController.create()),format.raw/*173.80*/("""">Create a Ride</a>
				</div>
				<hr>
				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*177.50*/routes/*177.56*/.DriverController.destroy(driver.driverId)),format.raw/*177.98*/("""">Delete Account</a>
				</div>
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
	</body>
</html>
"""))
      }
    }
  }

  def render(driver:Driver): play.twirl.api.HtmlFormat.Appendable = apply(driver)

  def f:((Driver) => play.twirl.api.HtmlFormat.Appendable) = (driver) => apply(driver)

  def ref: this.type = this

}


}

/**/
object drivershow extends drivershow_Scope0.drivershow
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:19 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/drivershow.scala.html
                  HASH: 26a1908c727149908e384bb3206e7260d60b9580
                  MATRIX: 755->1|866->17|894->19|2070->1168|2085->1174|2151->1218|2507->1546|2536->1547|2568->1552|2612->1569|2640->1570|2671->1574|2713->1588|2742->1589|2774->1594|2837->1630|2865->1631|2896->1635|2938->1649|2967->1650|2999->1655|3069->1698|3097->1699|3129->1704|3161->1709|3190->1710|3222->1715|3266->1732|3294->1733|3325->1737|3376->1760|3405->1761|3437->1766|3563->1865|3591->1866|3622->1870|3658->1878|3687->1879|3719->1884|3789->1927|3817->1928|3848->1932|3890->1946|3919->1947|3951->1952|4050->2024|4078->2025|4109->2029|4147->2039|4176->2040|4208->2045|4307->2117|4335->2118|4366->2122|4415->2143|4444->2144|4476->2149|4568->2214|4596->2215|4628->2220|4671->2235|4700->2236|4732->2241|4788->2270|4816->2271|4847->2275|4887->2287|4916->2288|4948->2293|5047->2365|5075->2366|5106->2370|5148->2384|5177->2385|5209->2390|5253->2407|5281->2408|5314->2414|5351->2423|5380->2424|5412->2429|5534->2524|5562->2525|5593->2529|5629->2537|5658->2538|5690->2543|6031->2857|6059->2858|6090->2862|6120->2865|6148->2866|6180->2871|6259->2922|6288->2923|6320->2927|6351->2930|6380->2931|6413->2936|6528->3023|6557->3024|6589->3028|6620->3031|6649->3032|6682->3037|6782->3109|6811->3110|6843->3114|6873->3116|6902->3117|6935->3122|7028->3187|7057->3188|7089->3192|7134->3208|7164->3209|7197->3214|7244->3233|7273->3234|7305->3238|7362->3266|7392->3267|7425->3272|7470->3289|7499->3290|7530->3293|8778->4513|8794->4519|8826->4529|9014->4689|9030->4695|9061->4704|9121->4736|9137->4742|9169->4752|9228->4783|9244->4789|9275->4798|9394->4889|9410->4895|9459->4922|9607->5042|9623->5048|9669->5072|9814->5189|9830->5195|9894->5237
                  LINES: 27->1|32->1|34->3|49->18|49->18|49->18|57->26|57->26|58->27|59->28|59->28|60->29|60->29|60->29|61->30|63->32|63->32|64->33|64->33|64->33|65->34|67->36|67->36|69->38|69->38|69->38|70->39|71->40|71->40|72->41|72->41|72->41|73->42|77->46|77->46|78->47|78->47|78->47|79->48|81->50|81->50|82->51|82->51|82->51|83->52|86->55|86->55|87->56|87->56|87->56|88->57|91->60|91->60|92->61|92->61|92->61|93->62|95->64|95->64|97->66|97->66|97->66|98->67|100->69|100->69|101->70|101->70|101->70|102->71|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|111->80|111->80|111->80|112->81|116->85|116->85|117->86|117->86|117->86|118->87|128->97|128->97|129->98|129->98|129->98|130->99|132->101|132->101|133->102|133->102|133->102|134->103|138->107|138->107|139->108|139->108|139->108|140->109|143->112|143->112|144->113|144->113|144->113|145->114|147->116|147->116|148->117|148->117|148->117|149->118|150->119|150->119|151->120|151->120|151->120|152->121|153->122|153->122|155->124|190->159|190->159|190->159|195->164|195->164|195->164|196->165|196->165|196->165|197->166|197->166|197->166|200->169|200->169|200->169|204->173|204->173|204->173|208->177|208->177|208->177
                  -- GENERATED --
              */
          