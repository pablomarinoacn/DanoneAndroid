plugins {
    id(libs.plugins.java.library.get().pluginId)
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

dependencies {

    api(project(":domain"))

    implementation(platform(libs.koin.bom))
    implementation(libs.koin.core)

    testImplementation(libs.junit)
}