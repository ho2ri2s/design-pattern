package bridge

/**
 * 実装階層のトップ
 */
abstract class DisplayImpl {
    abstract fun rawOpen()
    abstract fun rawPrint()
    abstract fun rawClose()
}