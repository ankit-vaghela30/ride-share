
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object driverindex_Scope0 {
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

     object driverindex_Scope1 {
import helper._

class driverindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Driver],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(drivers: List[Driver]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<html>
	<head>
		<title>Driver Registration</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/registration.css")),format.raw/*19.119*/("""'>
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

			"""),format.raw/*80.4*/(""".formdiv """),format.raw/*80.13*/("""{"""),format.raw/*80.14*/("""
				"""),format.raw/*81.5*/("""padding-top: 5em;
				padding-left: 10em;
				padding-right: 10em;
				padding-bottom: 5em;
			"""),format.raw/*85.4*/("""}"""),format.raw/*85.5*/("""

			"""),format.raw/*87.4*/(""".holder """),format.raw/*87.12*/("""{"""),format.raw/*87.13*/("""
				"""),format.raw/*88.5*/("""background-color: indianred;
				padding-top: 3em;
				padding-left: 7em;
				padding-right: 7em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*98.4*/("""}"""),format.raw/*98.5*/("""
			"""),format.raw/*99.4*/("""label """),format.raw/*99.10*/("""{"""),format.raw/*99.11*/("""
				"""),format.raw/*100.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/("""

			"""),format.raw/*104.4*/(""".fg2 """),format.raw/*104.9*/("""{"""),format.raw/*104.10*/("""
				"""),format.raw/*105.5*/("""padding-top: 1em;
			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
			"""),format.raw/*107.4*/(""".invalid-feedback """),format.raw/*107.22*/("""{"""),format.raw/*107.23*/("""
				"""),format.raw/*108.5*/("""color: orange;
				font-family: 'Source Sans Pro', sans-serif;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
	"""),format.raw/*111.2*/("""</style>

	<body>
	"""),_display_(/*114.3*/for(driver <- drivers) yield /*114.25*/{_display_(Seq[Any](format.raw/*114.26*/("""

		"""),format.raw/*116.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
							<a href=""""),_display_(/*148.18*/routes/*148.24*/.DriverController.show(driver.driverId)),format.raw/*148.63*/("""">"""),_display_(/*148.66*/driver/*148.72*/.driverId),format.raw/*148.81*/("""</a>
							<p>Driver Name: """),_display_(/*149.25*/driver/*149.31*/.firstName),format.raw/*149.41*/("""</p>
						</div>
						<a href=""""),_display_(/*151.17*/routes/*151.23*/.DriverController.create()),format.raw/*151.49*/("""">Create Driver</a>
					</div>
				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*157.17*/("""{"""),format.raw/*157.18*/("""
					"""),format.raw/*158.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*159.49*/("""{"""),format.raw/*159.50*/("""
						"""),format.raw/*160.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*161.55*/("""{"""),format.raw/*161.56*/("""
							"""),format.raw/*162.8*/("""if (form.checkValidity() === false) """),format.raw/*162.44*/("""{"""),format.raw/*162.45*/("""
								"""),format.raw/*163.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*165.8*/("""}"""),format.raw/*165.9*/("""
							"""),format.raw/*166.8*/("""form.classList.add('was-validated');
						"""),format.raw/*167.7*/("""}"""),format.raw/*167.8*/(""", false);
					"""),format.raw/*168.6*/("""}"""),format.raw/*168.7*/(""", false);
				"""),format.raw/*169.5*/("""}"""),format.raw/*169.6*/(""")();
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
	""")))}),format.raw/*194.3*/("""
	"""),format.raw/*195.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(drivers:List[Driver]): play.twirl.api.HtmlFormat.Appendable = apply(drivers)

  def f:((List[Driver]) => play.twirl.api.HtmlFormat.Appendable) = (drivers) => apply(drivers)

  def ref: this.type = this

}


}
}

/**/
object driverindex extends driverindex_Scope0.driverindex_Scope1.driverindex
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:19 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/driverindex.scala.html
                  HASH: ec6ad20acdd25ef6ec1c4878b0b2636a0f2ebcfd
                  MATRIX: 813->19|931->42|959->44|2139->1197|2154->1203|2225->1252|2581->1580|2610->1581|2642->1586|2686->1603|2714->1604|2745->1608|2787->1622|2816->1623|2848->1628|2911->1664|2939->1665|2970->1669|3012->1683|3041->1684|3073->1689|3143->1732|3171->1733|3203->1738|3235->1743|3264->1744|3296->1749|3340->1766|3368->1767|3399->1771|3450->1794|3479->1795|3511->1800|3637->1899|3665->1900|3696->1904|3732->1912|3761->1913|3793->1918|3863->1961|3891->1962|3922->1966|3964->1980|3993->1981|4025->1986|4124->2058|4152->2059|4183->2063|4221->2073|4250->2074|4282->2079|4381->2151|4409->2152|4440->2156|4489->2177|4518->2178|4550->2183|4642->2248|4670->2249|4702->2254|4745->2269|4774->2270|4806->2275|4862->2304|4890->2305|4921->2309|4961->2321|4990->2322|5022->2327|5121->2399|5149->2400|5180->2404|5222->2418|5251->2419|5283->2424|5327->2441|5355->2442|5387->2447|5424->2456|5453->2457|5485->2462|5607->2557|5635->2558|5667->2563|5703->2571|5732->2572|5764->2577|6105->2891|6133->2892|6164->2896|6198->2902|6227->2903|6260->2908|6339->2959|6368->2960|6401->2965|6434->2970|6464->2971|6497->2976|6546->2997|6575->2998|6607->3002|6654->3020|6684->3021|6717->3026|6811->3092|6840->3093|6870->3095|6917->3115|6956->3137|6996->3138|7028->3142|8361->4447|8377->4453|8438->4492|8469->4495|8485->4501|8516->4510|8573->4539|8589->4545|8621->4555|8683->4589|8699->4595|8747->4621|8866->4711|8896->4712|8930->4718|9021->4780|9051->4781|9086->4788|9225->4898|9255->4899|9291->4907|9356->4943|9386->4944|9423->4953|9515->5017|9544->5018|9580->5026|9651->5069|9680->5070|9723->5085|9752->5086|9794->5100|9823->5101|10661->5908|10691->5910
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|119->87|119->87|119->87|120->88|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|136->104|136->104|136->104|137->105|138->106|138->106|139->107|139->107|139->107|140->108|142->110|142->110|143->111|146->114|146->114|146->114|148->116|180->148|180->148|180->148|180->148|180->148|180->148|181->149|181->149|181->149|183->151|183->151|183->151|189->157|189->157|190->158|191->159|191->159|192->160|193->161|193->161|194->162|194->162|194->162|195->163|197->165|197->165|198->166|199->167|199->167|200->168|200->168|201->169|201->169|226->194|227->195
                  -- GENERATED --
              */
          