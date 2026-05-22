plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "7.3.0.8198"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.projectKey", "KireevaV_qa-auto-engineer-java-project-61")
        property("sonar.organization", "kireevav")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sources", "App/src/main/java")
        property("sonar.java.binaries", "build/classes")
    }
}
