scalaVersion := "2.11.6"

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"

libraryDependencies += "sh.den" % "scala-offheap_2.11" % "0.1"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
