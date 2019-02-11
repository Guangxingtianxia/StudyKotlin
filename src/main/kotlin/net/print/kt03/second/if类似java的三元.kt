package net.print.kt03.second


fun testIf(judge: Boolean): Int {

    return if (judge) 1 else 0
}

fun main(args: Array<String>) {
    val result  = testIf(false)
    println("result :$result" )
}