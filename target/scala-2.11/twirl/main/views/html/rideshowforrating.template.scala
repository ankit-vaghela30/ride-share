
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rideshowforrating_Scope0 {
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

     object rideshowforrating_Scope1 {
import helper._

class rideshowforrating extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Ride,Form[Ride],Form[Rating],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(ride: Ride, rideform: Form[Ride], ratingform: Form[Rating]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.62*/("""

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
	"""),_display_(/*114.3*/helper/*114.9*/.form(action= routes.RideController.saveRide())/*114.56*/ {_display_(Seq[Any](format.raw/*114.58*/("""

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
				<form>
					<div class="form-group">
						<p>Ride Source: """),_display_(/*148.24*/ride/*148.28*/.source),format.raw/*148.35*/("""</p>
						<p>Ride Destination: """),_display_(/*149.29*/ride/*149.33*/.destination),format.raw/*149.45*/("""</p>
						<p>Ride Time: """),_display_(/*150.22*/ride/*150.26*/.startTime),format.raw/*150.36*/("""</p>
					</div>


					"""),_display_(/*154.7*/inputText(
						ratingform("rating"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "Rating",
						'placeholder -> "Rating"
					)),format.raw/*161.7*/("""
					"""),format.raw/*162.6*/("""<div class="invalid-feedback">
						Please fill this field.
					</div>

					"""),_display_(/*166.7*/inputText(
						ratingform("feedback"),
						'_showConstraints -> true,
						'type -> "text",
						'class -> "form-control",
						'id -> "Feedback",
						'placeholder -> "Feedback"
					)),format.raw/*173.7*/("""
					"""),format.raw/*174.6*/("""<div class="invalid-feedback">
						Please fill this field.
					</div>

					<input type="submit" value="Rate Ride">
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
	""")))}),format.raw/*209.3*/("""
	"""),format.raw/*210.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(ride:Ride,rideform:Form[Ride],ratingform:Form[Rating]): play.twirl.api.HtmlFormat.Appendable = apply(ride,rideform,ratingform)

  def f:((Ride,Form[Ride],Form[Rating]) => play.twirl.api.HtmlFormat.Appendable) = (ride,rideform,ratingform) => apply(ride,rideform,ratingform)

  def ref: this.type = this

}


}
}

/**/
object rideshowforrating extends rideshowforrating_Scope0.rideshowforrating_Scope1.rideshowforrating
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/rideshowforrating.scala.html
                  HASH: c0d194a99fd8ef8a6d1beb6d899296b7ff45a112
                  MATRIX: 847->29|1002->89|1032->93|2219->1253|2234->1259|2298->1301|2662->1637|2691->1638|2724->1644|2769->1662|2797->1663|2829->1668|2871->1682|2900->1683|2933->1689|2998->1727|3026->1728|3058->1733|3100->1747|3129->1748|3162->1754|3234->1799|3262->1800|3296->1807|3328->1812|3357->1813|3390->1819|3435->1837|3463->1838|3495->1843|3546->1866|3575->1867|3608->1873|3738->1976|3766->1977|3798->1982|3834->1990|3863->1991|3896->1997|3968->2042|3996->2043|4028->2048|4070->2062|4099->2063|4132->2069|4234->2144|4262->2145|4294->2150|4332->2160|4361->2161|4394->2167|4496->2242|4524->2243|4556->2248|4605->2269|4634->2270|4667->2276|4761->2343|4789->2344|4823->2351|4866->2366|4895->2367|4928->2373|4986->2404|5014->2405|5046->2410|5086->2422|5115->2423|5148->2429|5250->2504|5278->2505|5310->2510|5352->2524|5381->2525|5414->2531|5459->2549|5487->2550|5521->2557|5558->2566|5587->2567|5620->2573|5747->2673|5775->2674|5807->2679|5843->2687|5872->2688|5905->2694|6257->3018|6286->3019|6319->3024|6358->3034|6388->3035|6422->3041|6519->3110|6548->3111|6581->3116|6612->3119|6641->3120|6675->3126|6756->3179|6785->3180|6816->3183|6866->3206|6881->3212|6938->3259|6979->3261|7013->3267|8326->4552|8340->4556|8369->4563|8431->4597|8445->4601|8479->4613|8534->4640|8548->4644|8580->4654|8636->4683|8851->4877|8886->4884|8997->4968|9218->5168|9253->5175|10263->6154|10294->6157
                  LINES: 30->7|35->7|37->9|51->23|51->23|51->23|59->31|59->31|60->32|61->33|61->33|62->34|62->34|62->34|63->35|65->37|65->37|66->38|66->38|66->38|67->39|69->41|69->41|71->43|71->43|71->43|72->44|73->45|73->45|74->46|74->46|74->46|75->47|79->51|79->51|80->52|80->52|80->52|81->53|83->55|83->55|84->56|84->56|84->56|85->57|88->60|88->60|89->61|89->61|89->61|90->62|93->65|93->65|94->66|94->66|94->66|95->67|97->69|97->69|99->71|99->71|99->71|100->72|102->74|102->74|103->75|103->75|103->75|104->76|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|112->84|112->84|112->84|113->85|117->89|117->89|118->90|118->90|118->90|119->91|129->101|129->101|130->102|130->102|130->102|131->103|134->106|134->106|135->107|135->107|135->107|136->108|138->110|138->110|139->111|142->114|142->114|142->114|142->114|144->116|176->148|176->148|176->148|177->149|177->149|177->149|178->150|178->150|178->150|182->154|189->161|190->162|194->166|201->173|202->174|237->209|238->210
                  -- GENERATED --
              */
          