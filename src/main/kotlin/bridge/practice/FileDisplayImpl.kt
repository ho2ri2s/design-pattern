package bridge.practice

import bridge.DisplayImpl
import java.io.FileReader

class FileDisplayImpl(private val filePath: String) : DisplayImpl() {

    private var width: Int = 0

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        val reader = FileReader(filePath)
        val lines = reader.readLines()
        width = lines.size
        lines.forEach { line ->
            println(line)
        }
        reader.close()
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("x")
        (0..width).forEach { _ ->
            print("%")
        }
        println("x")
    }
}