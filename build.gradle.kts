plugins {
    kotlin("jvm") version "2.1.0"
    id("com.google.devtools.ksp") version "2.0.0-1.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}