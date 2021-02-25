import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest"     %% "scalatest" % "3.2.2"
  lazy val scalaTestMock = "org.scalatestplus" %% "mockito-3-4" % "3.2.2.0"
  lazy val specs2    = "org.specs2"        %% "specs2-mock" % "4.10.6"
}
