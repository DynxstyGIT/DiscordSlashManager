plugins {
    id("java")
}

group = "dev.dynxsty"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("com.formdev:flatlaf:1.5")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}