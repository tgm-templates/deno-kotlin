plugins {
  kotlin("js") version "1.4.30"
  id("deno-plugin")
}

group = "@group@"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.4.2")
  testImplementation(kotlin("test-js"))
}

kotlin {
  js(IR) {
    useCommonJs()
    binaries.executable()
    nodejs()
  }
}

tasks {
  //task from buildSrc
  register<org.mvnsearch.DenoTask>("deno") {
    dependsOn("mainClasses")
    group = "Deno"
    description = "Build Deno file from Kotlin"
  }
}
