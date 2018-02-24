
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object vehiclecreate_Scope0 {
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

     object vehiclecreate_Scope1 {
import helper._

class vehiclecreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Vehicle],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(vehicleform: Form[Vehicle]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.30*/("""

"""),format.raw/*7.1*/("""<html>
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
        <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*21.70*/routes/*21.76*/.Assets.versioned("stylesheets/registration.css")),format.raw/*21.125*/("""'>
        <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
        <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>

    <style>
            .nav_text """),format.raw/*29.23*/("""{"""),format.raw/*29.24*/("""
                """),format.raw/*30.17*/("""color: white;
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
            """),format.raw/*32.13*/(""".navbar-header"""),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
                """),format.raw/*33.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""
            """),format.raw/*36.13*/(""".navcontainer """),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
                """),format.raw/*37.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""body """),format.raw/*41.18*/("""{"""),format.raw/*41.19*/("""
                """),format.raw/*42.17*/("""margin: auto;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
            """),format.raw/*44.13*/(""".navbar, .navbar-fixed """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
                """),format.raw/*45.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
                box-shadow: 0 4px 2px -2px gray;
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""#navbar """),format.raw/*50.21*/("""{"""),format.raw/*50.22*/("""
                """),format.raw/*51.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
            """),format.raw/*54.13*/(""".navbar-brand """),format.raw/*54.27*/("""{"""),format.raw/*54.28*/("""
                """),format.raw/*55.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""
            """),format.raw/*59.13*/(""".nav-link """),format.raw/*59.23*/("""{"""),format.raw/*59.24*/("""
                """),format.raw/*60.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/("""nav.navbar.fixed-top """),format.raw/*64.34*/("""{"""),format.raw/*64.35*/("""
                """),format.raw/*65.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""

            """),format.raw/*69.13*/(""".navbar-footer """),format.raw/*69.28*/("""{"""),format.raw/*69.29*/("""
                """),format.raw/*70.17*/("""background-color: white;

            """),format.raw/*72.13*/("""}"""),format.raw/*72.14*/("""
            """),format.raw/*73.13*/("""#footerlink """),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
                """),format.raw/*74.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""
            """),format.raw/*78.13*/("""#bottom-brand """),format.raw/*78.27*/("""{"""),format.raw/*78.28*/("""
                """),format.raw/*79.17*/("""color: black;
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""

            """),format.raw/*82.13*/(""".formdiv """),format.raw/*82.22*/("""{"""),format.raw/*82.23*/("""
                """),format.raw/*83.17*/("""padding-top: 5em;
                padding-left: 10em;
                padding-right: 10em;
                padding-bottom: 5em;
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""

            """),format.raw/*89.13*/(""".holder """),format.raw/*89.21*/("""{"""),format.raw/*89.22*/("""
                """),format.raw/*90.17*/("""background-color: indianred;
                padding-top: 3em;
                padding-left: 7em;
                padding-right: 7em;
                padding-bottom: 2em;
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
            """),format.raw/*101.13*/("""label """),format.raw/*101.19*/("""{"""),format.raw/*101.20*/("""
                """),format.raw/*102.17*/("""color: white;
                font-family: 'Bitter', serif;
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""

            """),format.raw/*106.13*/(""".fg2 """),format.raw/*106.18*/("""{"""),format.raw/*106.19*/("""
                """),format.raw/*107.17*/("""padding-top: 1em;
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/("""
            """),format.raw/*109.13*/(""".invalid-feedback """),format.raw/*109.31*/("""{"""),format.raw/*109.32*/("""
                """),format.raw/*110.17*/("""color: orange;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
    """),format.raw/*113.5*/("""</style>

    <body>
    """),_display_(/*116.6*/helper/*116.12*/.form(action= routes.VehicleController.save())/*116.58*/ {_display_(Seq[Any](format.raw/*116.60*/("""

        """),format.raw/*118.9*/("""<nav class="navbar fixed-top cnavbar-collapse collapse">
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
                            """),_display_(/*150.30*/inputText(
                                vehicleform("vehicleName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "vehicleName",
                                'placeholder -> "Vehicle Name"
                            )),format.raw/*157.30*/("""
                            """),format.raw/*158.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col fg2">
                            """),_display_(/*165.30*/inputText(
                                vehicleform("vehicleType"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "vehicleType",
                                'placeholder -> "Vehicle Type"
                            )),format.raw/*172.30*/("""
                            """),format.raw/*173.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col fg2">
                            """),_display_(/*180.30*/inputText(
                                vehicleform("capacity"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "capacity",
                                'placeholder -> "Capacity"
                            )),format.raw/*187.30*/("""
                            """),format.raw/*188.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Create Vehicle!</button>
                </form>
            </div>
        </div>
        <script>
				(function() """),format.raw/*198.17*/("""{"""),format.raw/*198.18*/("""
                    """),format.raw/*199.21*/("""'use strict';
                    window.addEventListener('load', function() """),format.raw/*200.64*/("""{"""),format.raw/*200.65*/("""
                        """),format.raw/*201.25*/("""var form = document.getElementById('needs-validation');
                        form.addEventListener('submit', function(event) """),format.raw/*202.73*/("""{"""),format.raw/*202.74*/("""
                            """),format.raw/*203.29*/("""if (form.checkValidity() === false) """),format.raw/*203.65*/("""{"""),format.raw/*203.66*/("""
                                """),format.raw/*204.33*/("""event.preventDefault();
                                event.stopPropagation();
                            """),format.raw/*206.29*/("""}"""),format.raw/*206.30*/("""
                            """),format.raw/*207.29*/("""form.classList.add('was-validated');
                        """),format.raw/*208.25*/("""}"""),format.raw/*208.26*/(""", false);
                    """),format.raw/*209.21*/("""}"""),format.raw/*209.22*/(""", false);
                """),format.raw/*210.17*/("""}"""),format.raw/*210.18*/(""")();
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
    """)))}),format.raw/*235.6*/("""
    """),format.raw/*236.5*/("""</body>
</html>


"""))
      }
    }
  }

  def render(vehicleform:Form[Vehicle]): play.twirl.api.HtmlFormat.Appendable = apply(vehicleform)

  def f:((Form[Vehicle]) => play.twirl.api.HtmlFormat.Appendable) = (vehicleform) => apply(vehicleform)

  def ref: this.type = this

}


}
}

