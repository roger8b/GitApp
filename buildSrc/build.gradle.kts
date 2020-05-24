repositories {
    mavenCentral()
    jcenter()
    google()
}

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("com.android.tools.build:gradle:3.6.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    implementation(gradleApi())
    implementation(localGroovy())
}
