package net.print.kt03.singleton

import javax.swing.LayoutFocusTraversalPolicy


/**
 * 单例模式，双重锁校验
 */
class LazyThreadSafeDoubleCheck private constructor() {
    companion object {
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            LazyThreadSafeDoubleCheck()
        }

        @Volatile
        private var instace2: LazyThreadSafeDoubleCheck? = null

        fun getInstance() = {
            if (instace2 == null) {
                synchronized(this)
                {
                    if (instace2 == null) {
                        instace2 = LazyThreadSafeDoubleCheck()
                    }
                }
            }

            instace2!!
        }
    }
}