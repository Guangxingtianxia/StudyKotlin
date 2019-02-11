package net.print.kt03.second

fun cases(obj: Any) {
    when (obj) {
        1 -> {
            myPrint("这是第一项")
        }
        "hello"-> myPrint(" 这是字符串hello")
        is Long -> myPrint(" 这是一个Long类型数据")
        !is String -> myPrint(" 这不是String 类型的数据")
        else -> myPrint(" else 类型java 的defualt")
    }
}

fun myPrint(s: Any) {
    println(" result : $s")
}

fun main(args: Array<String>) {

    cases(3)
    cases(300L)
    cases('d')
    cases("hello")

}
