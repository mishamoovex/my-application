object Dep {

    object AppConfig {
        const val compileSdkVersion = 30
        const val buildToolsVersion = "30.0.3"
        const val applicationId = "com.mishamoovex.tesring.myapplication"
        const val minSdkVersion = 21
        const val targetSdkVersion = 30
        const val versionCode = 1
        const val versionName = "1.0"

        object BuildTypeNames{
            const val release  = "release"
            const val debug = "debug"
        }
    }

    object Gradle {
        private const val gradleVersion = "4.1.2"

        const val android = "com.android.tools.build:gradle:$gradleVersion"
    }

    object Kotlin {
        private const val kotlinVersion = "1.4.21"

        const val sdnlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object AndroidX{
        private const val appCompatVersion = "1.2.0"
        private const val materialDesignVersion = "1.3.0"
        private const val contraintLayoutVersion = "2.0.4"

        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val materialDesign = "com.google.android.material:material:$materialDesignVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$contraintLayoutVersion"
    }
}