package net.print.kt03.second
/**
 * 在kotlin中任何表达式，可以用标签来标记。
 * 标签的格式为标识符后跟@ 符号，for example:abc@,jarOfLove@,jiajia@ 都是有效的标签。
 * 我们可以用Label 标签来控制return ,break,或coutinue的跳转(jump) 行为。
 *
 */
fun returnDemo3() {
    println("START " + ::returnDemo3.name)
    // native lib function
    val intArray = intArrayOf(1, 2, 4, 6, 77, 4)
    intArray.forEach here@{
        if (it == 3) {
            //指令跳转到lambda 表达式标签here@处，继续下一个it =4的遍历循环
            return@here
        }

       println(it)
    }
    println("END " + ::returnDemo3.name)
}


fun brekDemo_1()
{
    println("--breakDemo--------------")
    for (outer in 1..5)
    {
        println("outer $outer")

        for (inner in 1..10)
        {
            println("inner $inner")
            if (inner%2==0) {
                break
            }
        }
    }
}


fun main(args: Array<String>) {
    returnDemo3()
    brekDemo_1()


}