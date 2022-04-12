package adapter.practice

import java.io.IOException

fun main(args: Array<String>) {
    val fileIO = FileProperties()
    runCatching {
        with(fileIO) {
            readFromFile("/Users/ho2ri/IdeaProjects/design-pettern/src/main/kotlin/adapter/practice/file.txt")
            setValue("width", "1024")
            setValue("height", "512")
            setValue("depth", "32")
            writeToFile("/Users/ho2ri/IdeaProjects/design-pettern/src/main/kotlin/adapter/practice/newFile.txt")
        }
    }.onFailure { e ->
        if (e is IOException) {
            e.printStackTrace()
        }
    }
}