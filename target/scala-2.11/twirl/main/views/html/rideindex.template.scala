
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rideindex_Scope0 {
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

class rideindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Ride],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ride: List[Ride]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Ride</title>
</head>
<body>
<h1>All Ride</h1>
"""),_display_(/*9.2*/for(ride <- ride) yield /*9.19*/{_display_(Seq[Any](format.raw/*9.20*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.RideController.show(ride.rideId)),format.raw/*10.51*/("""">"""),_display_(/*10.54*/ride/*10.58*/.rideId),format.raw/*10.65*/("""</a>
	<p>Ride Source: """),_display_(/*11.19*/ride/*11.23*/.source),format.raw/*11.30*/("""</p>
	<p>Ride Destination: """),_display_(/*12.24*/ride/*12.28*/.destination),format.raw/*12.40*/("""</p>
	<p>Ride Time: """),_display_(/*13.17*/ride/*13.21*/.startTime),format.raw/*13.31*/("""</p>
""")))}),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""<a href=""""),_display_(/*16.11*/routes/*16.17*/.RideController.create()),format.raw/*16.41*/("""">Create Ride</a>
</body>
</html>
"""))
      }
    }
  }

  def render(ride:List[Ride]): play.twirl.api.HtmlFormat.Appendable = apply(ride)

  def f:((List[Ride]) => play.twirl.api.HtmlFormat.Appendable) = (ride) => apply(ride)

  def ref: this.type = this

}


}

/**/
object rideindex extends rideindex_Scope0.rideindex
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/rideindex.scala.html
                  HASH: dfcd31fa7c8ffc1267115f9495c5eaf67fbb4877
                  MATRIX: 757->1|870->19|900->23|1003->101|1035->118|1073->119|1103->122|1140->132|1155->138|1209->171|1239->174|1252->178|1280->185|1331->209|1344->213|1372->220|1428->249|1441->253|1474->265|1523->287|1536->291|1567->301|1604->308|1635->312|1672->322|1687->328|1732->352
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|47->16|47->16|47->16|47->16
                  -- GENERATED --
              */
          