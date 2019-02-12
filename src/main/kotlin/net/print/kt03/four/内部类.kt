package net.print.kt03.four


/**
 * koltin中，类可以嵌套。
 * 一个类，可以嵌套在其他类中，而且可以嵌套多层。
 */
class NestedClassDemo {
    class Outer {
        private val zero: Int = 0
        val one: Int = 1

        class Nested {
            fun getTwo() = 2
            class Nested1 {
                val three = 3
                fun getFour() = 4
            }

        }
    }
}

/**
 * 普通嵌套类，没有持有外部类的引用，所以是无法访问外部类的变量
 */
fun main(args: Array<String>) {
    val one = NestedClassDemo.Outer().one
    val two = NestedClassDemo.Outer.Nested().getTwo()
    val three = NestedClassDemo.Outer.Nested.Nested1().three
    val four = NestedClassDemo.Outer.Nested.Nested1().getFour()

    println("one   : $one")
    println("two   : $two")
    println("three : $three")
    println("four  : $four")

}