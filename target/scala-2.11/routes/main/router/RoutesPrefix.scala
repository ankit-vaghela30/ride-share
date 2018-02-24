
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/IMP Files/Play_Framework/Ride_Share_Final/conf/routes
// @DATE:Sun Dec 03 20:49:18 EST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
