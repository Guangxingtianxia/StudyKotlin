package net.print.kt03.four


/**
 * this,指向当前类对象实例
 */
class cat {
    lateinit var name: String
    var age: Int = 3
    lateinit var sex: String

    constructor()
    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, sex: String) {
        this.name = name
        this.age = age
        this.sex = sex
    }


}