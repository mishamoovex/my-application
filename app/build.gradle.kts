plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id ("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
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
        testInstrumentationRunner(DepTest.testRunner)
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

    sourceSets {
        val sharedTestDir = "src\\testShared\\java"
        getByName("test") {
            java {
                srcDir(sharedTestDir)
            }
        }

        getByName("androidTest"){
            java {
                srcDir(sharedTestDir)
            }
        }
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
    testImplementation(DepTest.Assertions.truth)
    testImplementation(DepTest.Jetpack.lifecycle)
    testImplementation(DepTest.Jetpack.Hilt.hilt)
    kaptTest(DepTest.Jetpack.Hilt.kapt)

    //---------------- Instrumentation test dependencies ---------------------

    androidTestImplementation(DepTest.AndroidX.core)
    androidTestImplementation(DepTest.AndroidX.junit)
    androidTestImplementation(DepTest.Junit.junit)
    androidTestImplementation(DepTest.Assertions.truth)
    androidTestImplementation(DepTest.Espresso.core)
    androidTestImplementation(DepTest.Jetpack.lifecycle)
    androidTestImplementation(DepTest.Jetpack.room)
    androidTestImplementation(DepTest.Jetpack.navigation)
    androidTestImplementation(DepTest.Jetpack.Hilt.hilt)
    kaptAndroidTest(DepTest.Jetpack.Hilt.kapt)
    debugImplementation(DepTest.Jetpack.fragment)

}