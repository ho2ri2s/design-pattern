package templatemethod

fun main(args: Array<String>) {
    val d1: AbstractDisplay = CharDisplay('H')
    val d2: AbstractDisplay = StringDisplay("Hello, world.")

    d1.display()
    d2.display()
}