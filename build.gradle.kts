
buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Dep.Gradle.android)
        classpath(Dep.Kotlin.gradle)
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