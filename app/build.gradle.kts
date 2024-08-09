//buildscript {
//    repositories {
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath("com.android.tools.build:gradle:7.3.1")
//        classpath("com.google.gms:google-services:4.3.15")
//    }
//}
plugins {
    alias(libs.plugins.android.application)
  
    id("com.google.gms.google-services")


}

android {
    namespace = "com.example.contactsyncapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.contactsyncapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
    implementation("com.google.firebase:firebase-analytics")
    // Retrofit for network calls
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // Firebase Firestore
    implementation("com.google.firebase:firebase-firestore:24.6.0")

    // Converter for JSON to Java objects (Gson)
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
}
