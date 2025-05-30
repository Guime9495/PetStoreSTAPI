plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(group = "org.testng", name = "testng", version = "7.1.0")
    testImplementation(group = "io.rest-assured", name = "rest-assured", version = "4.3.3")
}

