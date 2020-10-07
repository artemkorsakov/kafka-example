name := "kafka-example"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  ("org.apache.kafka" %% "kafka" % "2.6.0")
    .exclude("com.fasterxml.jackson.core", "jackson-annotations")
    .exclude("com.fasterxml.jackson.core", "jackson-databind")
    .exclude("com.fasterxml.jackson.dataformat", "jackson-dataformat-csv")
    .exclude("com.fasterxml.jackson.datatype", "jackson-datatype-jdk8")
    .exclude("com.fasterxml.jackson.module", "jackson-module-paranamer")
    .exclude("io.netty", "netty-buffer")
    .exclude("io.netty", "netty-codec")
    .exclude("io.netty", "netty-handler")
    .exclude("io.netty", "netty-resolver")
    .exclude("io.netty", "netty-transport-native-epoll")
    .exclude("io.netty", "netty-transport-native-unix-common")
)
