ThisBuild / name := "specialMath"

ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.12.8"


val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val scallop = "org.rogach" %% "scallop" % "3.2.0"

lazy val specialMath = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "specialMath",
    libraryDependencies += scallop,
    libraryDependencies += scalaTest % Test
  )