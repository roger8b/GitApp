package com.rms.gitapp.dependencies

object Versions {
    const val androidTargetSdkVersion = 29
    const val androidCompileSdkVersion = 29
    const val androidMinSdkVersion = 23
    const val androidBuildToolVersion = "29.0.3"

    private const val versionMajor = 1
    private const val versionMinor = 1
    private const val versionPatch = 0
    private const val versionOffset = 0
    const val androidVersionCode =
        ((1 + versionMajor) * 10000 + versionMinor * 100 + versionPatch) * 100 + versionOffset

    const val androidVersionName = "$versionMajor.$versionMinor.$versionPatch"
}
