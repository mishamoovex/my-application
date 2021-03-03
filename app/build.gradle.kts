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
    implementation (Dep.AndroidX.Components.appCompat)
    implementation (Dep.AndroidX.Components.fragment)

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

    //Espresso idling resources
    implementation(DepTest.Espresso.idlingResources)

    //---------------- Local test dependencies -------------------------------

    testImplementation(DepTest.Kotlin.coroutine)
    testImplementation(DepTest.AndroidX.core)
    testImplementation(DepTest.AndroidX.junit)
    testImplementation(DepTest.Junit.junit)
    testImplementation(DepTest.Mock.mockK)
    testImplementation(DepTest.Assertions.truth)
    testImplementation(DepTest.Jetpack.lifecycle)

    //---------------- Instrumentation test dependencies ---------------------

    androidTestImplementation(DepTest.AndroidX.core)
    androidTestImplementation(DepTest.AndroidX.junit)
    androidTestImplementation(DepTest.Junit.junit)
    androidTestImplementation(DepTest.Mock.mockK)
    androidTestImplementation(DepTest.Assertions.truth)
    androidTestImplementation(DepTest.Espresso.core)
    androidTestImplementation(DepTest.Jetpack.lifecycle)
    androidTestImplementation(DepTest.Jetpack.room)
    androidTestImplementation(DepTest.Jetpack.navigation)
    debugImplementation(DepTest.Jetpack.fragment)
}