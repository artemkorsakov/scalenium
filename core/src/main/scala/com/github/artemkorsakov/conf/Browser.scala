package com.github.artemkorsakov.conf

import enumeratum.EnumEntry._
import enumeratum._

sealed trait Browser extends EnumEntry with Snakecase

object Browser extends Enum[Browser] {
  val values: IndexedSeq[Browser] = findValues
  case object Firefox extends Browser
  case object Edge    extends Browser
  case object IE      extends Browser
  case object Safari  extends Browser
  case object Chrome  extends Browser
}
