package net.print.kt03.high_order_fun

fun main(args: Array<String>) {

    val list = listOf(100, -500, 300, 200)
    val reusult1 = list.minBy { it }

    println("result1 : $reusult1")
    println("==========分割线===============")

    val result2 = list.minBy { it * (1 - it) }
    println("result2 : $result2")

    println("==========分割线===============")

    // 我靠，，这个结果，我不理解。。
    val result3 = list.minBy {
        println("raw data : ${it*it}")
        it * it }
    println("result3 :$result3") // result :100


}