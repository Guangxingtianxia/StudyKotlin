package net.print.kt03.function

import java.text.Normalizer

/**
 * 命名参数
 */
fun reformat(str: String, normalizerCase: Boolean = true, upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {

    println("str : $str")

}

fun <T> aList(vararg ts:T) :List<T>
{
    val result = ArrayList<T>()
    result += ts
    return result
}

fun main(args: Array<String>) {
    reformat(str = "err")
    reformat("rrrr")

    // 测试可变参数
    val list = aList(3,6,78,34)
    println("list: $list")
}