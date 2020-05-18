package dependencies

object Dep {

    private const val kotlinVer = "1.3.72"

    object GradlePlugin {
        val gradle = "com.android.tools.build:gradle:3.6.3"
        val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVer"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val androidJunit4Ktx = "androidx.test.ext:junit:1.1.1"
        val espresso = "androidx.test.espresso:espresso-core:3.2.0"

    }

    object AndroidX {
        val appcompat = "androidx.appcompat:appcompat:1.1.0"
        val core = "androidx.core:core-ktx:1.2.0"
        val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"

    }

    object Kotlin {
        val kotlinVersion = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVer"
    }

    object Dagger {

    }

    object Ktor {

    }

    object OkHttp {

    }
}
