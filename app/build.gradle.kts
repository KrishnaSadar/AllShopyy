plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.allshoppy"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.allshoppy"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        resConfigs("en", "xxhdpi")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
buildFeatures{
    viewBinding=true
}
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources=true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")
    implementation("com.makeramen:roundedimageview:2.3.0")
    implementation("com.github.mancj:MaterialSearchBar:0.8.5")
    implementation("com.google.android.material:material:1.12.0")
    implementation("me.relex:circleindicator:2.1.6")
    implementation("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0")




}