ThisBuild / name := "hexTo64"

ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.12.8"


val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val guava = "com.google.guava" % "guava" % "27.1-jre"
val scallop = "org.rogach" %% "scallop" % "3.2.0"

lazy val hexTo64 = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "hexTo64",
    libraryDependencies += guava,
    libraryDependencies += scallop,
    libraryDependencies += scalaTest % Test
  )
