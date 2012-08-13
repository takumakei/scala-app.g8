name := "$name;format="norm"$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalacOptions ++= Seq("-deprecation")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.2"
)

