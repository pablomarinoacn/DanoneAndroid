plugins {
    id(libs.plugins.java.library.get().pluginId)
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation(platform(libs.koin.bom))
    implementation(libs.koin.core)
    testImplementation(libs.junit)
}