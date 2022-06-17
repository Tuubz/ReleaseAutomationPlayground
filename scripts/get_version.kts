import java.io.File

object GetVersion {

    fun search() {
        val versionName = File("Versions.kts")
            .readLines()
            .find { it.contains("ANDROID_VERSION_NAME") }
            ?.substringAfter("=")
            ?.replace("\"", "")
            ?.trim()

        executeCommand("echo VERSION_NAME=$versionName >> \$GITHUB_ENV")
    }

    private fun executeCommand(command: String) {
        val process = Runtime.getRuntime().exec(command)
    }
}

GetVersion.search()
