package net.print.kt03.four

class NestedClassDemo1 {
    class Outer {
        private val zero: Int = 0
        val one: Int = 1

        // 如果一个内部类想要访问外部类（Outer）的成员，
        // 需要在内部类前面  加上修饰符inner，
        // 内部类会带有一个外部类的对象的引用
        inner class Inner {
            fun accessOuter() {
                println("zero : $zero")
                println("one  : $one")
            }
        }
          class Inner2 {
            fun accessOuter() {
               // println("zero : $zero")
               // println("one  : $one")
            }
        }


    }
}

fun main(args: Array<String>) {
    // ps:留意二者的调用区别
    val innerClass = NestedClassDemo1.Outer().Inner()
    val innerClass2 = NestedClassDemo1.Outer.Inner2()
    innerClass.accessOuter()



}