package net.print.kt03


// Unit 是一个空类型
fun main(args: Array<String>): Unit {
    // map 迭代
    args.map {
        println(it)
    }




    for (arg in args) {
        println("arg :" + arg)
    }

    args.map(::print)

}