package net.print.kt03.function

/**
 * 参数使用pascal表示法定义，即 name:type
 */
fun powerOf(number: Int, exponent: Int): Int {
    // 我操，，，真尼玛简单
    return Math.pow(number.toDouble(), exponent.toDouble()).toInt()
}

fun main(args: Array<String>) {
    val eight = powerOf(3,7)

    println("result: $eight")
}