/**/
object vehiclecreate extends vehiclecreate_Scope0.vehiclecreate_Scope1.vehiclecreate
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:21 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/vehiclecreate.scala.html
                  HASH: 14435d2cbf023904fdeb314d3fdfebbc4262ab3d
                  MATRIX: 820->25|943->53|973->57|2239->1296|2254->1302|2325->1351|2722->1720|2751->1721|2797->1739|2852->1766|2881->1767|2923->1781|2965->1795|2994->1796|3040->1814|3127->1873|3156->1874|3198->1888|3240->1902|3269->1903|3315->1921|3409->1987|3438->1988|3482->2004|3515->2009|3544->2010|3590->2028|3645->2055|3674->2056|3716->2070|3767->2093|3796->2094|3842->2112|4018->2260|4047->2261|4089->2275|4125->2283|4154->2284|4200->2302|4294->2368|4323->2369|4365->2383|4407->2397|4436->2398|4482->2416|4618->2524|4647->2525|4689->2539|4727->2549|4756->2550|4802->2568|4938->2676|4967->2677|5009->2691|5058->2712|5087->2713|5133->2731|5249->2819|5278->2820|5322->2836|5365->2851|5394->2852|5440->2870|5508->2910|5537->2911|5579->2925|5619->2937|5648->2938|5694->2956|5830->3064|5859->3065|5901->3079|5943->3093|5972->3094|6018->3112|6073->3139|6102->3140|6146->3156|6183->3165|6212->3166|6258->3184|6430->3328|6459->3329|6503->3345|6539->3353|6568->3354|6614->3372|7084->3813|7114->3814|7157->3828|7192->3834|7222->3835|7269->3853|7372->3927|7402->3928|7447->3944|7481->3949|7511->3950|7558->3968|7618->3999|7648->4000|7691->4014|7738->4032|7768->4033|7815->4051|7933->4140|7963->4141|7997->4147|8053->4176|8069->4182|8125->4228|8166->4230|8206->4242|10021->6029|10433->6419|10492->6449|10825->6754|11237->7144|11296->7174|11629->7479|12031->7859|12090->7889|12501->8271|12531->8272|12582->8294|12689->8372|12719->8373|12774->8399|12932->8528|12962->8529|13021->8559|13086->8595|13116->8596|13179->8630|13319->8741|13349->8742|13408->8772|13499->8834|13529->8835|13589->8866|13619->8867|13675->8894|13705->8895|14877->10036|14911->10042
                  LINES: 30->5|35->5|37->7|51->21|51->21|51->21|59->29|59->29|60->30|61->31|61->31|62->32|62->32|62->32|63->33|65->35|65->35|66->36|66->36|66->36|67->37|69->39|69->39|71->41|71->41|71->41|72->42|73->43|73->43|74->44|74->44|74->44|75->45|79->49|79->49|80->50|80->50|80->50|81->51|83->53|83->53|84->54|84->54|84->54|85->55|88->58|88->58|89->59|89->59|89->59|90->60|93->63|93->63|94->64|94->64|94->64|95->65|97->67|97->67|99->69|99->69|99->69|100->70|102->72|102->72|103->73|103->73|103->73|104->74|107->77|107->77|108->78|108->78|108->78|109->79|110->80|110->80|112->82|112->82|112->82|113->83|117->87|117->87|119->89|119->89|119->89|120->90|130->100|130->100|131->101|131->101|131->101|132->102|134->104|134->104|136->106|136->106|136->106|137->107|138->108|138->108|139->109|139->109|139->109|140->110|142->112|142->112|143->113|146->116|146->116|146->116|146->116|148->118|180->150|187->157|188->158|195->165|202->172|203->173|210->180|217->187|218->188|228->198|228->198|229->199|230->200|230->200|231->201|232->202|232->202|233->203|233->203|233->203|234->204|236->206|236->206|237->207|238->208|238->208|239->209|239->209|240->210|240->210|265->235|266->236
                  -- GENERATED --
              */
          