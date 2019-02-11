package net.print.kt03.function


// 使用open关键字，表示，这个类可以被继承
open class DefaultParamBase {
    open fun add(x: Int = 0, y: Int = 0): Int {
        return x + y
    }
}

class DefaultParam : DefaultParamBase() {

    // why ？ 子类不能有默认值
    override fun add(x: Int, y: Int): Int {
        return super.add(x, y)
    }
}


/**
 * 函数的参数可以有默认值，当省略相应的参数时，使用默认value，减少重载的数量（这可能是一个面试题）
 */
fun add(x: Int = 0, y: Int = 0): Int {

    return x + y
}

fun main(args: Array<String>) {
    // start to test code

    val zero = add()
    val one = add(1)
    val two = add(1, 1)

    println("zero: $zero")
    println("one : $one")
    println("two : $two")

}

