
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/IMP Files/Play_Framework/Ride_Share_Final/conf/routes
// @DATE:Sun Dec 03 20:49:18 EST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:48
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseDriverController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drivers/create"})
        }
      """
    )
  
    // @LINE:14
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drivers/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.destroy",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drivers/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "drivers/create"})
        }
      """
    )
  
    // @LINE:18
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.validate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validatedriver"})
        }
      """
    )
  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drivers"})
        }
      """
    )
  
    // @LINE:17
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DriverController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logindriver"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseRideController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ride/create"})
        }
      """
    )
  
    // @LINE:39
    def saveRide: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.saveRide",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saveriderrating"})
        }
      """
    )
  
    // @LINE:43
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ride/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.destroy",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ride/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def searchRides: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.searchRides",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ridersearchrides"})
        }
      """
    )
  
    // @LINE:38
    def rate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.rate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riderraterides" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:44
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ride/create"})
        }
      """
    )
  
    // @LINE:34
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchrider"})
        }
      """
    )
  
    // @LINE:35
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.register",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registerrider" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:41
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RideController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ride"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseRiderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riders/create"})
        }
      """
    )
  
    // @LINE:28
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riders/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:37
    def showRides: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.showRides",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ridershowrides" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:30
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.destroy",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riders/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "riders/create"})
        }
      """
    )
  
    // @LINE:32
    def validate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.validate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validaterider"})
        }
      """
    )
  
    // @LINE:26
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "riders"})
        }
      """
    )
  
    // @LINE:31
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RiderController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginrider"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseVehicleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehicles/create"})
        }
      """
    )
  
    // @LINE:22
    def show: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.show",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehicles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.destroy",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehicles/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:23
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vehicles/create"})
        }
      """
    )
  
    // @LINE:20
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VehicleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vehicles"})
        }
      """
    )
  
  }


}
