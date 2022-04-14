package bridge.practice

import bridge.Display
import bridge.DisplayImpl
import kotlin.random.Random


class RandomDisplay(impl: DisplayImpl) : Display(impl) {

    fun randomDisplay(times: Int) {
        open()
        val realTimes = Random.nextInt(times)
        (0 until realTimes).forEach { _ ->
            print()
        }
        close()
    }
}