package net.print.kt03.four


enum class Direction {
    // 每一个枚举常量都是一个对象，用逗号分开。
    NORTH,
    SOUTH, WEST, EAST
}

/**
 * 相比于字符串常量，使用枚举，能够实现类型安全，
 */
class CompareEnum {
    public final val name: String = "tom"
    public final val ordinal: Int = 25

}

/**
 * 每一个枚举都是枚举的实例，它们可以被实例化
 */
enum class Color(val rgb: Int) {
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FFF)
}


fun main(args: Array<String>) {
    val c = Color.GREEN
    println(" c : $c")
    println(" the value of color : ${c.rgb}")
}
