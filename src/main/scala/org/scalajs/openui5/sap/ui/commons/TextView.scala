package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait TextViewSettings extends ControlSettings
object TextViewSettings extends TextViewSettingsBuilder(noSettings)

class TextViewSettingsBuilder(val dict: SettingsMap)
  extends Settings[TextViewSettings, TextViewSettingsBuilder](new TextViewSettingsBuilder(_))
    with TextViewSetters[TextViewSettings, TextViewSettingsBuilder]

trait TextViewSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def text(v: String) = setting("text", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def helpId(v: String) = setting("helpId", v)
  def accessibleRole(v: AccessibleRole) = setting("accessibleRole", v)
  def design(v: TextViewDesign) = setting("design", v)
  def wrapping(v: Boolean) = setting("wrapping", v)
  def semanticColor(v: TextViewColor) = setting("semanticColor", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def width(v: CSSSize) = setting("width", v)
}


@JSName("sap.ui.commons.TextView")
@js.native
class TextView(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[TextViewSettings] = js.native)
  extends Control with ToolbarItem {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TextViewSettings) = this(js.undefined, settings)
}
