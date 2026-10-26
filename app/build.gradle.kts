plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.gabriel.beini.confereai"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.gabriel.beini.confereai"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)


    // ViewModel

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.11.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:3.0.0")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.10.2")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.60.1")
    ksp("com.google.dagger:hilt-compiler:2.60.1")

    implementation("androidx.hilt:hilt-navigation-compose:1.4.0")


    // GSOn

    implementation("com.squareup.retrofit2:converter-gson:3.0.0")

    implementation("com.squareup.okhttp3:logging-interceptor:5.5.1")


    implementation("androidx.compose.material:material-icons-extended")

    // Datastore

    implementation("androidx.datastore:datastore-preferences:1.3.0")

    implementation("androidx.compose.ui:ui-text-google-fonts:1.12.1")
}