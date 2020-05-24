package com.rms.gitapp.plugin.appcommon

import com.android.build.gradle.BaseExtension
import com.rms.gitapp.dependencies.Versions
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

private typealias AndroidBaseExtension = BaseExtension

class AppCommon : Plugin<Project> {
    override fun apply(project: Project) {
        val appPluExtension: AppCommonExtension =
            project.extensions.create("appCommon", AppCommonExtension::class.java)
        project.configurePlugins()
        project.configureAndroid(appPluExtension)
    }
}

internal fun Project.configurePlugins() {
    plugins.apply("com.android.application")
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-android-extensions")
}

// TODO Bug applicationId bug Error running 'app': Unable to obtain application id
internal fun Project.configureAndroid(extension: AppCommonExtension) =
    this.extensions.getByType<AndroidBaseExtension>().run {
        compileSdkVersion(Versions.androidCompileSdkVersion)
        buildToolsVersion(Versions.androidBuildToolVersion)

        defaultConfig {
            // applicationId = extension.packageName
            minSdkVersion(Versions.androidMinSdkVersion)
            targetSdkVersion(Versions.androidTargetSdkVersion)
            versionCode = Versions.androidVersionCode
            versionName = Versions.androidVersionName
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            }

            getByName("debug") {
                isTestCoverageEnabled = true
            }
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }

open class AppCommonExtension {

    var packageName: String = ""
}
