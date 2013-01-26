import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "$name$"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.typesafe"      % "config"                % "1.0.0",
      "com.typesafe.akka" % "akka-actor"            % "2.0.4",
      "org.bouncycastle"  % "bcprov-jdk15on"        % "1.47",
      "io.netty"          % "netty"                 % "3.6.2.Final",
      "org.slf4j"         % "slf4j-api"             % "1.7.2",
      "ch.qos.logback"    % "logback-classic"       % "1.0.9"  % "runtime",
      "mysql"             % "mysql-connector-java"  % "5.1.22" % "runtime"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
