name := """kamon-issue-343"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

val kamonVersion = "0.6.0"
val aspectjweaverVersion = "1.8.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "io.kamon" %% "kamon-core" % kamonVersion,
  "io.kamon" %% "kamon-play-24" % kamonVersion,
  "io.kamon" %% "kamon-statsd" % kamonVersion,
  //"io.kamon" %% "kamon-akka" % kamonVersion,
  "org.aspectj" % "aspectjweaver" % aspectjweaverVersion
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
