name := "httpBM"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.15.1",
  "com.github.finagle" %% "finch-circe" % "0.15.1",
  "io.circe" %% "circe-generic" % "0.7.1",
  "org.http4s" %% "http4s-dsl" % "0.15.16",
  "org.http4s" %% "http4s-blaze-server" % "0.15.16",
  "com.typesafe.akka" %% "akka-http" % "10.0.9"
)
