import java.io.File

object GetVersion {

    fun search() {
        val versionName = File("Versions.kts")
            .readLines()
            .find { it.contains("ANDROID_VERSION_NAME") }
            ?.substringAfter("=")
            ?.replace("\"", "")
            ?.trim()

        println("VERSION_NAME=$versionName >> \$GITHUB_ENV")
    }
}

GetVersion.search()
