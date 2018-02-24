
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rideshow_Scope0 {
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

class rideshow extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Ride,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ride: Ride):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>"""),_display_(/*5.9*/ride/*5.13*/.rideId),format.raw/*5.20*/("""</title>
</head>
<body>
<h1>"""),_display_(/*8.6*/ride/*8.10*/.rideId),format.raw/*8.17*/("""</h1>
	<p>Ride Source: """),_display_(/*9.19*/ride/*9.23*/.source),format.raw/*9.30*/("""</p>
	<p>Ride Destination: """),_display_(/*10.24*/ride/*10.28*/.destination),format.raw/*10.40*/("""</p>
	<p>Ride Time: """),_display_(/*11.17*/ride/*11.21*/.startTime),format.raw/*11.31*/("""</p>

	<a href=""""),_display_(/*13.12*/routes/*13.18*/.RideController.destroy(ride.rideId)),format.raw/*13.54*/("""">Delete</a>
</body>
</html>
"""))
      }
    }
  }

  def render(ride:Ride): play.twirl.api.HtmlFormat.Appendable = apply(ride)

  def f:((Ride) => play.twirl.api.HtmlFormat.Appendable) = (ride) => apply(ride)

  def ref: this.type = this

}


}

/**/
object rideshow extends rideshow_Scope0.rideshow
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/rideshow.scala.html
                  HASH: 5e24e83b6daba18e4c245dbff56e9850f35174bd
                  MATRIX: 749->1|856->13|886->17|935->41|947->45|974->52|1031->84|1043->88|1070->95|1121->120|1133->124|1160->131|1216->160|1229->164|1262->176|1311->198|1324->202|1355->212|1401->231|1416->237|1473->273
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|44->13|44->13|44->13
                  -- GENERATED --
              */
          