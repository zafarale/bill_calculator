name := "bill_calculator"

version := "0.1"
organization := "uk.co.cirquare"
scalaVersion := "2.12.5"

scalacOptions := Seq("-deprecation", "-encoding", "utf8")
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.20"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test