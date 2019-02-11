package net.print.kt03.function


fun main(args: Array<String>) {

    // 将函数变为一个变量
    val print = fun(x:Any) { println(x)}

    listOf(1,2,3,46).forEach(print)
}