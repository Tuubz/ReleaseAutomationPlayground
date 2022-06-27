import java.io.File

object GetVersion {

    fun search(args: Array<String>): String? {
        val commitMessage = args.first()
        return commitMessage + "TUUBZ"
    }
}

val version = GetVersion.search(args)
println(version)
