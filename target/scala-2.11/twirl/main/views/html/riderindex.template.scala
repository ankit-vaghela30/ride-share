
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object riderindex_Scope0 {
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

class riderindex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Rider],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(riders: List[Rider]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<html>
<head>
<title>All Riders</title>
</head>
<body>
<h1>All Riders</h1>
"""),_display_(/*9.2*/for(rider <- riders) yield /*9.22*/{_display_(Seq[Any](format.raw/*9.23*/("""
	"""),format.raw/*10.2*/("""<a href=""""),_display_(/*10.12*/routes/*10.18*/.RiderController.show(rider.riderId)),format.raw/*10.54*/("""">"""),_display_(/*10.57*/rider/*10.62*/.riderId),format.raw/*10.70*/("""</a>
	<p>Rider Name: """),_display_(/*11.18*/rider/*11.23*/.firstName),format.raw/*11.33*/("""</p>
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<a href=""""),_display_(/*14.11*/routes/*14.17*/.RiderController.create()),format.raw/*14.42*/("""">Create Rider</a>
</body>
</html>
"""))
      }
    }
  }

  def render(riders:List[Rider]): play.twirl.api.HtmlFormat.Appendable = apply(riders)

  def f:((List[Rider]) => play.twirl.api.HtmlFormat.Appendable) = (riders) => apply(riders)

  def ref: this.type = this

}


}

/**/
object riderindex extends riderindex_Scope0.riderindex
              /*
                  -- GENERATED --
                  DATE: Sun Dec 03 20:49:20 EST 2017
                  SOURCE: C:/IMP Files/Play_Framework/Ride_Share_Final/app/views/riderindex.scala.html
                  HASH: d1029e6da9b441171a1126af4a6cd1bc4752363d
                  MATRIX: 760->1|876->22|906->26|1013->108|1048->128|1086->129|1116->132|1153->142|1168->148|1225->184|1255->187|1269->192|1298->200|1348->223|1362->228|1393->238|1430->245|1461->249|1498->259|1513->265|1559->290
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|45->14
                  -- GENERATED --
              */
          