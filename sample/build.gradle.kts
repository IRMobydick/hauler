import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(ProjectSettings.targetSdk)

    defaultConfig {
        applicationId = "com.thefuntasty.hauler"
        minSdkVersion(ProjectSettings.minSdk)
        targetSdkVersion(ProjectSettings.targetSdk)
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(project(":library"))
    implementation(project(":databinding"))

    // Kotlin
    implementation(kotlin(Deps.Kotlin.stdlib, KotlinCompilerVersion.VERSION))
    implementation(Deps.AndroidX.appcompat)
}
