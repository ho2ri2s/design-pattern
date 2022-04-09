package prototype

/**
 * Productを実装しているクラスであれば任意のクラスに対して振舞うことができる。
 * 疎結合となっている
 */
class Manager {
    private val showcase: Map<String, Product> = hashMapOf()

    fun register(name: String, product: Product) {
        showcase.plus(name to product)
    }

   fun create(prototypeName: String): Product? {
       val product = showcase[prototypeName]
       return product?.createCopy()
   }
}