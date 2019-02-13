package net.print.kt03.seven

/**
 * 一个类的伴生对象默认引用是companion
 */
class ClassB {
    companion object {
        fun create(): ClassB = ClassB()
        fun get() = "Hi,I am companyB."
    }

    fun test() {
        println(" test fun")
    }
}

fun main(args: Array<String>) {
    val result = ClassB.get()
    println("result : $result")
}