object Dep {

    object AppConfig {
        const val compileSdkVersion = 30
        const val buildToolsVersion = "30.0.3"
        const val applicationId = "com.mishamoovex.tesring.myapplication"
        const val minSdkVersion = 21
        const val targetSdkVersion = 30
        const val versionCode = 1
        const val versionName = "1.0"

        object BuildTypeNames {
            const val release = "release"
            const val debug = "debug"
        }
    }

    object Gradle {
        private const val version = "4.1.2"

        const val gradlePlugin = "com.android.tools.build:gradle:$version"
    }

    object Kotlin {
        private const val kotlinVersion = "1.4.21"
        const val coroutinesVersion = "1.4.3"

        const val sdnlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    object AndroidX {

        object Components{
            private const val appCompatVersion = "1.2.0"
            const val fragmentVersion = "1.3.0"
            private const val activityVersion = "1.2.0"

            const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
            const val fragment = "androidx.fragment:fragment-ktx:$fragmentVersion"
            const val activity = "androidx.activity:activity-ktx:$activityVersion"
        }

        private const val materialDesignVersion = "1.3.0"
        private const val contraintLayoutVersion = "2.0.4"


        const val materialDesign = "com.google.android.material:material:$materialDesignVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$contraintLayoutVersion"
    }


    object Jetpack {

        object Lifecycle {
            private const val version = "2.3.0"

            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"
            const val java8Compiler = "androidx.lifecycle:lifecycle-common-java8:$version"
        }

        object Navigation{
            const val version = "2.3.3"

            const val navigation = "androidx.navigation:navigation-fragment-ktx:$version"
            const val navigationUi = "androidx.navigation:navigation-ui-ktx:$version"
            const val dynamicFeature = "androidx.navigation:navigation-dynamic-features-fragment:$version"

            /**
             * This dependency requires additional plugins: "androidx.navigation.safeargs.kotlin"
             */
            object SafeArgs{
                const val gradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
            }
        }

        object Paging{
            const val paginationVersion = "3.0.0-beta01"

            const val paging = "androidx.paging:paging-runtime:$paginationVersion"
        }

        /**
         * This dependency requires additional plugins:
         *       'kotlin-kapt'
         */
        object Room{
            const val version = "2.2.6"

            const val room = "androidx.room:room-runtime:$version"
            const val coroutines = "androidx.room:room-ktx:$version"
            const val kapt = "androidx.room:room-compiler:$version"
        }

        object WorkManager{
            const val managerVersion = "2.5.0"

            const val manager = "androidx.work:work-runtime-ktx:$managerVersion"
        }

        /**
         * This dependency requires additional plugins:
         *       'kotlin-kapt'
         *       'dagger.hilt.android.plugin'
         */
        object Hilt{
            private const val hiltVersion = "2.33-beta"
            private const val hiltNavigationVersion = "1.0.0-alpha03"

            const val hilt = "com.google.dagger:hilt-android:$hiltVersion"
            const val hiltNavigation = "androidx.hilt:hilt-navigation-fragment:$hiltNavigationVersion"
            const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
            const val kapt = "com.google.dagger:hilt-compiler:$hiltVersion"
        }

    }

    object Network{

        object Retrofit{
            private const val version = "2.9.0"

            const val retrofit = "com.squareup.retrofit2:converter-gson:$version"
            const val jsonConverter = "com.squareup.retrofit2:retrofit:$version"
        }

        object HttpIntercept{

        }
    }

    /**
     * This dependency requires additional plugins:
     *       'kotlin-kapt'
     */
    object Glide{
        private const val version = "4.12.0"

        const val glide = "com.github.bumptech.glide:glide:$version"
        const val kapt = "com.github.bumptech.glide:compiler:$version"
    }
}