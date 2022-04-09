package prototype

fun main(args: Array<String>) {
    // prepare
    val manager = Manager()
    val box1 = MessageBox('*')
    val box2 = MessageBox('%')

    println("${box1.createCopy()}")
    // register
    manager.register("warning box", box1)
    manager.register("% box", box2)

    // use
    val product1 = manager.create("warning box")
    product1?.use("Hello World")

    val product2 = manager.create("% box")
    product2?.use("Hello World")
}