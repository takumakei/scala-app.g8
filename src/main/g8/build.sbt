name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalacOptions ++= Seq("-deprecation", "-unchecked")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.3",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.1",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1",
  "io.netty" % "netty" % "3.5.7.Final",
  "org.slf4j" % "slf4j-api" % "1.6.6",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime"
)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true
