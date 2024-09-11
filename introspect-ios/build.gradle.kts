plugins {
    kotlin("jvm")
    application
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

kotlin {
    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("util-klib"))
        implementation(kotlin("stdlib-jdk8"))
        implementation(kotlin("native-library-reader"))
    }
}

application {
    mainClassName = "dev.inkremental.meta.introspect.ios.MainKt"
}

gradlePlugin {
    plugins {
        register("introspect-ios") {
            id = "dev.inkremental.introspect-ios"
            implementationClass = "dev.inkremental.meta.gradle.InkrementalModulePlugin"
        }
    }
}

