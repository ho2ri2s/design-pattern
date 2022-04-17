package templatemethod

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()

    fun display() {
        open()
        (0 until 5).forEach { _ ->
            print()
        }
        close()
    }
}