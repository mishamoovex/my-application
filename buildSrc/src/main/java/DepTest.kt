object DepTest {

    const val testRunner = "com.mishamoovex.tesring.myapplication.CustomTestRunner"

    object AndroidX{
        private const val coreVersion = "1.3.0"
        private const val junitVersion = "1.1.2"

        const val core = "androidx.test:core-ktx:$coreVersion"
        const val junit = "androidx.test.ext:junit-ktx:$junitVersion"
    }

    object Kotlin{
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Dep.Kotlin.coroutinesVersion}"
    }

    object Jetpack {
        //use debugImplementation
        const val fragment = "androidx.fragment:fragment-testing:${Dep.AndroidX.Components.fragmentVersion}"
        const val lifecycle = "androidx.arch.core:core-testing:2.1.0"
        const val navigation = "androidx.navigation:navigation-testing:${Dep.Jetpack.Navigation.version}"
        const val paging = "androidx.paging:paging-common:${Dep.Jetpack.Paging.paginationVersion}"
        const val room = "androidx.room:room-testing:${Dep.Jetpack.Room.version}"
        const val workManager = "androidx.work:work-testing:${Dep.Jetpack.WorkManager.managerVersion}"

        object Hilt{
            private const val version = "2.33-beta"

            const val hilt = "com.google.dagger:hilt-android-testing:$version"
            const val kapt = "com.google.dagger:hilt-android-compiler:$version"
        }
    }

    object Assertions {
        private const val version = "1.1.2"

        const val truth = "com.google.truth:truth:$version"
    }

    object Espresso {
        private const val version = "3.1.0"

        const val core = "androidx.test.espresso:espresso-core:$version"
        const val contrib = "androidx.test.espresso:espresso-contrib:$version"
        const val intents = "androidx.test.espresso:espresso-intents:$version"
        const val accessibility = "androidx.test.espresso:espresso-accessibility$version"
        const val web = "androidx.test.espresso:espresso-web:$version"
        const val idlingResources = "androidx.test.espresso:espresso-idling-resource:$version"
    }

    object Junit{
        private const val version = "4.13.2"

        const val junit = "junit:junit:$version"
    }

    object Mock{
        private const val version =  "1.10.6"

        const val mockK = "io.mockk:mockk:$version"
    }

}