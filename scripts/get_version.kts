import java.io.File

object GetVersion {

    private const val PATTERN_VERSION = "[0-9].[0-9].[0-9]"

    fun search(commitMessage: String): String? {
        return commitMessage
    }
}

val version = GetVersion.search(
    commitMessage = args.first()
)
println(version)
