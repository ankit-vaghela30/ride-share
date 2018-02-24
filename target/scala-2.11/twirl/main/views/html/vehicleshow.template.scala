
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object vehicleshow_Scope0 {
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

class vehicleshow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Vehicle,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vehicle: Vehicle):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>"""),_display_(/*5.9*/vehicle/*5.16*/.vehicleId),format.raw/*5.26*/("""</title>
</head>
<body>
<h1>"""),_display_(/*8.6*/vehicle/*8.13*/.vehicleId),format.raw/*8.23*/("""</h1>
	<p>Vehicle Id: """),_display_(/*9.18*/vehicle/*9.25*/.vehicleId),format.raw/*9.35*/("""</p>
	<p>Vehicle Name: """),_display_(/*10.20*/vehicle/*10.27*/.vehicleName),format.raw/*10.39*/("""</p>


	<a href=""""),_display_(/*13.12*/routes/*13.18*/.VehicleController.destroy(vehicle.vehicleId)),format.raw/*13.63*/("""">Delete</a>
</body>
</html>"""))
      }
    }
  }

  def render(vehicle:Vehicle): play.twirl.api.HtmlFormat.Appendable = apply(vehicle)

  def f:((Vehicle) => play.twirl.api.HtmlFormat.Appendable) = (vehicle) => apply(vehicle)

  def ref: this.type = this

}


}

/**/
object vehicleshow extends vehicleshow_Scope0.vehicleshow
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:21 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/vehicleshow.scala.html
                  HASH: b036cf5319550afdbd4ab5ef4350011740b5ff79
                  MATRIX: 758->1|871->19|901->23|950->47|965->54|995->64|1052->96|1067->103|1097->113|1147->137|1162->144|1192->154|1244->179|1260->186|1293->198|1341->219|1356->225|1422->270
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->13|44->13|44->13
                  -- GENERATED --
              */
          