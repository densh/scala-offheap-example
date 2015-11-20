scalaVersion := "2.11.6"

libraryDependencies += "sh.den" % "scala-offheap_2.11" % "0.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
