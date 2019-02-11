package net.print.kt03.bingshu

fun main(args: Array<String>) {

    //  test的参数是一个整型值，里面包了getInt()，不代表它的参数是函数。
    //  参数是函数的意思是函数可以像一个普通的数值一样当作另一个函数的参数
    //val a = test(getInt())
   // println("The result of a is : " + a)


    println(test(::getInt))
}

//fun getInt(): Int {
//    return 4 - 5
//}
//
//fun test(int1: Int): Any {
//    return int1 + 5
//}


fun getInt(): Int = 4 - 5

fun test(f: () -> Int): Any = f() + 5

