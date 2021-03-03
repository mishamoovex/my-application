plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id ("androidx.navigation.safeargs.kotlin")
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

    buildFeatures {
        dataBinding = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    //Kotlin
    implementation (Dep.Kotlin.sdnlib)
    implementation(Dep.Kotlin.coroutines)

    //AppCompat
    implementation (Dep.AndroidX.appCompat)

    //Android Ui
    implementation (Dep.AndroidX.materialDesign)
    implementation (Dep.AndroidX.constraintLayout)

    //Lifecycle
    implementation(Dep.Jetpack.Lifecycle.liveData)
    implementation(Dep.Jetpack.Lifecycle.viewModel)
    implementation(Dep.Jetpack.Lifecycle.savedState)
    implementation(Dep.Jetpack.Lifecycle.java8Compiler)

    //Navigation
    implementation(Dep.Jetpack.Navigation.navigation)
    implementation(Dep.Jetpack.Navigation.navigationUi)

    //Room
    implementation(Dep.Jetpack.Room.room)
    implementation(Dep.Jetpack.Room.coroutines)
    kapt(Dep.Jetpack.Room.kapt)

    //Hilt
    implementation(Dep.Jetpack.Hilt.hilt)
    kapt(Dep.Jetpack.Hilt.kapt)

    //Retrofit
    implementation(Dep.Network.Retrofit.retrofit)
    implementation(Dep.Network.Retrofit.jsonConverter)


}