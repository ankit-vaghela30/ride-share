
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridesofridersearchresult_Scope0 {
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

class ridesofridersearchresult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Ride],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(ridesToShow: List[Ride]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<html xmlns="http://www.w3.org/1999/html">
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
	"""),_display_(/*114.3*/for(ridesToShow <- ridesToShow) yield /*114.34*/ {_display_(Seq[Any](format.raw/*114.36*/("""

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
						<p><a href=""""),_display_(/*147.20*/routes/*147.26*/.RideController.rate(ridesToShow.rideId)),format.raw/*147.66*/("""">Rate this Ride</a></p>
					</div>

					<br class="form-row">
						<p>Ride Source: """),_display_(/*151.24*/ridesToShow/*151.35*/.source),format.raw/*151.42*/("""</p></br>
					<p>Ride Destination: """),_display_(/*152.28*/ridesToShow/*152.39*/.destination),format.raw/*152.51*/("""</p></br>
					<p>Ride Time: """),_display_(/*153.21*/ridesToShow/*153.32*/.startTime),format.raw/*153.42*/("""</p>
					</div>
				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*159.17*/("""{"""),format.raw/*159.18*/("""
					"""),format.raw/*160.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*161.49*/("""{"""),format.raw/*161.50*/("""
						"""),format.raw/*162.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*163.55*/("""{"""),format.raw/*163.56*/("""
							"""),format.raw/*164.8*/("""if (form.checkValidity() === false) """),format.raw/*164.44*/("""{"""),format.raw/*164.45*/("""
								"""),format.raw/*165.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*167.8*/("""}"""),format.raw/*167.9*/("""
							"""),format.raw/*168.8*/("""form.classList.add('was-validated');
						"""),format.raw/*169.7*/("""}"""),format.raw/*169.8*/(""", false);
					"""),format.raw/*170.6*/("""}"""),format.raw/*170.7*/(""", false);
				"""),format.raw/*171.5*/("""}"""),format.raw/*171.6*/(""")();
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
	""")))}),format.raw/*196.3*/("""
	"""),format.raw/*197.2*/("""</body>
</html>"""))
      }
    }
  }

  def render(ridesToShow:List[Ride]): play.twirl.api.HtmlFormat.Appendable = apply(ridesToShow)

  def f:((List[Ride]) => play.twirl.api.HtmlFormat.Appendable) = (ridesToShow) => apply(ridesToShow)

  def ref: this.type = this

}


}

/**/
object ridesofridersearchresult extends ridesofridersearchresult_Scope0.ridesofridersearchresult
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridesofridersearchresult.scala.html
                  HASH: b1de4b45a8ec17ede70509b2676aba04e49327b5
                  MATRIX: 787->3|907->28|935->30|2151->1219|2166->1225|2237->1274|2593->1602|2622->1603|2654->1608|2698->1625|2726->1626|2757->1630|2799->1644|2828->1645|2860->1650|2923->1686|2951->1687|2982->1691|3024->1705|3053->1706|3085->1711|3155->1754|3183->1755|3215->1760|3247->1765|3276->1766|3308->1771|3352->1788|3380->1789|3411->1793|3462->1816|3491->1817|3523->1822|3649->1921|3677->1922|3708->1926|3744->1934|3773->1935|3805->1940|3875->1983|3903->1984|3934->1988|3976->2002|4005->2003|4037->2008|4136->2080|4164->2081|4195->2085|4233->2095|4262->2096|4294->2101|4393->2173|4421->2174|4452->2178|4501->2199|4530->2200|4562->2205|4654->2270|4682->2271|4714->2276|4757->2291|4786->2292|4818->2297|4874->2326|4902->2327|4933->2331|4973->2343|5002->2344|5034->2349|5133->2421|5161->2422|5192->2426|5234->2440|5263->2441|5295->2446|5339->2463|5367->2464|5399->2469|5436->2478|5465->2479|5497->2484|5619->2579|5647->2580|5679->2585|5715->2593|5744->2594|5776->2599|6117->2913|6145->2914|6176->2918|6210->2924|6239->2925|6272->2930|6351->2981|6380->2982|6413->2987|6446->2992|6476->2993|6509->2998|6558->3019|6587->3020|6619->3024|6666->3042|6696->3043|6729->3048|6823->3114|6852->3115|6882->3117|6929->3137|6977->3168|7018->3170|7050->3174|8357->4453|8373->4459|8435->4499|8551->4587|8572->4598|8601->4605|8666->4642|8687->4653|8721->4665|8779->4695|8800->4706|8832->4716|8936->4791|8966->4792|9000->4798|9091->4860|9121->4861|9156->4868|9295->4978|9325->4979|9361->4987|9426->5023|9456->5024|9493->5033|9585->5097|9614->5098|9650->5106|9721->5149|9750->5150|9793->5165|9822->5166|9864->5180|9893->5181|10731->5988|10761->5990
                  LINES: 27->3|32->3|34->5|48->19|48->19|48->19|56->27|56->27|57->28|58->29|58->29|59->30|59->30|59->30|60->31|62->33|62->33|63->34|63->34|63->34|64->35|66->37|66->37|68->39|68->39|68->39|69->40|70->41|70->41|71->42|71->42|71->42|72->43|76->47|76->47|77->48|77->48|77->48|78->49|80->51|80->51|81->52|81->52|81->52|82->53|85->56|85->56|86->57|86->57|86->57|87->58|90->61|90->61|91->62|91->62|91->62|92->63|94->65|94->65|96->67|96->67|96->67|97->68|99->70|99->70|100->71|100->71|100->71|101->72|104->75|104->75|105->76|105->76|105->76|106->77|107->78|107->78|109->80|109->80|109->80|110->81|114->85|114->85|116->87|116->87|116->87|117->88|127->98|127->98|128->99|128->99|128->99|129->100|131->102|131->102|133->104|133->104|133->104|134->105|135->106|135->106|136->107|136->107|136->107|137->108|139->110|139->110|140->111|143->114|143->114|143->114|145->116|176->147|176->147|176->147|180->151|180->151|180->151|181->152|181->152|181->152|182->153|182->153|182->153|188->159|188->159|189->160|190->161|190->161|191->162|192->163|192->163|193->164|193->164|193->164|194->165|196->167|196->167|197->168|198->169|198->169|199->170|199->170|200->171|200->171|225->196|226->197
                  -- GENERATED --
              */
          