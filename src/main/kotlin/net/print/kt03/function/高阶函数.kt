package net.print.kt03.function

// 高阶函数，是将函数作为参数或返回值的函数，例如Iterable 的filter函数

/**
 *
 *   public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
 *        return filterTo(ArrayList<T>(), predicate)
 *    }
 *
 */

fun isOdd(x: Int): Boolean {
    return x % 2 == 1
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4, 6)
    // 用:: 来引用一个函数
    val q = list.filter(::isOdd)

    println(" result of raw data : $list")
    println(" The result by using filter function : $q")


}