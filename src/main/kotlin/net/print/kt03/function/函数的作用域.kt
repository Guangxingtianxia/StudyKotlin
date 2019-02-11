package net.print.kt03.function

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer


/**
 * 局部函数（嵌套函数）
 * 在kotlin 中，函数可以在文件顶层声明，这意味着你需要像一些语言，如 java，C# 或Scala 那样建一个类，来保存一个函数。此外除了顶层函数，
 * kotlin 中函数也可以在局部作用域，作为成员函数以及扩展函数。
 */
fun sum(x: Int, y: Int, z: Int): Int {
    val detal = 0
    fun add(a: Int, b: Int): Int {
        return a + b + detal

    }

    return add(x + add(add(y, z)))
}


fun main(args: Array<String>) {

    // 局部函数可以
    val result = sum(2, 3, 5)
    println("result : $result")


}

