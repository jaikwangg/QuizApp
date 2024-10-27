pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Ensure settings are preferred
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "QuizApp"
include(":app")
 