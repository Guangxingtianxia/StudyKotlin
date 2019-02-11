package net.print.kt03.function

import sun.nio.cs.ext.MS50220

/**
 * lambda 表达或者匿名函数，以及局部函数和对象表达式（object declarations ）
 * 可以访问其闭包，即：在外部作用域中声明的变量。
 * 与java不同的是：可以修改闭包中捕获的变量：
 */

fun sumGTZero(c: Iterable<Int>): Int {
    var sum = 0
    c.filter { it > 0 }.forEach {
        sum += it
    }
    return sum
}

fun closureDemo() {
    // use java thread
    Thread {
        for (i in 1..10) {
            println("I = $i")
            Thread.sleep(1000)
        }
    }.start()

    Thread {
        for (j in 10..20) {
            println("J = $j")
            Thread.sleep(1000)
        }
    }.start()

}


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 54, 6, 7, 85, 5)
    // 总和结果
    val result = sumGTZero(list)
    println(" result : $result")

    // thread test (感觉cup 切割的很好. )
    closureDemo()
}

