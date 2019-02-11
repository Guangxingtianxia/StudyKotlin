package net.print.kt03.function


/**
 * 使用中缀表示法调用
 *  1：成员函数，剧哦扩展函数
 *  second：只有一个参数
 *  3：用infix 关键字标注
 *
 *  ...............................
 *  用中缀表示法调用扩展函数
 *  1 shl second
 *  等同于这样
 *  1.sh(second)
 */

infix fun Int.shl(x:Int): Int{
    return 0
}

