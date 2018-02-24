
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridesearchresult_Scope0 {
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

class ridesearchresult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Ride],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(ridesToShow: List[Ride]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""

"""),format.raw/*4.1*/("""<html>
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
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.64*/routes/*19.70*/.Assets.versioned("stylesheets/profile.css")),format.raw/*19.114*/("""'>
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
				<h1>Filtered Rides</h1>
				"""),_display_(/*161.6*/for(ridesToShow <- ridesToShow) yield /*161.37*/{_display_(Seq[Any](format.raw/*161.38*/("""
					"""),format.raw/*162.6*/("""<p><a href=""""),_display_(/*162.19*/routes/*162.25*/.RideController.register(ridesToShow.rideId)),format.raw/*162.69*/("""">Select this ride</a></p>
					<p>Ride Source: """),_display_(/*163.23*/ridesToShow/*163.34*/.source),format.raw/*163.41*/("""</p>
					<p>Ride Destination: """),_display_(/*164.28*/ridesToShow/*164.39*/.destination),format.raw/*164.51*/("""</p>
					<p>Ride Time: """),_display_(/*165.21*/ridesToShow/*165.32*/.startTime),format.raw/*165.42*/("""</p>
					<p>Ride Cost: """),_display_(/*166.21*/ridesToShow/*166.32*/.cost),format.raw/*166.37*/("""</p>
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
		""")))}),format.raw/*194.4*/("""
	"""),format.raw/*195.2*/("""</body>
</html>

"""))
      }
    }
  }

  def render(ridesToShow:List[Ride]): play.twirl.api.HtmlFormat.Appendable = apply(ridesToShow)

  def f:((List[Ride]) => play.twirl.api.HtmlFormat.Appendable) = (ridesToShow) => apply(ridesToShow)

  def ref: this.type = this

}


}

/**/
object ridesearchresult extends ridesearchresult_Scope0.ridesearchresult
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridesearchresult.scala.html
                  HASH: 941e08df912e0bd7eef7c0ddeb4fca2588089f25
                  MATRIX: 771->2|891->27|919->29|2095->1178|2110->1184|2176->1228|2532->1556|2561->1557|2593->1562|2637->1579|2665->1580|2696->1584|2738->1598|2767->1599|2799->1604|2862->1640|2890->1641|2921->1645|2963->1659|2992->1660|3024->1665|3094->1708|3122->1709|3154->1714|3186->1719|3215->1720|3247->1725|3291->1742|3319->1743|3350->1747|3401->1770|3430->1771|3462->1776|3588->1875|3616->1876|3647->1880|3683->1888|3712->1889|3744->1894|3814->1937|3842->1938|3873->1942|3915->1956|3944->1957|3976->1962|4075->2034|4103->2035|4134->2039|4172->2049|4201->2050|4233->2055|4332->2127|4360->2128|4391->2132|4440->2153|4469->2154|4501->2159|4593->2224|4621->2225|4653->2230|4696->2245|4725->2246|4757->2251|4813->2280|4841->2281|4872->2285|4912->2297|4941->2298|4973->2303|5072->2375|5100->2376|5131->2380|5173->2394|5202->2395|5234->2400|5278->2417|5306->2418|5338->2423|5375->2432|5404->2433|5436->2438|5558->2533|5586->2534|5617->2538|5653->2546|5682->2547|5714->2552|6055->2866|6083->2867|6114->2871|6144->2874|6172->2875|6204->2880|6283->2931|6312->2932|6344->2936|6375->2939|6404->2940|6437->2945|6552->3032|6581->3033|6613->3037|6644->3040|6673->3041|6706->3046|6806->3118|6835->3119|6867->3123|6897->3125|6926->3126|6959->3131|7052->3196|7081->3197|7113->3201|7158->3217|7188->3218|7221->3223|7268->3242|7297->3243|7329->3247|7386->3275|7416->3276|7449->3281|7494->3298|7523->3299|7554->3302|8817->4538|8865->4569|8905->4570|8939->4576|8980->4589|8996->4595|9062->4639|9139->4688|9160->4699|9189->4706|9249->4738|9270->4749|9304->4761|9357->4786|9378->4797|9410->4807|9463->4832|9484->4843|9511->4848|10360->5666|10390->5668
                  LINES: 27->2|32->2|34->4|49->19|49->19|49->19|57->27|57->27|58->28|59->29|59->29|60->30|60->30|60->30|61->31|63->33|63->33|64->34|64->34|64->34|65->35|67->37|67->37|69->39|69->39|69->39|70->40|71->41|71->41|72->42|72->42|72->42|73->43|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|86->56|86->56|87->57|87->57|87->57|88->58|91->61|91->61|92->62|92->62|92->62|93->63|95->65|95->65|97->67|97->67|97->67|98->68|100->70|100->70|101->71|101->71|101->71|102->72|105->75|105->75|106->76|106->76|106->76|107->77|108->78|108->78|110->80|110->80|110->80|111->81|115->85|115->85|116->86|116->86|116->86|117->87|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|132->102|132->102|133->103|137->107|137->107|138->108|138->108|138->108|139->109|142->112|142->112|143->113|143->113|143->113|144->114|146->116|146->116|147->117|147->117|147->117|148->118|149->119|149->119|150->120|150->120|150->120|151->121|152->122|152->122|154->124|191->161|191->161|191->161|192->162|192->162|192->162|192->162|193->163|193->163|193->163|194->164|194->164|194->164|195->165|195->165|195->165|196->166|196->166|196->166|224->194|225->195
                  -- GENERATED --
              */
          