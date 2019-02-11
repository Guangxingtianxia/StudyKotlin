package net.print.kt03.function


/*
 * 8.second.11
 * 如果函数字面值是一个参数，那么它的声明可以省略（连同->） 其名称 是it
 */
fun main(args: Array<String>) {
    val list = listOf(2, 5, 6, 8, 4)

    // 不会修改原有数据，返回的是新数据集合，与C++,Java 都是不一样的。
    val a = list.map { it * 2 }
    val b = list.map { i -> i * 2 }

    println(" result raw : $list")
    println(" result a   : $a")
    println(" result b   : $b")
}