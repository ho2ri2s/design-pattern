package templatemethod

class StringDisplay(private val string: String) : AbstractDisplay() {

    private val length: Int = string.length
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        (0 until length).forEach { _ ->
            print("-")
        }
        println("+")
    }
}