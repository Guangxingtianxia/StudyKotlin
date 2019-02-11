package net.print.kt03.function

// 就是省略花括号
// 当函数返回单个表达式时，可以省略花括号并且在= 等号之后指定代码体即可
fun double(x: Int): Int = x * 2


// 当返回值类型可由编译器推断时，显示声明返回类型是可选的：
fun double2(x: Int) = x * 2

fun main(args: Array<String>) {

    val a = double(3)

    val b = double(4)
    println("a : $a")
    println("b : $b")
}


