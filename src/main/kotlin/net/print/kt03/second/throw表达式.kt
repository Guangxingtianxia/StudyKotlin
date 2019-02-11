package net.print.kt03.second

import java.lang.Exception

/**
 * 在kotlin中throw是表达式，它的类型是特殊类型Nothing 。
 * 该类型，没有值，跟c,java中的void 意思一样。
 */
fun main(args: Array<String>) {
    val ex = throw Exception("你在南方还好吗？")

}