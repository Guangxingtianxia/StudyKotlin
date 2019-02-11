package net.print.kt03.function


/**
 * kotlin 支持尾递归。同时，还引入了map()和filter 函数，可以流畅的操作数据
 */

/**
 * 计算余弦的不动点，这是一个数学常数，它只是重复地从1.0开始调用Math.cos(),直到结果不会再改变，
 * 产生0.7390851332151607的结果，
 */
tailrec fun findFixPoint(x: Double = 1.0): Double = if (x == Math.cos(x)
) x
else
    findFixPoint(Math.cos(x))


/**
 * 传统方式的写法
 */
@Suppress("UNREACHABLE_CODE")
private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return y
        x = y

    }


}

