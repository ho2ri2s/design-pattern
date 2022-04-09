package prototype

class MessageBox(private val decoChar: Char) : Product {

    override fun use(s: String) {
        println("$s $decoChar")
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
