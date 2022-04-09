package adapter

fun main(args: Array<String>) {
    val print: Print = PrintBanner("Hello")
    print.printWeak()
    print.printStrong()
}