import AssemblyKeys._

assemblySettings

mainClass     := Some("$organization$.Main")

name          := "$name$"

organization  := "$organization$"

version       := "$version$"

scalaVersion  := "$scalaVersion$"

scalacOptions ++= Seq("-deprecation", "-unchecked")

resolvers     += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

jarName in assembly := "$name$-$version$.jar"

libraryDependencies ++= Seq(
  "com.github.scala-incubator.io" %% "scala-io-core"   % "0.4.1",
  "com.github.scala-incubator.io" %% "scala-io-file"   % "0.4.1",
  "org.bouncycastle"               % "bcprov-jdk15on"  % "1.47",
  "com.typesafe"                   % "config"          % "1.0.0",
  "com.typesafe.akka"              % "akka-actor"      % "2.0.4",
  "io.netty"                       % "netty"           % "3.6.2.Final",
  "org.slf4j"                      % "slf4j-api"       % "1.7.2",
  "ch.qos.logback"                 % "logback-classic" % "1.0.9"  % "runtime",
  "mysql"                    % "mysql-connector-java"  % "5.1.22" % "runtime"
)

EclipseKeys.createSrc  := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true
