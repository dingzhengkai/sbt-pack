sonatypeProfileName := "org.xerial"

pomExtra := {
  <url>http://xerial.org/</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/xerial/sbt-pack.git</connection>
      <developerConnection>scm:git:git@github.com:xerial/sbt-pack.git</developerConnection>
      <url>https://github.com/xerial/sbt-pack</url>
    </scm>
    <developers>
      <developer>
        <id>leo</id>
        <name>Taro L. Saito</name>
        <url>http://xerial.org/leo</url>
      </developer>
    </developers>
}

// Add sonatype repository settings
publishTo := {
  val nexus = "https://maven.ifeidao.com/"
  Some {
    if (version.value.trim.contains("-")) "snapshots" at nexus + "repository/feidao-snapshot/"
    else "releases" at nexus + "repository/maven-releases/"
  }
}

dynverSonatypeSnapshots in ThisBuild := true
credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")