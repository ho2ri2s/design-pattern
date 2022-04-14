package bridge

/**
 *
 */
class StringDisplayImpl(private val string: String) : DisplayImpl() {

    private val width = string.length

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|+$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("+")
        (0..width).forEach { _ ->
            print("-")
        }
        println("+")
    }
}