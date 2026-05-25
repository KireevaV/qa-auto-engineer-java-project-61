plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "7.3.0.8198"
    id("checkstyle")
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
sourceSets {
    main {
        java {
            setSrcDirs(listOf("App/src/main/java"))
        }
    }
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

checkstyle {
    toolVersion = "10.12.0"
    configFile = file("App/config/checkstyle/checkstyle.xml")
}

tasks.named<Checkstyle>("checkstyleMain") {
    source = fileTree("App/src/main/java")
}

tasks.named<Checkstyle>("checkstyleTest") {
    source = fileTree("App/src/test/java")
}