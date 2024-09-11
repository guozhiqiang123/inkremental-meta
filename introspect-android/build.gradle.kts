plugins {
    kotlin("jvm")
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

kotlin {
    dependencies {
        api(project(":model"))
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
        testImplementation(kotlin("stdlib-jdk8"))

        implementation("androidx.annotation:annotation:1.1.0")
        implementation("org.ow2.asm:asm:7.2")
        implementation("org.ow2.asm:asm-tree:7.2")
    }
}

gradlePlugin {
    plugins {
        register("introspect-android") {
            id = "dev.inkremental.introspect-android"
            implementationClass = "dev.inkremental.meta.gradle.InkrementalModulePlugin"
        }
    }
}
