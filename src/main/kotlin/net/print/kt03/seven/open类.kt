package net.print.kt03.seven

/**
 * 除了，抽象类，接口，可以被继承（实现）外，将一个类声明为open的，这样，我们就可以继承这个open类
 */

open class Base {

    open fun baseFun(p: String) {

    }


}

/**
 * 子类
 */
class subClass : Base() {
    override fun baseFun(p: String) {
        super.baseFun(p)
    }

}
