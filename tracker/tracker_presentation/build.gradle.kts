plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.example.tracker_presentation"
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.coreUI))
    implementation(project(Modules.trackerDomain))

    implementation(Coil.coilCompose)
    implementation(Compose.uiToolingPreview)
    implementation(libs.androidx.runner)
    androidTestImplementation(project(":app"))
    androidTestImplementation(project(":app"))
}