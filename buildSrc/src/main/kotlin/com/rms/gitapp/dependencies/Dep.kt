package com.rms.gitapp.dependencies

object Dep {

    private const val kotlinVer = "1.3.72"

    object GradlePlugin {
        const val gradle = "com.android.tools.build:gradle:3.6.3"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVer"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val androidJunit4Ktx = "androidx.test.ext:junit:1.1.1"
        const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val core = "androidx.core:core-ktx:1.2.0"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Kotlin {
        const val kotlinVersion = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVer"
    }

    object CodeQuality {
        const val ktlint = "com.pinterest:ktlint:0.36.0"

        object Detekt {
            const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.9.1"
            const val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting:1.2.2"
            const val detektCli = "io.gitlab.arturbosch.detekt:detekt-cli:1.9.1"
        }
    }
}
