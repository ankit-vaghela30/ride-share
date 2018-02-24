
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridershow_Scope0 {
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

class ridershow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Rider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rider: Rider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<html>
	<head>
		<title>Rider Profile</title>


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

		.nav_text """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""
			"""),format.raw/*28.4*/("""color: white;
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
		"""),format.raw/*30.3*/(""".navbar-header"""),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
			"""),format.raw/*31.4*/("""margin-left:5px;
			width:100%;
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
		"""),format.raw/*34.3*/(""".navcontainer """),format.raw/*34.17*/("""{"""),format.raw/*34.18*/("""
			"""),format.raw/*35.4*/("""margin-left: 10%;
			margin-right: 5%;
		"""),format.raw/*37.3*/("""}"""),format.raw/*37.4*/("""

		"""),format.raw/*39.3*/("""body """),format.raw/*39.8*/("""{"""),format.raw/*39.9*/("""
			"""),format.raw/*40.4*/("""margin: auto;
		"""),format.raw/*41.3*/("""}"""),format.raw/*41.4*/("""
		"""),format.raw/*42.3*/(""".navbar, .navbar-fixed """),format.raw/*42.26*/("""{"""),format.raw/*42.27*/("""
			"""),format.raw/*43.4*/("""background-color: gray;
			opacity: .90;
			z-index: 99;
			box-shadow: 0 4px 2px -2px gray;
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
		"""),format.raw/*48.3*/("""#navbar """),format.raw/*48.11*/("""{"""),format.raw/*48.12*/("""
			"""),format.raw/*49.4*/("""margin-left: 10%;
			margin-right: 5%;
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
		"""),format.raw/*52.3*/(""".navbar-brand """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/("""
			"""),format.raw/*53.4*/("""font-family: 'Bitter', serif;
			font-size: 22px;
			color: white;
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
		"""),format.raw/*57.3*/(""".nav-link """),format.raw/*57.13*/("""{"""),format.raw/*57.14*/("""
			"""),format.raw/*58.4*/("""font-size: 16px;
			font-family: 'Bitter', serif;
			color: white;
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
		"""),format.raw/*62.3*/("""nav.navbar.fixed-top """),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
			"""),format.raw/*63.4*/("""padding: 0em;
			box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""

		"""),format.raw/*67.3*/(""".navbar-footer """),format.raw/*67.18*/("""{"""),format.raw/*67.19*/("""
			"""),format.raw/*68.4*/("""background-color: white;

		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""
		"""),format.raw/*71.3*/("""#footerlink """),format.raw/*71.15*/("""{"""),format.raw/*71.16*/("""
			"""),format.raw/*72.4*/("""font-size: 16px;
			font-family: 'Bitter', serif;
			color: black;
		"""),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
		"""),format.raw/*76.3*/("""#bottom-brand """),format.raw/*76.17*/("""{"""),format.raw/*76.18*/("""
			"""),format.raw/*77.4*/("""color: black;
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/("""


		"""),format.raw/*81.3*/(""".wrapper """),format.raw/*81.12*/("""{"""),format.raw/*81.13*/("""
			"""),format.raw/*82.4*/("""padding-top: 7em;
			padding-left: 16em;
			padding-right: 16em;
			padding-bottom: 5em;
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
		"""),format.raw/*87.3*/(""".holder """),format.raw/*87.11*/("""{"""),format.raw/*87.12*/("""
			"""),format.raw/*88.4*/("""background-color: indianred;
			padding-top: 3em;
			padding-left: 9em;
			padding-right: 9em;
			padding-bottom: 2em;
			border-bottom-left-radius: 3em;
			border-bottom-right-radius: 1em;
			border-top-right-radius: 3em;
			border-top-left-radius: 1em;
			box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
		"""),format.raw/*98.3*/("""}"""),format.raw/*98.4*/("""
		"""),format.raw/*99.3*/("""h1 """),format.raw/*99.6*/("""{"""),format.raw/*99.7*/("""
			"""),format.raw/*100.4*/("""color: white;
			font-family: 'Bitter', serif;
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/("""
		"""),format.raw/*103.3*/("""h2 """),format.raw/*103.6*/("""{"""),format.raw/*103.7*/("""
			"""),format.raw/*104.4*/("""color: white;
			font-family: 'Source Sans Pro', sans-serif;
			font-size: 18px;

		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/("""
		"""),format.raw/*109.3*/("""h3 """),format.raw/*109.6*/("""{"""),format.raw/*109.7*/("""
			"""),format.raw/*110.4*/("""color: white;
			font-family: 'Bitter', serif;
			font-size: 20px;
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/("""
		"""),format.raw/*114.3*/("""p """),format.raw/*114.5*/("""{"""),format.raw/*114.6*/("""
			"""),format.raw/*115.4*/("""color: white;
			font-family: 'Source Sans Pro', sans-serif;
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/("""
		"""),format.raw/*118.3*/(""".section-header """),format.raw/*118.19*/("""{"""),format.raw/*118.20*/("""
			"""),format.raw/*119.4*/("""font-size: 25px
		"""),format.raw/*120.3*/("""}"""),format.raw/*120.4*/("""
		"""),format.raw/*121.3*/("""a.btn.btn-success.btn-block """),format.raw/*121.31*/("""{"""),format.raw/*121.32*/("""
			"""),format.raw/*122.4*/("""color: white;
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""

"""),format.raw/*125.1*/("""</style>

	<body>

		<nav class="navbar fixed-top cnavbar-collapse collapse">
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
			<div class="holder">
				<h1>Welcome, """),_display_(/*161.19*/rider/*161.24*/.firstName),format.raw/*161.34*/("""</h1>
				<hr>
				<h2>From here, you can view your account information and delete your account.</h2>
				<hr>
				<h3>Rider Information</h3>
				<p>Rider Id: """),_display_(/*166.19*/rider/*166.24*/.riderId),format.raw/*166.32*/("""</p>
				<p>Rider First Name: """),_display_(/*167.27*/rider/*167.32*/.firstName),format.raw/*167.42*/("""</p>
				<p>Rider Last Name: """),_display_(/*168.26*/rider/*168.31*/.lastName),format.raw/*168.40*/("""</p>
				<hr>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*172.50*/routes/*172.56*/.RideController.search()),format.raw/*172.80*/("""">Search Ride</a>
				</div></br>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*176.50*/routes/*176.56*/.RiderController.showRides(rider.riderId)),format.raw/*176.97*/("""">Show Rides</a>
				</div></br>

				<div class="container">
					<a class="btn btn-success btn-block" href=""""),_display_(/*180.50*/routes/*180.56*/.RiderController.destroy(rider.riderId)),format.raw/*180.95*/("""">Delete Account</a>
				</div></br>
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

  def render(rider:Rider): play.twirl.api.HtmlFormat.Appendable = apply(rider)

  def f:((Rider) => play.twirl.api.HtmlFormat.Appendable) = (rider) => apply(rider)

  def ref: this.type = this

}


}

/**/
object ridershow extends ridershow_Scope0.ridershow
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridershow.scala.html
                  HASH: 5a6628210d96b59f3501045b7a8c8f1b1280e117
                  MATRIX: 752->3|861->17|891->21|2081->1184|2096->1190|2162->1234|2525->1569|2554->1570|2586->1575|2630->1592|2658->1593|2689->1597|2731->1611|2760->1612|2792->1617|2855->1653|2883->1654|2914->1658|2956->1672|2985->1673|3017->1678|3087->1721|3115->1722|3148->1728|3180->1733|3208->1734|3240->1739|3284->1756|3312->1757|3343->1761|3394->1784|3423->1785|3455->1790|3581->1889|3609->1890|3640->1894|3676->1902|3705->1903|3737->1908|3807->1951|3835->1952|3866->1956|3908->1970|3937->1971|3969->1976|4068->2048|4096->2049|4127->2053|4165->2063|4194->2064|4226->2069|4325->2141|4353->2142|4384->2146|4433->2167|4462->2168|4494->2173|4586->2238|4614->2239|4647->2245|4690->2260|4719->2261|4751->2266|4808->2296|4836->2297|4867->2301|4907->2313|4936->2314|4968->2319|5067->2391|5095->2392|5126->2396|5168->2410|5197->2411|5229->2416|5273->2433|5301->2434|5336->2442|5373->2451|5402->2452|5434->2457|5556->2552|5584->2553|5615->2557|5651->2565|5680->2566|5712->2571|6053->2885|6081->2886|6112->2890|6142->2893|6170->2894|6203->2899|6282->2950|6311->2951|6343->2955|6374->2958|6403->2959|6436->2964|6552->3052|6581->3053|6613->3057|6644->3060|6673->3061|6706->3066|6806->3138|6835->3139|6867->3143|6897->3145|6926->3146|6959->3151|7052->3216|7081->3217|7113->3221|7158->3237|7188->3238|7221->3243|7268->3262|7297->3263|7329->3267|7386->3295|7416->3296|7449->3301|7494->3318|7523->3319|7555->3323|8837->4577|8852->4582|8884->4592|9077->4757|9092->4762|9122->4770|9182->4802|9197->4807|9229->4817|9288->4848|9303->4853|9334->4862|9458->4958|9474->4964|9520->4988|9664->5104|9680->5110|9743->5151|9886->5266|9902->5272|9963->5311
                  LINES: 27->2|32->2|34->4|49->19|49->19|49->19|57->27|57->27|58->28|59->29|59->29|60->30|60->30|60->30|61->31|63->33|63->33|64->34|64->34|64->34|65->35|67->37|67->37|69->39|69->39|69->39|70->40|71->41|71->41|72->42|72->42|72->42|73->43|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|86->56|86->56|87->57|87->57|87->57|88->58|91->61|91->61|92->62|92->62|92->62|93->63|95->65|95->65|97->67|97->67|97->67|98->68|100->70|100->70|101->71|101->71|101->71|102->72|105->75|105->75|106->76|106->76|106->76|107->77|108->78|108->78|111->81|111->81|111->81|112->82|116->86|116->86|117->87|117->87|117->87|118->88|128->98|128->98|129->99|129->99|129->99|130->100|132->102|132->102|133->103|133->103|133->103|134->104|138->108|138->108|139->109|139->109|139->109|140->110|143->113|143->113|144->114|144->114|144->114|145->115|147->117|147->117|148->118|148->118|148->118|149->119|150->120|150->120|151->121|151->121|151->121|152->122|153->123|153->123|155->125|191->161|191->161|191->161|196->166|196->166|196->166|197->167|197->167|197->167|198->168|198->168|198->168|202->172|202->172|202->172|206->176|206->176|206->176|210->180|210->180|210->180
                  -- GENERATED --
              */
          