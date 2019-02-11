package net.print.kt03.second.key_word

/*
  * 外部类
 */
class Outer {
    val oh = "Oh!"

    /**
     * 内部类
     */
    inner class Inner {

        fun m() {
            val outer = this@Outer
            val inner = Inner()
            val pthis = this
            println("outer = $outer")
            println("inner = $inner")
            println("pthis=$pthis")

            val fun1 = hello@ fun String.() {
                // fun1 是接收者
                val d1 = this
                println("d1 " + d1)
            }

            val fun2 = { s: String ->
                val d2 = this
                println("d2=" + d2)
            }

            val fun3 = tt@ fun Int.() {
                println(" maybe test 扩展函数")
            }

            // 这是什么调用方式
            "abc".fun1()
            5.fun3()


        }
    }
}


fun main(args: Array<String>) {
    val outer = Outer()
    outer.Inner().m()
}