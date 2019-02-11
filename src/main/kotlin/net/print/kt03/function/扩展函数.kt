package net.print.kt03.function

import sun.jvm.hotspot.oops.OopUtilities.charArrayToString


/**
 * 一个扩展String类的swap函数的例子：
 * 就是为了反转字符串，例如，"123"反转以后的结果就是"321"
 */
fun String.swap(start: Int, end: Int): String? {
    val charArray = this.toCharArray()
    val tmp = charArray[start]
    charArray[start] = charArray[end]
    charArray[end] = tmp
    return charArrayToString(charArray)

}

fun charArrayToString(charArray: CharArray): String? {
    var result= ""
    charArray.forEach { it-> result += it }

  return  result
}

fun main(args: Array<String>) {
    val str = "acd"
    val swapStr = str.swap(0,str.lastIndex)
    println("str.swap(0,str.lasrIndex)= $swapStr")

}