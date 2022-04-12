package prototype

interface Product : Cloneable {
    fun use(s: String)
    fun createCopy(): Product?
}