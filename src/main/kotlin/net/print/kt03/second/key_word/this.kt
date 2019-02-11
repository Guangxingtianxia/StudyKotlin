package net.print.kt03.second.key_word

/**
 * this 关键字，持有当前对象的引用，我们可以使用this来引用变量或者成员函数，
 * 也可以使用return this ，来返回某个类的引用。
 */
class ThisDemo {
  private  val thisis = "this is "
    fun whatIsThis() :ThisDemo{

        println("引用变量：${this.thisis} ")

        // 引用成员函数
        this.whatIsThis()
        // 返回此类引用
        return this
    }

    fun howIsThis()
    {
        println("HOW IS THIS ?")
    }
}




fun main(args: Array<String>) {
    val thisDemo = ThisDemo()
//    thisDemo.whatIsThis()

    println(thisDemo.howIsThis())
}