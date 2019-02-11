package net.print.kt03.singleton

/**
 * 懒加载
 */
class LazyNoThreadSafe {
    companion object {
        val instnce by lazy(LazyThreadSafetyMode.NONE) {
            LazyNoThreadSafe()
        }

        var instace2: LazyNoThreadSafe? = null

        // 线程安全
        @Synchronized
        fun getInstnce() =
                {
                    if (instace2 == null) {
                        instace2 = LazyNoThreadSafe()
                    }

                    instace2!!
                }
    }


}