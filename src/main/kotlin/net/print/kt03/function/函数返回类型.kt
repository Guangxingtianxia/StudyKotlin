package net.print.kt03.function


fun printHello(name: String?): Unit {

    if (name != null) {
        print("Hello $name")

    } else {
        print("Hello there!")
    }
}


fun main(args: Array<String>) {
    printHello(" 佳佳")
}

