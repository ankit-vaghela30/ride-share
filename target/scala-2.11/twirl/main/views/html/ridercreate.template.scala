
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ridercreate_Scope0 {
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

     object ridercreate_Scope1 {
import helper._

class ridercreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Rider],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(riderform: Form[Rider]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""

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
            .nav_text """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
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
    """),format.raw/*111.5*/("""</style>

	<body>

	"""),_display_(/*115.3*/helper/*115.9*/.form(action= routes.RiderController.save())/*115.53*/ {_display_(Seq[Any](format.raw/*115.55*/("""



		"""),format.raw/*119.3*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
						<a class="nav-link dropdown-toggle" data-toggle="dropdown"
						href=""""),_display_(/*137.14*/routes/*137.20*/.DriverController.login()),format.raw/*137.45*/("""" role="button" aria-haspopup="true" aria-expanded="false">
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
								<!--                        <label for="firstname">First Name</label>    -->
							"""),_display_(/*153.9*/inputText(
								riderform("firstName"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "firstName",
								'placeholder -> "First Name"
							)),format.raw/*160.9*/("""
							"""),format.raw/*161.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
						<div class="col fg2">
								<!--                        <label for="lastname">Last Name</label>     -->
							"""),_display_(/*167.9*/inputText(
								riderform("lastName"),
								'_showConstraints -> true,
								'type -> "text",
								'class -> "form-control",
								'id -> "lastName",
								'placeholder -> "Last Name"
							)),format.raw/*174.9*/("""
							"""),format.raw/*175.8*/("""<div class="invalid-feedback">
								Please fill this field.
							</div>
						</div>
					</div>
					<div class="form-check form-check-inline">
						<label class="form-check-label">
						"""),_display_(/*182.8*/inputRadioGroup(
							riderform("gender"),
							options = Seq("M"->"Male","F"->"Female"),
							'_label -> "Gender",
							'_error -> riderform("gender").error.map(_.withMessage("select gender"))
						)),format.raw/*187.8*/("""
						"""),format.raw/*188.7*/("""</label>
					</div>
					<div class="form-group">
							<!--                        <label for="exampleFormControlInput1">Email address</label> -->
						"""),_display_(/*192.8*/inputText(
							riderform("email"),
							'_showConstraints -> true,
							'type -> "email",
							'class -> "form-control",
							'id -> "exampleFormControlInput1",
							'placeholder -> "name [at] example.com"
						)),format.raw/*199.8*/("""
						"""),format.raw/*200.7*/("""<div class="invalid-feedback">
							Please provide a valid email.
						</div>
					</div>
					<div class="form-group">
							<!--                    <label for="password">Password</label>      -->
						"""),_display_(/*206.8*/inputText(
							riderform("password"),
							'_showConstraints -> false,
							'label -> "",
							'type -> "password",
							'class -> "form-control",
							'id -> "password",
							'placeholder -> "abc123"
						)),format.raw/*214.8*/("""

						"""),format.raw/*216.7*/("""<div class="invalid-feedback">
							Please fill this field.
						</div>
					</div>
					<div class="form-group">
							<!--                   <label for="phonenumber">Phone Number</label>    -->
						"""),_display_(/*222.8*/inputText(
							riderform("phoneNumber"),
							'_showConstraints -> false,
							'type -> "phonenumber",
							'class -> "form-control",
							'id -> "phonenumber",
							'placeholder -> "(123)-456-7890"
						)),format.raw/*229.8*/("""

						"""),format.raw/*231.7*/("""<div class="invalid-feedback">
							Please provide a valid phone number.
						</div>
					</div>

					<button type="submit" class="btn btn-success btn-block">Insert Rider!</button>
				</form>
			</div>
		</div>
		<script>
				(function() """),format.raw/*241.17*/("""{"""),format.raw/*241.18*/("""
					"""),format.raw/*242.6*/("""'use strict';
					window.addEventListener('load', function() """),format.raw/*243.49*/("""{"""),format.raw/*243.50*/("""
						"""),format.raw/*244.7*/("""var form = document.getElementById('needs-validation');
						form.addEventListener('submit', function(event) """),format.raw/*245.55*/("""{"""),format.raw/*245.56*/("""
							"""),format.raw/*246.8*/("""if (form.checkValidity() === false) """),format.raw/*246.44*/("""{"""),format.raw/*246.45*/("""
								"""),format.raw/*247.9*/("""event.preventDefault();
								event.stopPropagation();
							"""),format.raw/*249.8*/("""}"""),format.raw/*249.9*/("""
							"""),format.raw/*250.8*/("""form.classList.add('was-validated');
						"""),format.raw/*251.7*/("""}"""),format.raw/*251.8*/(""", false);
					"""),format.raw/*252.6*/("""}"""),format.raw/*252.7*/(""", false);
				"""),format.raw/*253.5*/("""}"""),format.raw/*253.6*/(""")();
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
	""")))}),format.raw/*278.3*/("""
	"""),format.raw/*279.2*/("""</body>
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
object ridercreate extends ridercreate_Scope0.ridercreate_Scope1.ridercreate
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/ridercreate.scala.html
                  HASH: 0d8c2a10d8b96491e907663bd9df20484f1058e8
                  MATRIX: 812->21|931->45|961->49|2155->1216|2170->1222|2241->1271|2614->1616|2643->1617|2676->1623|2721->1641|2749->1642|2781->1647|2823->1661|2852->1662|2885->1668|2950->1706|2978->1707|3010->1712|3052->1726|3081->1727|3114->1733|3186->1778|3214->1779|3248->1786|3280->1791|3309->1792|3342->1798|3387->1816|3415->1817|3447->1822|3498->1845|3527->1846|3560->1852|3690->1955|3718->1956|3750->1961|3786->1969|3815->1970|3848->1976|3920->2021|3948->2022|3980->2027|4022->2041|4051->2042|4084->2048|4186->2123|4214->2124|4246->2129|4284->2139|4313->2140|4346->2146|4448->2221|4476->2222|4508->2227|4557->2248|4586->2249|4619->2255|4713->2322|4741->2323|4775->2330|4818->2345|4847->2346|4880->2352|4938->2383|4966->2384|4998->2389|5038->2401|5067->2402|5100->2408|5202->2483|5230->2484|5262->2489|5304->2503|5333->2504|5366->2510|5411->2528|5439->2529|5473->2536|5510->2545|5539->2546|5572->2552|5698->2651|5726->2652|5760->2659|5796->2667|5825->2668|5858->2674|6209->2998|6237->2999|6269->3004|6303->3010|6332->3011|6366->3017|6447->3070|6476->3071|6511->3078|6544->3083|6574->3084|6608->3090|6658->3112|6687->3113|6720->3118|6767->3136|6797->3137|6831->3143|6927->3211|6956->3212|6990->3218|7042->3243|7057->3249|7111->3293|7152->3295|7190->3305|8161->4248|8177->4254|8224->4279|8787->4815|9025->5032|9062->5041|9305->5257|9540->5471|9577->5480|9807->5683|10042->5897|10078->5905|10266->6066|10520->6299|10556->6307|10798->6522|11050->6753|11088->6763|11328->6976|11575->7202|11613->7212|11895->7465|11925->7466|11960->7473|12052->7536|12082->7537|12118->7545|12258->7656|12288->7657|12325->7666|12390->7702|12420->7703|12458->7713|12552->7779|12581->7780|12618->7789|12690->7833|12719->7834|12763->7850|12792->7851|12835->7866|12864->7867|13727->8699|13758->8702
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|119->87|119->87|119->87|120->88|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|136->104|136->104|136->104|137->105|138->106|138->106|139->107|139->107|139->107|140->108|142->110|142->110|143->111|147->115|147->115|147->115|147->115|151->119|169->137|169->137|169->137|185->153|192->160|193->161|199->167|206->174|207->175|214->182|219->187|220->188|224->192|231->199|232->200|238->206|246->214|248->216|254->222|261->229|263->231|273->241|273->241|274->242|275->243|275->243|276->244|277->245|277->245|278->246|278->246|278->246|279->247|281->249|281->249|282->250|283->251|283->251|284->252|284->252|285->253|285->253|310->278|311->279
                  -- GENERATED --
              */
          