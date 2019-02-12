package net.print.kt03.four

data class LoginUser(val name:String,val pwd:String)

/**
 * 反编译以后，
 *  编译器会从主构造函数中声明的属性，自动创建以下函数：
 *  --> equal()/hashCode()
 *  --> toString()
 *  --> component1() ,component2() .. 函数返回对应下标的属性值，按声明顺序排列
 *  --> copy()函数，根据旧对象属性，重新new LoginUser(name,pwd) 一个对象出来
 *
 *  数据类，有如下限制：
 *  --> 主要构造函数，至少包含一个参数
 *  --> 参数必须标识为val 或者var
 *  --> 不能为abstract,open ,sealed,或者inner
 *  --> 不能继承其他类（但是可以实现接口）
 *
 */

fun main(args: Array<String>) {
    val loginUser = LoginUser("admin","123456")
    // 数据类，可以在解构声明中使用
    val (name,pwd) = loginUser
    println(" name: $name pwd: $pwd")

}

