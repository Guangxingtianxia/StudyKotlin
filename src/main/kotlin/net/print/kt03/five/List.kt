package net.print.kt03.five



fun filterList()
{
    val list = arrayListOf<Int>(1,2,45,5,7,3,8)
    println(list.filter { it%2 ==1 })
}

fun main(args: Array<String>) {
    val list: List<Int> = listOf(2,45,789)
    println("类类型 : ${list::class}")
    filterList()

}