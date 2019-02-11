package net.print.kt03.function

import javax.swing.tree.TreeNode


/**
 * 我没有明白这用法。
 */
fun <T> TreeNode.findParentOfTree(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

// 使用 reified 修饰符来限定类型参数，现在可以在函数内部访问它了，
// 几乎就像是一个普通的类一样。由于函数是内联的，不需要反射，正常的操作符如 !is 和 as 现在都能用了。

inline fun <reified T> membersOf() = T::class.members

fun main(args: Array<String>) {
    println(membersOf<StringBuilder>().joinToString("\n"))
}