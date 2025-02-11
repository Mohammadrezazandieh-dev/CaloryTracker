pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CaloryTrackerProject"
include(/* Modules.app*/":app")
include(":core")
include(":tracker")
include(":onboarding")
include(":onboarding:onboarding_domain")
include(":onboarding:onboarding_presentation")
include(":tracker:tracker_domain")
include(":tracker:tracker_presentation")
include(":tracker:tracker_data")
include(":core-ui")
