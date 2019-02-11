package net.print.kt03.second.extensions


val <T> List<T>.lastIndex: Int get() = size - 1

fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}


fun main(args: Array<String>) {
    val p = "佳佳"
    var  judgeResult1 = p.notEmpty()
    println("judgeResult1 : $judgeResult1")
    val p2 = null
    var   judgeResult2 = p2?.notEmpty()
    println("judgeResult2 : $judgeResult2")

}

