
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object vehicleindex_Scope0 {
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

class vehicleindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Vehicle],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vehicles: List[Vehicle]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Vehicles</title>
</head>
<body>
<h1>All Vehicles</h1>
"""),_display_(/*9.2*/for(vehicle <- vehicles) yield /*9.26*/{_display_(Seq[Any](format.raw/*9.27*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.VehicleController.show(vehicle.vehicleId)),format.raw/*10.60*/("""">"""),_display_(/*10.63*/vehicle/*10.70*/.vehicleId),format.raw/*10.80*/("""</a>
	<p>Vehicle Name: """),_display_(/*11.20*/vehicle/*11.27*/.vehicleName),format.raw/*11.39*/("""</p>
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<a href=""""),_display_(/*14.11*/routes/*14.17*/.VehicleController.create()),format.raw/*14.44*/("""">Create Vehicle</a>
</body>
</html>"""))
      }
    }
  }

  def render(vehicles:List[Vehicle]): play.twirl.api.HtmlFormat.Appendable = apply(vehicles)

  def f:((List[Vehicle]) => play.twirl.api.HtmlFormat.Appendable) = (vehicles) => apply(vehicles)

  def ref: this.type = this

}


}

/**/
object vehicleindex extends vehicleindex_Scope0.vehicleindex
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:21 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/vehicleindex.scala.html
                  HASH: bf341d8d53167413f958432f57ed8f990dd7b9c9
                  MATRIX: 766->1|886->26|916->30|1027->116|1066->140|1104->141|1134->144|1171->154|1186->160|1249->202|1279->205|1295->212|1326->222|1378->247|1394->254|1427->266|1464->273|1495->277|1532->287|1547->293|1595->320
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|45->14
                  -- GENERATED --
              */
          