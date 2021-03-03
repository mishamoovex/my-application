plugins {
    id("com.android.application")
    kotlin("android")
}

android {

    compileSdkVersion(Dep.AppConfig.compileSdkVersion)
    buildToolsVersion(Dep.AppConfig.buildToolsVersion)

    defaultConfig {
        applicationId(Dep.AppConfig.applicationId)
        minSdkVersion(Dep.AppConfig.minSdkVersion)
        targetSdkVersion(Dep.AppConfig.targetSdkVersion)
        versionCode(Dep.AppConfig.versionCode)
        versionName(Dep.AppConfig.versionName)
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName(Dep.AppConfig.BuildTypeNames.release){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),"proguard-rules.pro")
        }

    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (Dep.Kotlin.sdnlib)
    implementation (Dep.AndroidX.appCompat)
    implementation (Dep.AndroidX.materialDesign)
    implementation (Dep.AndroidX.constraintLayout)

}