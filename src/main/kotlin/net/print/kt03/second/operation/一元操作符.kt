package net.print.kt03.second.operation


/**
 * <p>
 *   +a ====> a.unaryPlus()
 *   -a ====> a.unaryMInus()
 *   !a ====> a.not()
 * </p>
 *
 *   例如，当编译器处理表达式+a,它将执行以下步骤：
 *       1： 确定a的类型，令其为T
 *       2：为接收者T查找一个带有operator 修饰符的无参函数unaryPlus(),即成员函数或扩展函数。
 *       3：如果函数不存在或不明确，则导致编译错误。
 *       4：如果函数存在且返回类型为R，那就表达式+a 具有类型R
 *
 *       ps : 我去，有C++ 操作符重载的感觉啊！
 *
 *
 */

data class Point(val x: Int, val y: Int) {}

operator fun Point.unaryMinus() = Point(-x, -y)

fun main(args: Array<String>) {
    val p = Point(1,1)
    val np = -p
    println(np)
}