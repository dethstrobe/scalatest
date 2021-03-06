lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.13.1"
    )
  ),
  name := "scalatest-example"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0"
libraryDependencies += "org.mockito" %% "mockito-scala-scalatest" % "1.15.0"
