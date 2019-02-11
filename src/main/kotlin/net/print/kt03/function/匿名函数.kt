package net.print.kt03.function


fun isOdd2(x: Int): Boolean {
    return x % 2 == 1
}


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 47, 93, 45)
    list.filter((fun(x: Int): Boolean {
        return x % 2 == 1
    }))

    /**
     * lambda 表达式
     *  1: lambad 总是被大括号{} 括着
     *  second: 其参数（如果有的话）在->之前声明，（参数类型可以省略）
     *  3: 函数体（如果存在的话）在 ->后面
     */

    /**
     * 以上代码，可以简化：
     */
    list.filter({
        it % 2 == 1
    })


    // 使用嵌套的Lambda表达式来定义一个柯里化的sum函数
    val sum = {x:Int -> {y:Int ->x+y}}
    val b = sum(13)(4)
    println("b : $b")
}

