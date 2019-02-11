package net.print.kt03.five

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6, 7)
    val list3 = listOf("x", "y", "z")

    val newlist1 = list1.zip(list3)
    println("newList1 :$newlist1")
     val newlist2 = list2.zip(list3)
    println("newList2 :$newlist2")


}