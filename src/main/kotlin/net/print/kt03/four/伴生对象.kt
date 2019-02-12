package net.print.kt03.four

/**
 * kotlin ,还提供了伴生对象，用 companion object 关键字声明。
 * ps:注意一个类 只能有一个伴生对象
 */
class DataProcessor {
    companion object {
        fun process() {
            println("I am processing data...")
        }
    }
}

fun main(args: Array<String>) {
    DataProcessor.process()
}