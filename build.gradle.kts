
buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Dep.Gradle.gradlePlugin)
        classpath(Dep.Kotlin.gradlePlugin)
        classpath(Dep.Jetpack.Navigation.SafeArgs.gradlePlugin)
        classpath(Dep.Jetpack.Hilt.gradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}