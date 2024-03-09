plugins {
    id("java")
}

group = "org.newdawn"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.1.0")

    val lwjglVersion = "2.9.3"
    implementation("org.lwjgl.lwjgl:lwjgl_util:${lwjglVersion}")
    implementation("org.lwjgl.lwjgl:lwjgl:${lwjglVersion}")
    runtimeOnly("org.lwjgl.lwjgl:lwjgl-platform:${lwjglVersion}")

    val log4jVersion = "2.20.0"
    implementation("org.apache.logging.log4j:log4j-core:${log4jVersion}")
    implementation("org.apache.logging.log4j:log4j-api:${log4jVersion}")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    withSourcesJar()
}
