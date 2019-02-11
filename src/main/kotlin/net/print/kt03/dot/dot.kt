package net.print.kt03.dot

import org.jetbrains.annotations.TestOnly


// 调用函数使用点表示法
object FPBasics {
    fun double(x: Int): Int {
        return 2 * x
    }

    fun test() {
        val doubleTwo = double(2)
        print("double(second)=$doubleTwo")
    }
}


fun main(args: Array<String>) {
    FPBasics.test()

}
