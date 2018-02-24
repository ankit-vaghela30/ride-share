
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object drivercreate_Scope0 {
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

     object drivercreate_Scope1 {
import helper._

class drivercreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Driver],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(driverform: Form[Driver]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.28*/("""

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
        <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*19.70*/routes/*19.76*/.Assets.versioned("stylesheets/registration.css")),format.raw/*19.125*/("""'>
        <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
        <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>

    <style>
            .nav_text """),format.raw/*27.23*/("""{"""),format.raw/*27.24*/("""
                """),format.raw/*28.17*/("""color: white;
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/("""
            """),format.raw/*30.13*/(""".navbar-header"""),format.raw/*30.27*/("""{"""),format.raw/*30.28*/("""
                """),format.raw/*31.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.13*/(""".navcontainer """),format.raw/*34.27*/("""{"""),format.raw/*34.28*/("""
                """),format.raw/*35.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""

            """),format.raw/*39.13*/("""body """),format.raw/*39.18*/("""{"""),format.raw/*39.19*/("""
                """),format.raw/*40.17*/("""margin: auto;
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/("""
            """),format.raw/*42.13*/(""".navbar, .navbar-fixed """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
                """),format.raw/*43.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
                box-shadow: 0 4px 2px -2px gray;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            """),format.raw/*48.13*/("""#navbar """),format.raw/*48.21*/("""{"""),format.raw/*48.22*/("""
                """),format.raw/*49.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/(""".navbar-brand """),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
                """),format.raw/*53.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""
            """),format.raw/*57.13*/(""".nav-link """),format.raw/*57.23*/("""{"""),format.raw/*57.24*/("""
                """),format.raw/*58.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""
            """),format.raw/*62.13*/("""nav.navbar.fixed-top """),format.raw/*62.34*/("""{"""),format.raw/*62.35*/("""
                """),format.raw/*63.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""

            """),format.raw/*67.13*/(""".navbar-footer """),format.raw/*67.28*/("""{"""),format.raw/*67.29*/("""
                """),format.raw/*68.17*/("""background-color: white;

            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/("""
            """),format.raw/*71.13*/("""#footerlink """),format.raw/*71.25*/("""{"""),format.raw/*71.26*/("""
                """),format.raw/*72.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
            """),format.raw/*76.13*/("""#bottom-brand """),format.raw/*76.27*/("""{"""),format.raw/*76.28*/("""
                """),format.raw/*77.17*/("""color: black;
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""

            """),format.raw/*80.13*/(""".formdiv """),format.raw/*80.22*/("""{"""),format.raw/*80.23*/("""
                """),format.raw/*81.17*/("""padding-top: 5em;
                padding-left: 10em;
                padding-right: 10em;
                padding-bottom: 5em;
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""

            """),format.raw/*87.13*/(""".holder """),format.raw/*87.21*/("""{"""),format.raw/*87.22*/("""
                """),format.raw/*88.17*/("""background-color: indianred;
                padding-top: 3em;
                padding-left: 7em;
                padding-right: 7em;
                padding-bottom: 2em;
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""
            """),format.raw/*99.13*/("""label """),format.raw/*99.19*/("""{"""),format.raw/*99.20*/("""
                """),format.raw/*100.17*/("""color: white;
                font-family: 'Bitter', serif;
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/("""

            """),format.raw/*104.13*/(""".fg2 """),format.raw/*104.18*/("""{"""),format.raw/*104.19*/("""
                """),format.raw/*105.17*/("""padding-top: 1em;
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
            """),format.raw/*107.13*/(""".invalid-feedback """),format.raw/*107.31*/("""{"""),format.raw/*107.32*/("""
                """),format.raw/*108.17*/("""color: orange;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
    """),format.raw/*111.5*/("""</style>

    <body>
        """),_display_(/*114.10*/helper/*114.16*/.form(action= routes.DriverController.save())/*114.61*/ {_display_(Seq[Any](format.raw/*114.63*/("""



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
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown"
                        href=""""),_display_(/*136.32*/routes/*136.38*/.DriverController.login()),format.raw/*136.63*/("""" role="button" aria-haspopup="true" aria-expanded="false">
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
                            """),_display_(/*152.30*/inputText(
                                driverform("firstName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "firstName",
                                'placeholder -> "First Name"
                            )),format.raw/*159.30*/("""
                            """),format.raw/*160.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                        <div class="col fg2">
<!--                        <label for="lastname">Last Name</label>     -->
                            """),_display_(/*166.30*/inputText(
                                driverform("lastName"),
                                '_showConstraints -> true,
                                'type -> "text",
                                'class -> "form-control",
                                'id -> "lastName",
                                'placeholder -> "Last Name"
                            )),format.raw/*173.30*/("""
                            """),format.raw/*174.29*/("""<div class="invalid-feedback">
                                Please fill this field.
                            </div>
                        </div>
                    </div>
                    <div class="form-check form-check-inline">
                        <label class="form-check-label">
                            """),_display_(/*181.30*/inputRadioGroup(
                                driverform("gender"),
                                options = Seq("M"->"Male","F"->"Female"),
                                '_label -> "Gender",
                                '_error -> driverform("gender").error.map(_.withMessage("select gender"))
                            )),format.raw/*186.30*/("""
                        """),format.raw/*187.25*/("""</label>
                    </div>
                    <div class="form-group">
                            <!--                        <label for="exampleFormControlInput1">Email address</label> -->
                        """),_display_(/*191.26*/inputText(
                            driverform("email"),
                            '_showConstraints -> true,
                            'type -> "email",
                            'class -> "form-control",
                            'id -> "exampleFormControlInput1",
                            'placeholder -> "name [at] example.com"
                        )),format.raw/*198.26*/("""
                        """),format.raw/*199.25*/("""<div class="invalid-feedback">
                            Please provide a valid email.
                        </div>
                    </div>
                    <div class="form-group">
<!--                    <label for="password">Password</label>      -->
                        """),_display_(/*205.26*/inputText(
                            driverform("password"),
                            '_showConstraints -> false,
                            'label -> "",
                            'type -> "password",
                            'class -> "form-control",
                            'id -> "password",
                            'placeholder -> "abc123"
                        )),format.raw/*213.26*/("""

                        """),format.raw/*215.25*/("""<div class="invalid-feedback">
                            Please fill this field.
                        </div>
                    </div>
                    <div class="form-group">
<!--                   <label for="phonenumber">Phone Number</label>    -->
                        """),_display_(/*221.26*/inputText(
                            driverform("phoneNumber"),
                            '_showConstraints -> false,
                            'type -> "phonenumber",
                            'class -> "form-control",
                            'id -> "phonenumber",
                            'placeholder -> "(123)-456-7890"
                        )),format.raw/*228.26*/("""

                        """),format.raw/*230.25*/("""<div class="invalid-feedback">
                            Please provide a valid phone number.
                        </div>
                    </div>
                    <div class="form-group">
<!--                    <label for="dLnumber">Driver's License Number</label>   -->
                        """),_display_(/*236.26*/inputText(
                            driverform("driverLicense"),
                            '_showConstraints -> true,
                            'type -> "text",
                            'class -> "form-control",
                            'id -> "dLnumber",
                            'placeholder -> "abcdefg123456"
                        )),format.raw/*243.26*/("""
                        """),format.raw/*244.25*/("""<div class="invalid-feedback">
                            Please provide a valid number.
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Register</button>
                </form>
            </div>
        </div>
        <script>
                (function() """),format.raw/*253.29*/("""{"""),format.raw/*253.30*/("""
                    """),format.raw/*254.21*/("""'use strict';
                    window.addEventListener('load', function() """),format.raw/*255.64*/("""{"""),format.raw/*255.65*/("""
                        """),format.raw/*256.25*/("""var form = document.getElementById('needs-validation');
                        form.addEventListener('submit', function(event) """),format.raw/*257.73*/("""{"""),format.raw/*257.74*/("""
                            """),format.raw/*258.29*/("""if (form.checkValidity() === false) """),format.raw/*258.65*/("""{"""),format.raw/*258.66*/("""
                                """),format.raw/*259.33*/("""event.preventDefault();
                                event.stopPropagation();
                            """),format.raw/*261.29*/("""}"""),format.raw/*261.30*/("""
                            """),format.raw/*262.29*/("""form.classList.add('was-validated');
                        """),format.raw/*263.25*/("""}"""),format.raw/*263.26*/(""", false);
                    """),format.raw/*264.21*/("""}"""),format.raw/*264.22*/(""", false);
                """),format.raw/*265.17*/("""}"""),format.raw/*265.18*/(""")();
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
        """)))}),format.raw/*290.10*/("""
    """),format.raw/*291.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(driverform:Form[Driver]): play.twirl.api.HtmlFormat.Appendable = apply(driverform)

  def f:((Form[Driver]) => play.twirl.api.HtmlFormat.Appendable) = (driverform) => apply(driverform)

  def ref: this.type = this

}


}
}

/**/
object drivercreate extends drivercreate_Scope0.drivercreate_Scope1.drivercreate
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:19 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/drivercreate.scala.html
                  HASH: 7b065e5b3b217e00ec7febb6f612e1ee9e7fb2cf
                  MATRIX: 816->19|937->45|965->47|2217->1272|2232->1278|2303->1327|2692->1688|2721->1689|2766->1706|2820->1732|2849->1733|2890->1746|2932->1760|2961->1761|3006->1778|3091->1835|3120->1836|3161->1849|3203->1863|3232->1864|3277->1881|3369->1945|3398->1946|3440->1960|3473->1965|3502->1966|3547->1983|3601->2009|3630->2010|3671->2023|3722->2046|3751->2047|3796->2064|3968->2208|3997->2209|4038->2222|4074->2230|4103->2231|4148->2248|4240->2312|4269->2313|4310->2326|4352->2340|4381->2341|4426->2358|4559->2463|4588->2464|4629->2477|4667->2487|4696->2488|4741->2505|4874->2610|4903->2611|4944->2624|4993->2645|5022->2646|5067->2663|5181->2749|5210->2750|5252->2764|5295->2779|5324->2780|5369->2797|5435->2835|5464->2836|5505->2849|5545->2861|5574->2862|5619->2879|5752->2984|5781->2985|5822->2998|5864->3012|5893->3013|5938->3030|5992->3056|6021->3057|6063->3071|6100->3080|6129->3081|6174->3098|6342->3238|6371->3239|6413->3253|6449->3261|6478->3262|6523->3279|6982->3710|7011->3711|7052->3724|7086->3730|7115->3731|7161->3748|7262->3820|7292->3821|7335->3835|7369->3840|7399->3841|7445->3858|7504->3888|7534->3889|7576->3902|7623->3920|7653->3921|7699->3938|7815->4025|7845->4026|7878->4031|7936->4061|7952->4067|8007->4112|8048->4114|8088->4126|9338->5348|9354->5354|9401->5379|10163->6113|10561->6489|10619->6518|10951->6822|11346->7195|11404->7224|11761->7553|12116->7886|12170->7911|12424->8137|12817->8508|12871->8533|13188->8822|13599->9211|13654->9237|13969->9524|14355->9888|14410->9914|14746->10222|15122->10576|15176->10601|15550->10946|15580->10947|15630->10968|15736->11045|15766->11046|15820->11071|15977->11199|16007->11200|16065->11229|16130->11265|16160->11266|16222->11299|16360->11408|16390->11409|16448->11438|16538->11499|16568->11500|16627->11530|16657->11531|16712->11557|16742->11558|17915->12699|17948->12704
                  LINES: 30->3|35->3|37->5|51->19|51->19|51->19|59->27|59->27|60->28|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|74->42|75->43|79->47|79->47|80->48|80->48|80->48|81->49|83->51|83->51|84->52|84->52|84->52|85->53|88->56|88->56|89->57|89->57|89->57|90->58|93->61|93->61|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|102->70|102->70|103->71|103->71|103->71|104->72|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|117->85|117->85|119->87|119->87|119->87|120->88|130->98|130->98|131->99|131->99|131->99|132->100|134->102|134->102|136->104|136->104|136->104|137->105|138->106|138->106|139->107|139->107|139->107|140->108|142->110|142->110|143->111|146->114|146->114|146->114|146->114|150->118|168->136|168->136|168->136|184->152|191->159|192->160|198->166|205->173|206->174|213->181|218->186|219->187|223->191|230->198|231->199|237->205|245->213|247->215|253->221|260->228|262->230|268->236|275->243|276->244|285->253|285->253|286->254|287->255|287->255|288->256|289->257|289->257|290->258|290->258|290->258|291->259|293->261|293->261|294->262|295->263|295->263|296->264|296->264|297->265|297->265|322->290|323->291
                  -- GENERATED --
              */
          