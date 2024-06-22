plugins {
    id("java")
    id("io.github.goooler.shadow") version "8.1.7"
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.github.ItsFelix5:Minestom-fe:b2cf292454")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}