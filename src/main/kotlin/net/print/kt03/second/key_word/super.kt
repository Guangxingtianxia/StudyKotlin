package net.print.kt03.second.key_word

//  super :持有指向其父类的引用
open class Father {
    // val --->only read.
    open val firstName = "Chen"
    open val lastName = "Jason"
    fun ff() {
        println("FFF")
    }
}


/**
 * 子类测试
 */
class Son(sonLastName: String) : Father() {
    var sonFirstName = super.firstName
    var sonLastName = super.lastName

    init {
        this.sonLastName = sonLastName
    }

    fun love() {
        super.ff()
        println("super.firstName: ${super.firstName} ,super.lastName: ${super.lastName} ," +
                "this.firstName: ${this.firstName} ,this.lastName :${this.sonLastName}")
    }

}

fun main(args: Array<String>) {
    val son = Son("jim")

    son.love()
}