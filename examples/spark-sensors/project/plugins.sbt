//resolvers += Resolver.url("lightbend-oss", url("https://lightbend.bintray.com/cloudflow"))(Resolver.ivyStylePatterns)
//resolvers += "Akka Snapshots" at "https://repo.akka.io/snapshots/"

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.2.1")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.1.1")
addSbtPlugin("com.lightbend.cloudflow" % "sbt-cloudflow" % "2.1.2")

