package net.print.kt03.four

/**
 *  可以访问外部类的变量
 *
 *  ps: 题外话 ，object 关键字的使用
 *  一：object 表达式
 *     创建匿名内部类的形式：object:ClassName{...}
 *     for example:
 *                 val  handler : Handler  = object:Handler(){
 *                   override fun handleMessage(msg:Message?){
 *                     super.handleMessage(msg)
 *                     when(msg?.what){
 *                      1->"Expression1"
 *                      2->"Expression2"
 *
 *                     }
 *
 *                   }
 *
 *                 }
 * 二：object 对象声明
 *
 *    1：直接声明对象
 *   （在java中，单例的声明可能具有多种方式：饿汉，静态内部类，枚举等。
 *    Kotlin中，单列模式的实现，只需要一个object关键字即可：）
 *
 *     for example :
 *                object SingleObject{
 *                  fun test(){
 *                   // to do sth..
 *                  }
 *                }
 *
 *    调用方式：类名.方法名()
 *    class Main()
 *    {
 *      fun test()
 *      {
 *        SingleObject.test()
 *      }
 *    }
 *
 *   2：继承自接口（抽象类）的对象声明
 *   3：类内部的对象声明
 *
 * 三： 伴生对象companion Object
 *    1:普通的伴生对象
 *     calss MyClass{
 *      companion object Factory {
 *      val url = ""
 *      fun create(): MyClass = MyClass()
 *     }
 *
 *     调用： MyClass.url
 *           MyClass.create()
 *
 *
 *    2:在伴生对象中实现接口
 *    interface Factory<T> {
 *      fun create(): T
 *      }
 *
 *      class MyClass {
 *      // 伴生类中实现接口
 *      companion object : Factory<MyClass> {
 *       val url = ""
 *       // 实现接口的抽象方法
 *          override fun create(): MyClass = MyClass()
 *          }
 *      }
 *
 *      // 调用
 *      class Main {
 *          fun test() {
 *          setFactory(MyClass) // 这里传递进去的MyClass对象，其实就是MyClass的伴生对象
 *       }
 *
 *         fun <T> setFactory(factory: Factory<T>) {
 *           factory.create()
 *          }
 *      }
 *
 *    3:伴生对象的扩展
 *    class MyClass {
 *        companion object Factory {
 *            fun create(): MyClass = MyClass()
 *        }
 *    }
 *
 *    // 伴生类的扩展
 *    fun MyClass.Factory.fun_name() = ...功能代码...
 *
 *    // 调用
 *    MyClass.Factory.fun_name()
 *    
 */
class NestedClaso2 {
    class AnonymousInnerClassDemo {
        var isRunning = false
        fun doRun() {
            //  这里使用了object关键字。
            Thread(object : Runnable {

                override fun run() {
                    isRunning = true
                    println("doRun : I am running ,isRunning = $isRunning")
                }

            }).start()
        }
    }
}



