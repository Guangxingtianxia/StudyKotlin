package net.print.kt03.function


class Sample() {
    fun fool() {
        println(" 成员函数被调用")
    }
}


fun main(args: Array<String>) {

    // 测试成员函
    val sample = Sample()
    sample.fool()
}