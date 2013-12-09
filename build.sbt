import play.Project._

name := "computerdb"

version := "1.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  "org.postgresql" % "postgresql" % "9.2-1004-jdbc4"
  )

playJavaSettings
