package net.print.kt03.bingshu


public class T {


}

fun main(args: Array<String>) {

    val a = Array<Int>(10) { i ->
        i + 1
    }

    a.forEach {
        println(it)
    }

    // reduce 是一个高级函数，ta的参数就是一个函数
    a.reduce { acc, x ->
        acc + x
    }.also {
        println(it)
    }

    a.reduce { iu, ir ->
        iu * ir
    }.run {
        println(this)
    }


    val b = test1(getInt1())
    println("The result of b is :" + b)

}

fun getInt1(): Int {
    return 4 - 5
}

fun test1(int1: Int): Any {
    return int1 + 5
}
