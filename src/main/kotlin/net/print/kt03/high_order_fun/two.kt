package net.print.kt03.high_order_fun

import java.io.BufferedReader
import java.io.FileReader


data class Person(val name: String, val age: Int) {

    fun work() {
        println("$name is working.")
    }
}

fun findPerson(): Person? {

    return null
}

fun main(args: Array<String>) {

    val p = findPerson()
    // 通常，调用时引用加上"?"，使得代码更加强健
    println(p?.age)
    println(p?.name)

    // 使用let之后，只需要在外层写一个?就可以啦
    p?.let {
        println(it.name)
        println(it.age)
    }

    // 使用apply 之后，只在外层写一个就可以啦，
    // 并且可以直接使用类的成员(我去，这个操作，真尼玛直接，真像java的反射)
    p?.apply {
        println(name)
        println(age)
        work()
    }

    // with()
    with(BufferedReader(FileReader("test.txt")))
    {
        var line: String?
        while (true) {
            line = readLine() ?: break
            println(line)
        }

        // io
        close()
    }

    // use()
    BufferedReader(FileReader("test.txt")).use {
        var line: String?
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }


}