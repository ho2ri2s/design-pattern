package adapter

class PrintBanner(string: String) : Banner(string), Print {

    /**
     * これはクラスによるAdapterパターン
     *
     * Bannerを内部クラスに持ち、処理を委譲することもできる。
     * そのことをインスタンスのAdapterパターンという
     */
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}