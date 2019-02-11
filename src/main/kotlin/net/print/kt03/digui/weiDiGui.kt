package net.print.kt03.digui

import java.math.BigInteger


/**
 * 开始玩 尾递归
 *
 * 尾递归优化，在调用的时候，做成迭代的形式就可以了。
 */
class Result(var value: BigInteger = BigInteger.valueOf(1L))


tailrec fun factorail1(num: Int, result: Result) {
    if (num == 0) {
        result.value = result.value.times(BigInteger.valueOf(1L))
    } else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorail1(num - 1, result)
    }

}

fun main(args: Array<String>) {

    val result = Result()
    factorail1(1, result)
    println("result1:" + result.value)

    factorail1(100000, result)
    print("result2:" + result.value)


}