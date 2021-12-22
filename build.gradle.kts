plugins {
  kotlin("js") version "1.6.0"
}

group = "@group@"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.6.0")
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

