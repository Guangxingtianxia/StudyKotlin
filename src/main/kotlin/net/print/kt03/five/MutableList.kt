package net.print.kt03.five

import javax.xml.transform.Source

// 创建可变集合MutableList
fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    println("print list: $list ")
    /**
     * list :class java.util.ArrayList
     * 实际上调用的是 java.util.ArrayList 类的相关方法
     *
     */
    println("list :${list::class}")

    // 将不可变，转换为可变
    val list2 = mutableListOf<Int>(1, 2, 5, 3)
    val mList2 = list2.toMutableList()

    val mIterator = mList2.iterator()
    println(" mIterator : $mIterator")
    val isHasNext = mIterator.hasNext()

    println(" isHasNext :$isHasNext")

    val nextValue = mIterator.next()
    println("nextValue : $nextValue")


}