package net.print.kt03.second.operation


fun testNull(p: String) {

    var y = p ?: "45"
    println("y :$y")
}

fun main(args: Array<String>) {
    testNull("")

    val x = null
    val y = x?:0
    println("y : $y")


}