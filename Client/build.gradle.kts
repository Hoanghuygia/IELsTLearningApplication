


// Top-level build file where you can add configuration options common to all sub-projects/modules.
//
//buildscript {
//    repositories {
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        // Đổi phiên bản AGP về 8.6.0
//        classpath("com.android.tools.build:gradle:8.7.3")
//
//
//    }
//}

//plugins {
//    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.kotlin.android) apply false
//    alias(libs.plugins.kotlin.compose) apply false
//    id("com.google.dagger.hilt.android") version "2.51.1" apply false
//}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}
