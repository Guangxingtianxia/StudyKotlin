package net.print.kt03.high_order_fun.xingzhou


/**
 * 1:高阶函数，直接双冒号方式，引用的是包级别的函数
 */
fun main(args: Array<String>) {
    val list = listOf(4, 6, 83, 7, 3)
    list.forEach(::println)

    println("---分割线-----------")
    val display: (MyInt) -> Unit = MyInt::show

    val b = MyInt::show
    println("the value of diaplay: $display")
    println("---分割线-----------")

    val arr = intArrayOf(3,46,7,4,7)
    val myLogger = MyLogger("TAG: ")
    arr.forEach(myLogger::print)

}


/**
 * 类名，双冒号函数名的 方式，引用的方法通常要包含自己的实例作为第一个参数，比如扩展方法函数
 *
 */

class MyInt(val value: Int) {
    fun show() {
        println(value)
    }
}

/**
 * 实例双冒号和方法名
 */
class MyLogger(val tag: String) {
    fun print(value: Int) {
        println(" $tag $value")
    }
}
