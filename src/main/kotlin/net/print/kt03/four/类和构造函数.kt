package net.print.kt03.four

class Person(val name: String, var age: Int, var sex: String) {

    override fun toString(): String {
        return "Person(name='$name', age=$age, sex='$sex')"
    }
}

/**
 * 也可以先声明属性，等到构造实例对象时再去初始化属性值，
 */
class Animal{
    // laterinit ：关键字，表示该属性，延迟初始化
    lateinit var name :String

    // lateinit 关键字不能修饰primitive 类型
    var age :Int =0

    override fun toString(): String {
        return "Animal(name='$name', age=$age)"
    }

}


fun main(args: Array<String>) {
    val person = Person("Tom",34,"Man")
    println("person : $person")

    val animal = Animal()
    animal.age = 23
    animal.name= "small dog"

    println(" animal : $animal")
}


