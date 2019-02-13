package net.print.kt03.seven

import java.text.SimpleDateFormat
import java.util.*

object Adminuser {
    val username: String = "admin"
    val password: String = "admin"
    fun getTimeStamp() = SimpleDateFormat("yyyyMMddHHmmss").format(Date())


}

fun main(args: Array<String>) {
    val adminUser = Adminuser.username
    val adminPassword = Adminuser.password
    println(" adminUser : $adminUser")
}