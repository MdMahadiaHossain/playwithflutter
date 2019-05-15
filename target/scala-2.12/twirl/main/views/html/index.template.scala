
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title></title>
  <script defer src=""""),_display_(/*6.23*/routes/*6.29*/.Assets.versioned("javascripts/main.dart.js")),format.raw/*6.74*/("""" type="application/javascript"></script>
</head>
<body>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 15 22:47:37 BDT 2019
                  SOURCE: /mnt/CCA2B0E3A2B0D2E6/Lab/PlayFramework/playwithflutter/app/views/index.scala.html
                  HASH: 4c1a8130a0371ec04fe93bdfebc0f7b93b32fefc
                  MATRIX: 811->0|942->105|956->111|1021->156
                  LINES: 26->1|31->6|31->6|31->6
                  -- GENERATED --
              */
          