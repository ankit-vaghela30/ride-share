
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/IMP Files/Play_Framework/Ride_Share_Final/conf/routes
// @DATE:Sun Dec 03 20:49:18 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:12
  DriverController_5: controllers.DriverController,
  // @LINE:20
  VehicleController_7: controllers.VehicleController,
  // @LINE:26
  RiderController_4: controllers.RiderController,
  // @LINE:34
  RideController_1: controllers.RideController,
  // @LINE:48
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:12
    DriverController_5: controllers.DriverController,
    // @LINE:20
    VehicleController_7: controllers.VehicleController,
    // @LINE:26
    RiderController_4: controllers.RiderController,
    // @LINE:34
    RideController_1: controllers.RideController,
    // @LINE:48
    Assets_6: controllers.Assets
  ) = this(errorHandler, HomeController_2, CountController_0, AsyncController_3, DriverController_5, VehicleController_7, RiderController_4, RideController_1, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_0, AsyncController_3, DriverController_5, VehicleController_7, RiderController_4, RideController_1, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers""", """controllers.DriverController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers/create""", """controllers.DriverController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers/""" + "$" + """id<[^/]+>""", """controllers.DriverController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers/create""", """controllers.DriverController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers/delete/""" + "$" + """id<[^/]+>""", """controllers.DriverController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logindriver""", """controllers.DriverController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatedriver""", """controllers.DriverController.validate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehicles""", """controllers.VehicleController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehicles/create""", """controllers.VehicleController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehicles/""" + "$" + """id<[^/]+>""", """controllers.VehicleController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehicles/create""", """controllers.VehicleController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vehicles/delete/""" + "$" + """id<[^/]+>""", """controllers.VehicleController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riders""", """controllers.RiderController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riders/create""", """controllers.RiderController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riders/""" + "$" + """id<[^/]+>""", """controllers.RiderController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riders/create""", """controllers.RiderController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riders/delete/""" + "$" + """id<[^/]+>""", """controllers.RiderController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginrider""", """controllers.RiderController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validaterider""", """controllers.RiderController.validate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchrider""", """controllers.RideController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerrider""", """controllers.RideController.register(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ridersearchrides""", """controllers.RideController.searchRides()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ridershowrides""", """controllers.RiderController.showRides(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """riderraterides""", """controllers.RideController.rate(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveriderrating""", """controllers.RideController.saveRide()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ride""", """controllers.RideController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ride/create""", """controllers.RideController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ride/""" + "$" + """id<[^/]+>""", """controllers.RideController.show(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ride/create""", """controllers.RideController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ride/delete/""" + "$" + """id<[^/]+>""", """controllers.RideController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DriverController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers")))
  )
  private[this] lazy val controllers_DriverController_index3_invoker = createInvoker(
    DriverController_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """drivers"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DriverController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers/create")))
  )
  private[this] lazy val controllers_DriverController_create4_invoker = createInvoker(
    DriverController_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """drivers/create"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DriverController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DriverController_show5_invoker = createInvoker(
    DriverController_5.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """drivers/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DriverController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers/create")))
  )
  private[this] lazy val controllers_DriverController_save6_invoker = createInvoker(
    DriverController_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """drivers/create"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DriverController_destroy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DriverController_destroy7_invoker = createInvoker(
    DriverController_5.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """drivers/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DriverController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logindriver")))
  )
  private[this] lazy val controllers_DriverController_login8_invoker = createInvoker(
    DriverController_5.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """logindriver"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DriverController_validate9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatedriver")))
  )
  private[this] lazy val controllers_DriverController_validate9_invoker = createInvoker(
    DriverController_5.validate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DriverController",
      "validate",
      Nil,
      "GET",
      """""",
      this.prefix + """validatedriver"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_VehicleController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehicles")))
  )
  private[this] lazy val controllers_VehicleController_index10_invoker = createInvoker(
    VehicleController_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """vehicles"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_VehicleController_create11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehicles/create")))
  )
  private[this] lazy val controllers_VehicleController_create11_invoker = createInvoker(
    VehicleController_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """vehicles/create"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_VehicleController_show12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehicles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VehicleController_show12_invoker = createInvoker(
    VehicleController_7.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """vehicles/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_VehicleController_save13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehicles/create")))
  )
  private[this] lazy val controllers_VehicleController_save13_invoker = createInvoker(
    VehicleController_7.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """vehicles/create"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_VehicleController_destroy14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vehicles/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VehicleController_destroy14_invoker = createInvoker(
    VehicleController_7.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VehicleController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """vehicles/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RiderController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riders")))
  )
  private[this] lazy val controllers_RiderController_index15_invoker = createInvoker(
    RiderController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """riders"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_RiderController_create16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riders/create")))
  )
  private[this] lazy val controllers_RiderController_create16_invoker = createInvoker(
    RiderController_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """riders/create"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RiderController_show17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riders/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RiderController_show17_invoker = createInvoker(
    RiderController_4.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """riders/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RiderController_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riders/create")))
  )
  private[this] lazy val controllers_RiderController_save18_invoker = createInvoker(
    RiderController_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """riders/create"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_RiderController_destroy19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riders/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RiderController_destroy19_invoker = createInvoker(
    RiderController_4.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """riders/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_RiderController_login20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginrider")))
  )
  private[this] lazy val controllers_RiderController_login20_invoker = createInvoker(
    RiderController_4.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """loginrider"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_RiderController_validate21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validaterider")))
  )
  private[this] lazy val controllers_RiderController_validate21_invoker = createInvoker(
    RiderController_4.validate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "validate",
      Nil,
      "GET",
      """""",
      this.prefix + """validaterider"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_RideController_search22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchrider")))
  )
  private[this] lazy val controllers_RideController_search22_invoker = createInvoker(
    RideController_1.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """searchrider"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_RideController_register23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerrider")))
  )
  private[this] lazy val controllers_RideController_register23_invoker = createInvoker(
    RideController_1.register(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "register",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """registerrider"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RideController_searchRides24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ridersearchrides")))
  )
  private[this] lazy val controllers_RideController_searchRides24_invoker = createInvoker(
    RideController_1.searchRides(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "searchRides",
      Nil,
      "GET",
      """""",
      this.prefix + """ridersearchrides"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_RiderController_showRides25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ridershowrides")))
  )
  private[this] lazy val controllers_RiderController_showRides25_invoker = createInvoker(
    RiderController_4.showRides(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RiderController",
      "showRides",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """ridershowrides"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_RideController_rate26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("riderraterides")))
  )
  private[this] lazy val controllers_RideController_rate26_invoker = createInvoker(
    RideController_1.rate(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "rate",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """riderraterides"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_RideController_saveRide27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveriderrating")))
  )
  private[this] lazy val controllers_RideController_saveRide27_invoker = createInvoker(
    RideController_1.saveRide(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "saveRide",
      Nil,
      "GET",
      """""",
      this.prefix + """saveriderrating"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_RideController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ride")))
  )
  private[this] lazy val controllers_RideController_index28_invoker = createInvoker(
    RideController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """ride"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RideController_create29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ride/create")))
  )
  private[this] lazy val controllers_RideController_create29_invoker = createInvoker(
    RideController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """ride/create"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_RideController_show30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ride/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RideController_show30_invoker = createInvoker(
    RideController_1.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """ride/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_RideController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ride/create")))
  )
  private[this] lazy val controllers_RideController_save31_invoker = createInvoker(
    RideController_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """ride/create"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_RideController_destroy32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ride/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RideController_destroy32_invoker = createInvoker(
    RideController_1.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RideController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """ride/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned33_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:12
    case controllers_DriverController_index3_route(params) =>
      call { 
        controllers_DriverController_index3_invoker.call(DriverController_5.index())
      }
  
    // @LINE:13
    case controllers_DriverController_create4_route(params) =>
      call { 
        controllers_DriverController_create4_invoker.call(DriverController_5.create())
      }
  
    // @LINE:14
    case controllers_DriverController_show5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DriverController_show5_invoker.call(DriverController_5.show(id))
      }
  
    // @LINE:15
    case controllers_DriverController_save6_route(params) =>
      call { 
        controllers_DriverController_save6_invoker.call(DriverController_5.save())
      }
  
    // @LINE:16
    case controllers_DriverController_destroy7_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DriverController_destroy7_invoker.call(DriverController_5.destroy(id))
      }
  
    // @LINE:17
    case controllers_DriverController_login8_route(params) =>
      call { 
        controllers_DriverController_login8_invoker.call(DriverController_5.login())
      }
  
    // @LINE:18
    case controllers_DriverController_validate9_route(params) =>
      call { 
        controllers_DriverController_validate9_invoker.call(DriverController_5.validate())
      }
  
    // @LINE:20
    case controllers_VehicleController_index10_route(params) =>
      call { 
        controllers_VehicleController_index10_invoker.call(VehicleController_7.index())
      }
  
    // @LINE:21
    case controllers_VehicleController_create11_route(params) =>
      call { 
        controllers_VehicleController_create11_invoker.call(VehicleController_7.create())
      }
  
    // @LINE:22
    case controllers_VehicleController_show12_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_VehicleController_show12_invoker.call(VehicleController_7.show(id))
      }
  
    // @LINE:23
    case controllers_VehicleController_save13_route(params) =>
      call { 
        controllers_VehicleController_save13_invoker.call(VehicleController_7.save())
      }
  
    // @LINE:24
    case controllers_VehicleController_destroy14_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_VehicleController_destroy14_invoker.call(VehicleController_7.destroy(id))
      }
  
    // @LINE:26
    case controllers_RiderController_index15_route(params) =>
      call { 
        controllers_RiderController_index15_invoker.call(RiderController_4.index())
      }
  
    // @LINE:27
    case controllers_RiderController_create16_route(params) =>
      call { 
        controllers_RiderController_create16_invoker.call(RiderController_4.create())
      }
  
    // @LINE:28
    case controllers_RiderController_show17_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RiderController_show17_invoker.call(RiderController_4.show(id))
      }
  
    // @LINE:29
    case controllers_RiderController_save18_route(params) =>
      call { 
        controllers_RiderController_save18_invoker.call(RiderController_4.save())
      }
  
    // @LINE:30
    case controllers_RiderController_destroy19_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RiderController_destroy19_invoker.call(RiderController_4.destroy(id))
      }
  
    // @LINE:31
    case controllers_RiderController_login20_route(params) =>
      call { 
        controllers_RiderController_login20_invoker.call(RiderController_4.login())
      }
  
    // @LINE:32
    case controllers_RiderController_validate21_route(params) =>
      call { 
        controllers_RiderController_validate21_invoker.call(RiderController_4.validate())
      }
  
    // @LINE:34
    case controllers_RideController_search22_route(params) =>
      call { 
        controllers_RideController_search22_invoker.call(RideController_1.search())
      }
  
    // @LINE:35
    case controllers_RideController_register23_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RideController_register23_invoker.call(RideController_1.register(id))
      }
  
    // @LINE:36
    case controllers_RideController_searchRides24_route(params) =>
      call { 
        controllers_RideController_searchRides24_invoker.call(RideController_1.searchRides())
      }
  
    // @LINE:37
    case controllers_RiderController_showRides25_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RiderController_showRides25_invoker.call(RiderController_4.showRides(id))
      }
  
    // @LINE:38
    case controllers_RideController_rate26_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_RideController_rate26_invoker.call(RideController_1.rate(id))
      }
  
    // @LINE:39
    case controllers_RideController_saveRide27_route(params) =>
      call { 
        controllers_RideController_saveRide27_invoker.call(RideController_1.saveRide())
      }
  
    // @LINE:41
    case controllers_RideController_index28_route(params) =>
      call { 
        controllers_RideController_index28_invoker.call(RideController_1.index())
      }
  
    // @LINE:42
    case controllers_RideController_create29_route(params) =>
      call { 
        controllers_RideController_create29_invoker.call(RideController_1.create())
      }
  
    // @LINE:43
    case controllers_RideController_show30_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RideController_show30_invoker.call(RideController_1.show(id))
      }
  
    // @LINE:44
    case controllers_RideController_save31_route(params) =>
      call { 
        controllers_RideController_save31_invoker.call(RideController_1.save())
      }
  
    // @LINE:45
    case controllers_RideController_destroy32_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RideController_destroy32_invoker.call(RideController_1.destroy(id))
      }
  
    // @LINE:48
    case controllers_Assets_versioned33_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned33_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
