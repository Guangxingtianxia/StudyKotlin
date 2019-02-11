package net.print.o3

import net.print.kt03.User

object HelloJava {
    @JvmStatic
    fun main(args: Array<String>) {
        val (rawId, rawName) = User(1, "小李")

        println("rawId   :" + rawId)
        println("rawName :" + rawName)

    }
}
