package net.print.kt03.digui

import java.math.BigInteger

/**
 * 开始玩递归
 *
 * 计算阶乘
 */

fun factorail(num: Int): BigInteger {
    if (num == 0) {
        return BigInteger.valueOf(1)
    }

    return BigInteger.valueOf(num.toLong()).times(factorail(num - 1))

}

fun main(args: Array<String>) {
    println(factorail(5))
    println(factorail(1000))
}