package net.print.kt03.function

/**
 * kotlin 提供了使用指定的接受者对象，调用函数字面值的功能
 * </p>
 * 使用匿名函数的语法，我们可以直接指定函数字面值的节后类型
 *
 */

class HTML {
    fun body() {
        println(" HTML BODY")
    }
}


// HTML.()中的HTML是接受者类型
fun html(init: HTML.() -> Unit): HTML {
    // 创建接受者对象
    val html = HTML()
    // 将该接受者对象传给该 lambda
    html.init()
    return html

}

fun main(args: Array<String>) {

    // 函数调用
    html { body() }

    val sum = fun Int.(other: Int): Int = this + other

    val testResult = 1.sum(1)
    println("testResult : $testResult")

}
