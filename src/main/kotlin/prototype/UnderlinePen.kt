package prototype

class UnderlinePen(private val char: Char): Product {
    override fun use(s: String) {
        println(this.javaClass.simpleName + s + char)
    }

    override fun createCopy(): Product? {
        return try {
            clone() as? Product
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
            null
        }
    }
}