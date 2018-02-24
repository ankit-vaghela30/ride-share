
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridesearch_Scope0 {
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

     object ridesearch_Scope1 {
import helper._

class ridesearch extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Ride],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(searchrideform: Form[Ride]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.30*/("""

"""),format.raw/*9.1*/("""<html>
	<head>
		<title>Driver Login</title>

			<!-- BOOTSTRAP CSS/JSS CDN -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

			<!-- JQUERY AND POPPER CDN -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

			<!-- Stylesheets and javascript -->
		<link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*23.64*/routes/*23.70*/.Assets.versioned("stylesheets/login.css")),format.raw/*23.112*/("""'>
		<link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
		<link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>


	</head>
	<style>
			.nav_text """),format.raw/*31.14*/("""{"""),format.raw/*31.15*/("""
				"""),format.raw/*32.5*/("""color: white;
			"""),format.raw/*33.4*/("""}"""),format.raw/*33.5*/("""
			"""),format.raw/*34.4*/(""".navbar-header"""),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
				"""),format.raw/*35.5*/("""margin-left:5px;
				width:100%;
			"""),format.raw/*37.4*/("""}"""),format.raw/*37.5*/("""
			"""),format.raw/*38.4*/(""".navcontainer """),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
				"""),format.raw/*39.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""

			"""),format.raw/*43.4*/("""body """),format.raw/*43.9*/("""{"""),format.raw/*43.10*/("""
				"""),format.raw/*44.5*/("""margin: auto;
			"""),format.raw/*45.4*/("""}"""),format.raw/*45.5*/("""
			"""),format.raw/*46.4*/(""".navbar, .navbar-fixed """),format.raw/*46.27*/("""{"""),format.raw/*46.28*/("""
				"""),format.raw/*47.5*/("""background-color: gray;
				opacity: .90;
				z-index: 99;
				box-shadow: 0 4px 2px -2px gray;
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/("""#navbar """),format.raw/*52.12*/("""{"""),format.raw/*52.13*/("""
				"""),format.raw/*53.5*/("""margin-left: 10%;
				margin-right: 5%;
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/("""
			"""),format.raw/*56.4*/(""".navbar-brand """),format.raw/*56.18*/("""{"""),format.raw/*56.19*/("""
				"""),format.raw/*57.5*/("""font-family: 'Bitter', serif;
				font-size: 22px;
				color: white;
			"""),format.raw/*60.4*/("""}"""),format.raw/*60.5*/("""
			"""),format.raw/*61.4*/(""".nav-link """),format.raw/*61.14*/("""{"""),format.raw/*61.15*/("""
				"""),format.raw/*62.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: white;
			"""),format.raw/*65.4*/("""}"""),format.raw/*65.5*/("""
			"""),format.raw/*66.4*/("""nav.navbar.fixed-top """),format.raw/*66.25*/("""{"""),format.raw/*66.26*/("""
				"""),format.raw/*67.5*/("""padding: 0em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/("""

			"""),format.raw/*71.4*/(""".navbar-footer """),format.raw/*71.19*/("""{"""),format.raw/*71.20*/("""
				"""),format.raw/*72.5*/("""background-color: white;

			"""),format.raw/*74.4*/("""}"""),format.raw/*74.5*/("""
			"""),format.raw/*75.4*/("""#footerlink """),format.raw/*75.16*/("""{"""),format.raw/*75.17*/("""
				"""),format.raw/*76.5*/("""font-size: 16px;
				font-family: 'Bitter', serif;
				color: black;
			"""),format.raw/*79.4*/("""}"""),format.raw/*79.5*/("""
			"""),format.raw/*80.4*/("""#bottom-brand """),format.raw/*80.18*/("""{"""),format.raw/*80.19*/("""
				"""),format.raw/*81.5*/("""color: black;
			"""),format.raw/*82.4*/("""}"""),format.raw/*82.5*/("""

			"""),format.raw/*84.4*/(""".wrapper """),format.raw/*84.13*/("""{"""),format.raw/*84.14*/("""
				"""),format.raw/*85.5*/("""padding-top: 10em;
				padding-left: 16em;
				padding-right: 16em;
				padding-bottom: 5em;
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/("""
			"""),format.raw/*90.4*/(""".holder """),format.raw/*90.12*/("""{"""),format.raw/*90.13*/("""
				"""),format.raw/*91.5*/("""background-color: indianred;
				padding-top: 3em;
				padding-left: 9em;
				padding-right: 9em;
				padding-bottom: 2em;
				border-bottom-left-radius: 3em;
				border-bottom-right-radius: 1em;
				border-top-right-radius: 3em;
				border-top-left-radius: 1em;
				box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""h2, label """),format.raw/*102.14*/("""{"""),format.raw/*102.15*/("""
				"""),format.raw/*103.5*/("""color: white;
				font-family: 'Source Sans Pro', sans-serif;

			"""),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""
			"""),format.raw/*107.4*/("""h1 """),format.raw/*107.7*/("""{"""),format.raw/*107.8*/("""
				"""),format.raw/*108.5*/("""color: white;
				font-family: 'Bitter', serif;
			"""),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
	"""),format.raw/*111.2*/("""</style>

	<body>
	"""),_display_(/*114.3*/helper/*114.9*/.form(action= routes.RideController.searchRides())/*114.59*/{_display_(Seq[Any](format.raw/*114.60*/("""

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

		<div class="wrapper">
			<div class="container holder">
				<h1>Search Ride</h1>
				<hr>
				<h2>Enter start and end location to look up for rides!<br></h2>
				<hr>
				<form>
					<div class="form-group">
					"""),_display_(/*152.7*/inputText(
						searchrideform("source"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter Source or Starting Location"
					)),format.raw/*159.7*/("""
					"""),format.raw/*160.6*/("""</div>
					<div class="form-group">
					"""),_display_(/*162.7*/inputText(
						searchrideform("destination"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "exampleFormControlInput1",
						'placeholder -> "Enter Destination or Stop Location"
					)),format.raw/*169.7*/("""
					"""),format.raw/*170.6*/("""</div>
					<button type="submit" class="btn btn-primary btn-block btn-success">Search Ride</button>
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
	""")))}),format.raw/*202.3*/("""
	"""),format.raw/*203.2*/("""</body>
</html>

"""))
      }
    }
  }

  def render(searchrideform:Form[Ride]): play.twirl.api.HtmlFormat.Appendable = apply(searchrideform)

  def f:((Form[Ride]) => play.twirl.api.HtmlFormat.Appendable) = (searchrideform) => apply(searchrideform)

  def ref: this.type = this

}


}
}

