package net.print.kt03.seven

/**
 * 一个类之所以设计成sealed,就是为了限制类的继承结构，将一个值限制在有限集中的类型中，而不能有其他任意类型
 */

sealed class Expression

class Unit : Expression()

data class Const(val number: Double) : Expression()
data class Sum(val e1: Expression, val e2: Expression) : Expression()
data class Multiply(val e1: Expression, val e2: Expression) : Expression()
// A constant holding the "not a number" value of Double.
object NaN : Expression()

/**
 * 使用密封类的主要场景是在使用when表达式的时候，能够验证语句覆盖了所有的情况，而无需再添加一个else子句
 */
fun eval(expr: Expression): Double = when (expr) {
    is Unit -> 1.0
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is Multiply -> eval(expr.e1) * eval(expr.e2)
    NaN -> Double.NaN
}


fun main(args: Array<String>) {
    val u = eval(Unit())


    println(" u: $u")

}