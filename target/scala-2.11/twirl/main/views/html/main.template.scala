
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""">
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*16.66*/("""" type="text/javascript"></script>

        <!-- BOOTSTRAP CSS/JSS CDN -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/vivus/0.4.3/vivus.js" crossorigin="anonymous"></script>

        <!-- JQUERY AND POPPER CDN -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>

        <!-- Stylesheets and javascript -->
    <link rel="stylesheet" type='text/css' media="screen" href='"""),_display_(/*28.66*/routes/*28.72*/.Assets.versioned("stylesheets/index.css")),format.raw/*28.114*/("""'>
    <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Bitter|Source+Sans+Pro" rel="stylesheet">
    <link rel='stylesheet prefetch' href='http:////netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css'>

    </head>
    <style>
            html """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
                """),format.raw/*36.17*/("""font-family: 'PT Sans', sans-serif;
            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""body """),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
                """),format.raw/*39.17*/("""margin: auto;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/(""".nav_text """),format.raw/*41.23*/("""{"""),format.raw/*41.24*/("""
                """),format.raw/*42.17*/("""color: white;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""
            """),format.raw/*44.13*/(""".navbar-header"""),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""
                """),format.raw/*45.17*/("""margin-left:5px;
                width:100%;
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            """),format.raw/*48.13*/(""".navcontainer """),format.raw/*48.27*/("""{"""),format.raw/*48.28*/("""
                """),format.raw/*49.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            """),format.raw/*52.13*/("""body """),format.raw/*52.18*/("""{"""),format.raw/*52.19*/("""
                """),format.raw/*53.17*/("""margin: auto;
            """),format.raw/*54.13*/("""}"""),format.raw/*54.14*/("""
            """),format.raw/*55.13*/(""".navbar, .navbar-fixed """),format.raw/*55.36*/("""{"""),format.raw/*55.37*/("""
                """),format.raw/*56.17*/("""background-color: gray;
                opacity: .90;
                z-index: 99;
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""
            """),format.raw/*60.13*/("""#navbar """),format.raw/*60.21*/("""{"""),format.raw/*60.22*/("""
                """),format.raw/*61.17*/("""margin-left: 10%;
                margin-right: 5%;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
            """),format.raw/*64.13*/(""".navbar-brand """),format.raw/*64.27*/("""{"""),format.raw/*64.28*/("""
                """),format.raw/*65.17*/("""font-family: 'Bitter', serif;
                font-size: 22px;
                color: white;
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/("""
            """),format.raw/*69.13*/(""".nav-link """),format.raw/*69.23*/("""{"""),format.raw/*69.24*/("""
                """),format.raw/*70.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: white;
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
            """),format.raw/*74.13*/("""nav.navbar.fixed-top """),format.raw/*74.34*/("""{"""),format.raw/*74.35*/("""
                """),format.raw/*75.17*/("""padding: 0em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""
            """),format.raw/*78.13*/(""".jumbotron """),format.raw/*78.24*/("""{"""),format.raw/*78.25*/("""
                """),format.raw/*79.17*/("""background-image: url("https://images.unsplash.com/photo-1489824904134-891ab64532f1?auto=format&fit=crop&w=2689&q=60&ixid=dW5zcGxhc2guY29tOzs7Ozs%3D");
                background-position: left;
                padding-bottom: 6em;
                padding-top: 3em;
                border-radius: 0px;
                margin-bottom: 0px;
                z-index: 3;
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""
            """),format.raw/*87.13*/(""".jumbotron-text """),format.raw/*87.29*/("""{"""),format.raw/*87.30*/("""
                """),format.raw/*88.17*/("""margin-left: 10%;
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""
            """),format.raw/*90.13*/(""".display-3 """),format.raw/*90.24*/("""{"""),format.raw/*90.25*/("""
                """),format.raw/*91.17*/("""font-family: 'Bitter', serif;
                font-weight: 700;
                color: white;
                padding-top: 1em;
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/("""
            """),format.raw/*96.13*/(""".lead, .lead-2 """),format.raw/*96.28*/("""{"""),format.raw/*96.29*/("""
                """),format.raw/*97.17*/("""color: white;
                font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
            """),format.raw/*100.13*/(""".below-jumbo"""),format.raw/*100.25*/("""{"""),format.raw/*100.26*/("""
                """),format.raw/*101.17*/("""margin-left: 7%;
                margin-right: 7%;
                padding-bottom: 3em;
                padding-top: 4em;
                background-color: white;
                z-index: 2;
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/("""
            """),format.raw/*108.13*/(""".mid """),format.raw/*108.18*/("""{"""),format.raw/*108.19*/("""
                """),format.raw/*109.17*/("""text-align: center;
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""
            """),format.raw/*111.13*/(""".row1 """),format.raw/*111.19*/("""{"""),format.raw/*111.20*/("""
                """),format.raw/*112.17*/("""margin-left: 10%;
            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/("""
            """),format.raw/*114.13*/(""".midtext """),format.raw/*114.22*/("""{"""),format.raw/*114.23*/("""
                """),format.raw/*115.17*/("""font-size: 18px;
                color: black;
                font-family: 'Bitter', serif;
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/("""
            """),format.raw/*119.13*/(""".longmid """),format.raw/*119.22*/("""{"""),format.raw/*119.23*/("""
                """),format.raw/*120.17*/("""margin-left: 10%;
                margin-right: 10%;
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/("""
            """),format.raw/*123.13*/(""".midp """),format.raw/*123.19*/("""{"""),format.raw/*123.20*/("""
                """),format.raw/*124.17*/("""margin: inherit;
                color: black;
                margin: 1.5em;
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/("""
            """),format.raw/*128.13*/(""".my-2 """),format.raw/*128.19*/("""{"""),format.raw/*128.20*/("""
                """),format.raw/*129.17*/("""display: block;
                height: 1px;
                border: 0;
                border-top: 1px solid #ccc;
                margin: 1em 0;
                padding: 0;
            """),format.raw/*135.13*/("""}"""),format.raw/*135.14*/("""
            """),format.raw/*136.13*/(""".bottom-wrapper """),format.raw/*136.29*/("""{"""),format.raw/*136.30*/("""
                """),format.raw/*137.17*/("""padding-top: 4em;
                margin-top: 4em;
                background-color: indianred;
                padding-bottom: 3em;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
                border-bottom-left-radius: 3em;
                border-bottom-right-radius: 1em;
                border-top-right-radius: 3em;
                border-top-left-radius: 1em;
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""
            """),format.raw/*147.13*/(""".holder """),format.raw/*147.21*/("""{"""),format.raw/*147.22*/("""
                """),format.raw/*148.17*/("""background-color: indianred;
                margin-left: 10%;
                margin-right: 10%;
            """),format.raw/*151.13*/("""}"""),format.raw/*151.14*/("""
            """),format.raw/*152.13*/(""".card """),format.raw/*152.19*/("""{"""),format.raw/*152.20*/("""
                """),format.raw/*153.17*/("""margin: 0 auto;
                float: none;
                margin-bottom: 10px;
                width: 90%;
                box-shadow: 0 0 4px 1px rgba(0, 0, 0, 0.3);
                border: 0px;
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/("""
            """),format.raw/*160.13*/(""".card-title """),format.raw/*160.25*/("""{"""),format.raw/*160.26*/("""
                """),format.raw/*161.17*/("""font-family: 'Bitter', serif;
            """),format.raw/*162.13*/("""}"""),format.raw/*162.14*/("""
            """),format.raw/*163.13*/(""".card-text """),format.raw/*163.24*/("""{"""),format.raw/*163.25*/("""
                """),format.raw/*164.17*/("""font-family: 'Source Sans Pro', sans-serif;
            """),format.raw/*165.13*/("""}"""),format.raw/*165.14*/("""
            """),format.raw/*166.13*/(""".bottom-h1 """),format.raw/*166.24*/("""{"""),format.raw/*166.25*/("""
                """),format.raw/*167.17*/("""margin-left: 10%;
                font-family: 'Bitter', serif;
                font-size: 35px;
                color: white;
            """),format.raw/*171.13*/("""}"""),format.raw/*171.14*/("""
            """),format.raw/*172.13*/(""".bottom-h2 """),format.raw/*172.24*/("""{"""),format.raw/*172.25*/("""
                """),format.raw/*173.17*/("""margin-left: 10%;
                margin-right: 15%;
                font-family: 'Source Sans Pro', sans-serif;
                font-size: 22px;
                color: white;
            """),format.raw/*178.13*/("""}"""),format.raw/*178.14*/("""
            """),format.raw/*179.13*/(""".navbar-footer """),format.raw/*179.28*/("""{"""),format.raw/*179.29*/("""
                """),format.raw/*180.17*/("""background-color: white;
            """),format.raw/*181.13*/("""}"""),format.raw/*181.14*/("""
            """),format.raw/*182.13*/("""#footerlink """),format.raw/*182.25*/("""{"""),format.raw/*182.26*/("""
                """),format.raw/*183.17*/("""font-size: 16px;
                font-family: 'Bitter', serif;
                color: black;
            """),format.raw/*186.13*/("""}"""),format.raw/*186.14*/("""
            """),format.raw/*187.13*/("""#bottom-brand """),format.raw/*187.27*/("""{"""),format.raw/*187.28*/("""
                """),format.raw/*188.17*/("""color: black;
            """),format.raw/*189.13*/("""}"""),format.raw/*189.14*/("""
    """),format.raw/*190.5*/("""</style>

    <body>
        """),format.raw/*194.31*/("""
        """),_display_(/*195.10*/content),format.raw/*195.17*/("""
    """),format.raw/*196.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/main.scala.html
                  HASH: a4be03973f19fe4e22748209de50a2b125f9c5b5
                  MATRIX: 997->255|1122->285|1150->287|1230->392|1262->397|1297->405|1323->410|1408->468|1423->474|1485->515|1569->572|1584->578|1645->617|1693->638|1708->644|1770->685|2960->1848|2975->1854|3039->1896|3410->2239|3439->2240|3484->2257|3560->2305|3589->2306|3630->2319|3663->2324|3692->2325|3737->2342|3791->2368|3820->2369|3861->2382|3899->2392|3928->2393|3973->2410|4027->2436|4056->2437|4097->2450|4139->2464|4168->2465|4213->2482|4298->2539|4327->2540|4368->2553|4410->2567|4439->2568|4484->2585|4576->2649|4605->2650|4646->2663|4679->2668|4708->2669|4753->2686|4807->2712|4836->2713|4877->2726|4928->2749|4957->2750|5002->2767|5125->2862|5154->2863|5195->2876|5231->2884|5260->2885|5305->2902|5397->2966|5426->2967|5467->2980|5509->2994|5538->2995|5583->3012|5716->3117|5745->3118|5786->3131|5824->3141|5853->3142|5898->3159|6031->3264|6060->3265|6101->3278|6150->3299|6179->3300|6224->3317|6338->3403|6367->3404|6408->3417|6447->3428|6476->3429|6521->3446|6927->3824|6956->3825|6997->3838|7041->3854|7070->3855|7115->3872|7173->3902|7202->3903|7243->3916|7282->3927|7311->3928|7356->3945|7524->4085|7553->4086|7594->4099|7637->4114|7666->4115|7711->4132|7825->4218|7854->4219|7896->4232|7937->4244|7967->4245|8013->4262|8245->4465|8275->4466|8317->4479|8351->4484|8381->4485|8427->4502|8488->4534|8518->4535|8560->4548|8595->4554|8625->4555|8671->4572|8730->4602|8760->4603|8802->4616|8840->4625|8870->4626|8916->4643|9050->4748|9080->4749|9122->4762|9160->4771|9190->4772|9236->4789|9330->4854|9360->4855|9402->4868|9437->4874|9467->4875|9513->4892|9632->4982|9662->4983|9704->4996|9739->5002|9769->5003|9815->5020|10031->5207|10061->5208|10103->5221|10148->5237|10178->5238|10224->5255|10646->5648|10676->5649|10718->5662|10755->5670|10785->5671|10831->5688|10970->5798|11000->5799|11042->5812|11077->5818|11107->5819|11153->5836|11393->6047|11423->6048|11465->6061|11506->6073|11536->6074|11582->6091|11653->6133|11683->6134|11725->6147|11765->6158|11795->6159|11841->6176|11926->6232|11956->6233|11998->6246|12038->6257|12068->6258|12114->6275|12282->6414|12312->6415|12354->6428|12394->6439|12424->6440|12470->6457|12687->6645|12717->6646|12759->6659|12803->6674|12833->6675|12879->6692|12945->6729|12975->6730|13017->6743|13058->6755|13088->6756|13134->6773|13268->6878|13298->6879|13340->6892|13383->6906|13413->6907|13459->6924|13514->6950|13544->6951|13577->6956|13635->7074|13673->7084|13702->7091|13735->7096
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|58->28|58->28|58->28|65->35|65->35|66->36|67->37|67->37|68->38|68->38|68->38|69->39|70->40|70->40|71->41|71->41|71->41|72->42|73->43|73->43|74->44|74->44|74->44|75->45|77->47|77->47|78->48|78->48|78->48|79->49|81->51|81->51|82->52|82->52|82->52|83->53|84->54|84->54|85->55|85->55|85->55|86->56|89->59|89->59|90->60|90->60|90->60|91->61|93->63|93->63|94->64|94->64|94->64|95->65|98->68|98->68|99->69|99->69|99->69|100->70|103->73|103->73|104->74|104->74|104->74|105->75|107->77|107->77|108->78|108->78|108->78|109->79|116->86|116->86|117->87|117->87|117->87|118->88|119->89|119->89|120->90|120->90|120->90|121->91|125->95|125->95|126->96|126->96|126->96|127->97|129->99|129->99|130->100|130->100|130->100|131->101|137->107|137->107|138->108|138->108|138->108|139->109|140->110|140->110|141->111|141->111|141->111|142->112|143->113|143->113|144->114|144->114|144->114|145->115|148->118|148->118|149->119|149->119|149->119|150->120|152->122|152->122|153->123|153->123|153->123|154->124|157->127|157->127|158->128|158->128|158->128|159->129|165->135|165->135|166->136|166->136|166->136|167->137|176->146|176->146|177->147|177->147|177->147|178->148|181->151|181->151|182->152|182->152|182->152|183->153|189->159|189->159|190->160|190->160|190->160|191->161|192->162|192->162|193->163|193->163|193->163|194->164|195->165|195->165|196->166|196->166|196->166|197->167|201->171|201->171|202->172|202->172|202->172|203->173|208->178|208->178|209->179|209->179|209->179|210->180|211->181|211->181|212->182|212->182|212->182|213->183|216->186|216->186|217->187|217->187|217->187|218->188|219->189|219->189|220->190|223->194|224->195|224->195|225->196
                  -- GENERATED --
              */
          