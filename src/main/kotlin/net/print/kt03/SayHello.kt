package net.print.kt03

enum class Lang(val hello: String) {
    ENGLISH(" this is english hello"),
    CHINESE("你好"),
    JAPANESE("好你急哇"),
    KOREAN("这是韩语");

    fun syHello() {
        println(hello)
    }

    // 构造函数
    init {

    }

    // =静态函数，伴生对象，类似java的静态函数
    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }


}


fun main(args: Array<String>) {

    if (args.size == 0) {
        return
    }

    val lang = Lang.parse(args[0])

    println("$lang")

   // lang.syHello()

    lang.sayBye()
}

/**
 * 扩展函数，这个函数直接属于这个类的，但是我觉得，这和java的静态函数是一样的，
 */
fun Lang.sayBye() {
    println("这是一个扩展函数。")

    // when 类似java 的switch，但是when是有返回值的。
    val byte = when (this) {
        Lang.ENGLISH -> tt("english")
        Lang.CHINESE -> tt("chinese")
        Lang.JAPANESE -> tt("janpanese")
        Lang.KOREAN -> tt("korean")

    }


    val a = if(2>1) 45 else 56



    print("a:"+a)
    print("在扩展函数里使用:"+byte)

}

fun tt(name: String): String {
   // return "这是要返回的内容：佳佳。"
    return name
}


