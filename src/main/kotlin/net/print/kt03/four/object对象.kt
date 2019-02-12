package net.print.kt03.four

// kotlin 没有静态属性和方法，但是可以用关键字object声明一个object单例对象
object User {
    val userName: String = "admin"
    val password: String = "admin"
    fun hello() {
        println("Hello,object !")
    }
}

fun main(args: Array<String>) {
    val name = User.userName
    val pwd = User.password
    println("name : $name ,pwd : $pwd")

    User.hello()
}