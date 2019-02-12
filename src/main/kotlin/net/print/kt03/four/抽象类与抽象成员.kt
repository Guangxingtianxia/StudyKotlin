package net.print.kt03.four


/**
 * 抽象类
 */
abstract class Shape {
    abstract var width: Double
    abstract var height: Double
    abstract val radius: Double
    abstract fun area(): Double

    /**
     * 函数默认是final ,不可以被覆盖
     */
    fun finalOnClick()
    {

    }

    open fun openOnClick()
    {
        println(" this is a overrided function in abstract class.")
    }

}


// 继承类的语法是使用 冒号: ,父类需要在这里使用构造函数初始化
class Rectangle(override var width: Double, override var height: Double, override val radius: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

}

class Circle(override var width: Double, override var height: Double, override val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius

    }
}

class Triangle(override var width: Double, override var height: Double, override val radius: Double) : Shape() {
    override fun area(): Double {
        return width * height / 2
    }

    override fun openOnClick() {
        super.openOnClick()
    }
}

// ps 和C++ 貌似一样

fun main(args: Array<String>) {


    //val s =Shape() ，抽象类，不能被实例化
}
