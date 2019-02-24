


#开始学习函数式编程：
###[学习这个项目的网址](https://segmentfault.com/a/1190000010367734#articleHeader15)

# 函数式编程：
 ###函数特征
 >* 一等函数支持（first-class function），函数也是一种数据类型，可以当做参数，传入另一个函数，同时一个函数，也可以返回函数.
 >* 纯函数(pure function)和不变性(immutable) :纯函数是指没有副作用的函数，（函数不去改变外部的数据状态）。例如，一个编译器是一个
    广义上的纯函数，在函数式编程中，倾向于使用纯函数编程，正因为纯函数不会去修改数据，同时又使用不可变数据，所以程序不会去修改一个已经
    存在的数据结构，而是根据一定的映射逻辑创建一份新的数据。函数式编程，是去转换数据，而非修改原始数据。
 >* 函数的组合（compose function) : 在面向对象编程中，是通过对象之间发送消息来构建程序逻辑； 而在函数式编程中，
    是通过不同函数的组合构建程序逻辑。
    
   ``` kotlin
     
   
// 声明函数类型
 typealias  G = (String) -> Int
 typealias  F = (Int) -> Boolean
 typealias H = (String) -> Boolean

 val h1 = fun(g: G, f: F): H {
    return { f(g(it)) }
}
   
   
   
   ```     
   
   