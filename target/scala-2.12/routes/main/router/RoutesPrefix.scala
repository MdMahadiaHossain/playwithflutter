// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/CCA2B0E3A2B0D2E6/Lab/PlayFramework/playwithflutter/conf/routes
// @DATE:Wed May 15 13:49:05 BDT 2019


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
