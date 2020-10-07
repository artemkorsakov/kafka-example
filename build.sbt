name := "kafka-example"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "ch.qos.logback"              % "logback-classic"  % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging"    % "3.9.2",
  "com.fasterxml.jackson.core"  % "jackson-databind" % "2.11.3",
  "org.apache.kafka"           %% "kafka"            % "2.6.0"
)
