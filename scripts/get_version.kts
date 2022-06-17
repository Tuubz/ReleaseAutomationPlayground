import java.io.File

object GetVersion {

    fun search(): String? {
        return File("Versions.kts")
            .readLines()
            .find { it.contains("ANDROID_VERSION_NAME") }
            ?.substringAfter("=")
            ?.replace("\"", "")
            ?.trim()
    }
}

val version = GetVersion.search()
println(version)
