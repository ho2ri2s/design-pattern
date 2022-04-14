package bridge

/**
 * 機能階層
 */

class CountDisplay(impl: DisplayImpl) : Display(impl) {

    fun multiDisplay(times: Int) {
        open()
        (0 until times).forEach { _ ->
            print()
        }
        close()
    }
}