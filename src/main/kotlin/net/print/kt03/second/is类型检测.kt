package net.print.kt03.second


/**
 * is  运算符是检测一个表达式，是否为某类型的实例
 */


fun getLength(obj: Any): Int {
    var result = 0
    if (obj is String) {

        println(obj::class)

        result = obj.length
        print(result)
    } else {
        println("出现了一个不是String类型的数据类型")


    }

    // 离开分支以后，obj 仍然是一个Any类型

    print(obj)

    return result
}

fun main(args: Array<String>) {
    val obj = "dfsfdfe4"
    getLength(obj)

    // 测试2
    val obj2 = Any()
    getLength(obj2)
}