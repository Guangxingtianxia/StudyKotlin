package net.print.kt03.singleton


/**
 * 静态内部类的方式来写一个单例模式
 */
class LazyThreadSafeStaticInnerObject private constructor() {
    companion object {
        fun getInstance() = Holder.instance
    }

    private object Holder {
        val instance = LazyThreadSafeStaticInnerObject()
    }

}