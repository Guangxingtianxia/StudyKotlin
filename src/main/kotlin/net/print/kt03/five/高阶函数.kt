package net.print.kt03.five


// 过滤字符串长度没事技术的列表，
// 拆成2个函数来实现
// 判断输入的Int是否是奇数
val f = fun(x: Int) = x % 2 == 1

// 判断输入的字符串的长度
val g = fun(s: String) = s.length


// 用函数h来封装" 字符串元素的长度是奇数"这个逻辑，实现代码如下
val h = fun(g: (String) -> Int,f:(Int)->Boolean ):(String) ->Boolean{

    return {f(g(it))}
}

// 使用别名 (类似 C++:typedef)\
typealias  G = (String)->Int
typealias F = (Int)->Boolean
typealias H = (String)->Boolean


// 优雅的写法
val h1 = fun(g:G ,f:F) :H{
    return {f(g(it))}
}



fun main(args: Array<String>) {
    val strList = listOf("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg")

    println(strList.filter(h1(g,f)))


}
