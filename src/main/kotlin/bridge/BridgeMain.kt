package bridge

fun main(args: Array<String>) {
    val d1: Display = Display(StringDisplayImpl("Display - Display"))
    val d2: Display = CountDisplay(StringDisplayImpl("Display - Count Display"))
    val d3: CountDisplay = CountDisplay(StringDisplayImpl("Count Display - Count Display"))
    d1.display()
    d2.display()
    d3.multiDisplay(5)
}