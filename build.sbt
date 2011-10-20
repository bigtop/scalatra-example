organization := "bigtop"

name := "bigtop-scalatra-example"

version := "0.1"

scalaVersion := "2.9.1"

seq(webSettings :_*)

resolvers += "Untyped" at "http://repo.untyped.com"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.1",
  "org.scalatra" %% "scalatra-scalate" % "2.0.1",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "jetty",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "bigtop" %% "bigtop-core" % "0.2-SNAPSHOT",
  "bigtop" %% "bigtop-routes" % "0.2-SNAPSHOT"
)