/**/
object ridesearch extends ridesearch_Scope0.ridesearch_Scope1.ridesearch
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridesearch.scala.html
                  HASH: 7bbee7d7d66b0a2c9eeedb26e82a38775f5d91f0
                  MATRIX: 808->23|931->51|959->53|2132->1199|2147->1205|2211->1247|2567->1575|2596->1576|2628->1581|2672->1598|2700->1599|2731->1603|2773->1617|2802->1618|2834->1623|2897->1659|2925->1660|2956->1664|2998->1678|3027->1679|3059->1684|3129->1727|3157->1728|3189->1733|3221->1738|3250->1739|3282->1744|3326->1761|3354->1762|3385->1766|3436->1789|3465->1790|3497->1795|3623->1894|3651->1895|3682->1899|3718->1907|3747->1908|3779->1913|3849->1956|3877->1957|3908->1961|3950->1975|3979->1976|4011->1981|4110->2053|4138->2054|4169->2058|4207->2068|4236->2069|4268->2074|4367->2146|4395->2147|4426->2151|4475->2172|4504->2173|4536->2178|4628->2243|4656->2244|4688->2249|4731->2264|4760->2265|4792->2270|4848->2299|4876->2300|4907->2304|4947->2316|4976->2317|5008->2322|5107->2394|5135->2395|5166->2399|5208->2413|5237->2414|5269->2419|5313->2436|5341->2437|5373->2442|5410->2451|5439->2452|5471->2457|5594->2553|5622->2554|5653->2558|5689->2566|5718->2567|5750->2572|6092->2886|6121->2887|6153->2891|6192->2901|6222->2902|6255->2907|6349->2973|6378->2974|6410->2978|6441->2981|6470->2982|6503->2987|6582->3038|6611->3039|6641->3041|6688->3061|6703->3067|6763->3117|6803->3118|6835->3122|8209->4469|8466->4705|8500->4711|8570->4754|8833->4996|8867->5002|9824->5928|9854->5930
                  LINES: 30->7|35->7|37->9|51->23|51->23|51->23|59->31|59->31|60->32|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|74->46|74->46|74->46|75->47|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|89->61|89->61|89->61|90->62|93->65|93->65|94->66|94->66|94->66|95->67|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|103->75|103->75|103->75|104->76|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|112->84|112->84|112->84|113->85|117->89|117->89|118->90|118->90|118->90|119->91|129->101|129->101|130->102|130->102|130->102|131->103|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|142->114|142->114|142->114|142->114|144->116|180->152|187->159|188->160|190->162|197->169|198->170|230->202|231->203
                  -- GENERATED --
              */
          