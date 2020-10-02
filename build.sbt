
name := "akka-essentials"

version := "0.1"

scalaVersion := "2.12.7"

val akkaVersion = "2.5.13"
val scalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion,
)


// Scala Recap

//mainClass in (Compile, run) := Some("part1recap.GeneralRecap")
//mainClass in (Compile, run) := Some("part1recap.AdvancedRecap")
//mainClass in (Compile, run) := Some("part1recap.MultithreadingRecap")
//mainClass in (Compile, run) := Some("part1recap.ThreadModelLimitations")

// Actor System
//mainClass in (Compile, run) := Some("part2actors.ActorsIntro")
mainClass in (Compile, run) := Some("part2actors.ActorCapabilities")



