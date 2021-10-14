plugins {
  kotlin("js") version "1.5.31"
}

group = "@group@"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.5.2")
  testImplementation(kotlin("test-js"))
}

kotlin {
  js(IR) {
    binaries.executable()
    browser {
      webpackTask {
        outputFileName = "bundle.js"
        output.libraryTarget = "global"
        output.globalObject = "globalThis"
      }
    }
  }
}

