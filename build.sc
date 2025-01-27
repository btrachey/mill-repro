package build

import mill._

import scalalib._
import scalanativelib._

object tmp extends ScalaNativeModule {
  def scalaVersion = "3.3.4"
  def scalaNativeVersion = "0.5.6"
}
