package net.print.kt03.high_order_fun


class Test {

    fun myPrintln(any: Any) {

        println("自己定义的print函数：$any")
    }
}

/**
 * 1：包级函数，作为高阶函数的参数的时候，直接按照参数，返回值，来判断是否合适？
 * 2：类的成员函数，（带有Receive的函数）作为高阶函数的参数的时候，需要用实例来进行引用。
 * 3：扩展方法作为高阶函数的参数的时候，组要注意的是扩展方法有一个默认参数就是，实例本身。
 */

/**
 * 常用的高阶函数:
 * 1:forEach()
 * 2:map()     :集合的映射
 * 3:flatMao() :扁平化集合
 * 3:reduce()  :阶乘
 * 4:fold()    :求和
 * 5:filter()  :过滤
 * 6:kakeWhile() :含有条件的遍历
 * 7:let()
 * 8:apply()
 * 9:with()
 * 10:use()
 * 11:闭包
 * 12:函数复合，类似数学中的f(g(x) 或者g(f(x))
 *    需要结合中缀表达式，FunctionN(扩展函数)的使用
 * 13:柯里化
 * 14:偏函数
 *
 */

fun main(args: Array<String>) {

    // 包级函数可以直接通过引用的方式来引用
    args.forEach(::println)

    // 带有Receiver的引用，第一个参数，可以是实例
    val t = Test()
    args.forEach(t::myPrintln)

    val tag = "=======华丽的分割线======"
    println(tag)
    // test forEach
    forEachDemo()

    println(tag)
    mapDemo()

    println(tag)
    flatMapDemo()

    println(tag)
    reduceDemo1()

    println(tag)
    reduceDemo2()

    println(tag)
    foldDemo1()

    println(tag)
    foldDemo2()

    println(tag)
    filterDemo1()

    println(tag)
    filterDemo2()

    println(tag)
    takeWhileDemo()



}

/**
 * 通常是带有条件的循环遍历,takeWhile() 是从头遍历
 * takeLastWhile() 是从尾部开始遍历
 */
fun takeWhileDemo() {
    val oldList = listOf(3,46,6,675,4)

    val newList = oldList.takeWhile {
        it!=6
    }

    println("result of takeWhile Demo: $newList")

}

fun filterDemo1() {
    val oldList = listOf(2,45,6,4,6,3,7,35)
    val newList = oldList.filter {
        it==2||it==35
    }
    println("the result of filterDemo1: $newList")

}

/**
 * 含有index的过滤
 */
fun filterDemo2() {
    val oldList = listOf(2,45,6,4,6,3,7,35)

    val newList = oldList.filterIndexed { index, i ->
        println("index :$index")
        index==1
    }

    println("the result of filterDemo2: $newList")

}

/**
 * fold 不同于map，对初始值没有严格限制，因此还可以进行变换，
 */
fun foldDemo2() {
    val res1 =(1..5).fold(StringBuffer()){
        acc, i -> acc.append(i).append(",")

    }

    println("the result one of foldDemo2 $res1")

    // at the same same, time you cam aslo do like this:
    val res2 = (1..5).joinToString (",")
    println("the result two of foldDemo2 $res2")


}

/**
 * 求和之前，加一个初始值，
 *
 */
fun foldDemo1() {
    val sum = (1..5).fold(5){acc,i->acc+i}
    println("flod result : $sum")

}

/**
 * 求阶乘
 */
fun reduceDemo2() {
    fun factorial(n: Int): Int {

        if (n == 0) {
            return 1
        }
        return (1..n).reduce { acc, i -> acc * i }

    }
    val res = (1..5).map(::factorial)

    println("阶乘结果: $res")

}

fun reduceDemo1() {
    println("求和")
    val oldList = listOf(1, 45, 3, 7, 3, 7, 3)
    //  Lambda表达式返回值是最新的acc，是上一轮acc的值和当前元素相加的结果
    val sum = oldList.reduce { acc, i -> acc + i }

    println("the sum result:$sum")

}

/**
 * 合并两个集合，可以在合并的时候对迭代元素值it多想要的操作；

 */
fun flatMapDemo() {
    println("扁平化集合")
    val list = listOf(1..2, 2..5, 3..4)

    val size = list.size
    println("size : +$size")

    list.forEach { println("the result of raw data :+$it") }

    val newList3 = list.flatMap { it }

    newList3.forEach { println("the result of flatMap :+$it") }

    print("扁平化集合+变换")
    val newList4 = list.flatMap {
        it.map { "NO.$it" }
    }

    newList4.forEach(::println)

}

fun mapDemo() {

    val oldList = listOf(1, 3, 4, 6, 27, 8)
    val newList = ArrayList<Int>()
    println("集合映射，传统写法：")
    oldList.forEach {
        val newElement = it * 2 * 3
        newList.add(newElement)
    }

    println("集合映射，kotlin写法，使用map")
    val newList1 = oldList.map {
        it * 2 * 3
    }
    // 我靠，有点像rxjava 的map()操作符

    // 数据类型的转换(感觉是静态调用)
    val newList2 = oldList.map(Int::toDouble)


}



/**
 *  forEach()
 */
fun forEachDemo() {
    val list = listOf(21, 4, 6, 3, 6, 3, 7)
    list.forEach(::println)
}





