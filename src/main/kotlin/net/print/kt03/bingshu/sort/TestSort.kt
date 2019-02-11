package net.print.kt03.bingshu.sort

fun main(args: Array<String>) {

    val personList: MutableList<Person> = mutableListOf()

    personList.add(Person("Jim", 34))
    personList.add(Person("A-Lin", 6))
    personList.add(Person("Tom", 43))
    personList.add(Person("Mary", 4))

    println("排序原始数据：")
    personList.forEach { println(" person:" + it.name + ", " + it.age) }

    // sortBy 升序
    println("排序以后 （升序）：")
    personList.sortBy { it.age }
    personList.forEach { println(" person:" + it.name + ", " + it.age) }

    // sortByDescending 降序
    println("排序以后 （降序）：")
    personList.sortByDescending { it.age }
    personList.forEach { println(" person:" + it.name + ", " + it.age) }


    // 3. 使用 sortWith 排序（包含了更多规则。）
    println("排序以后 使用sortWith()：")
    personList.sortWith(compareBy({ it.age }, { it.name }))
    println(personList)

}

// data
data class Person(var name: String, val age: Int)

//  4:实现comparable 接口来排序
data class Student(var name: String, val age: Int) : Comparable<Student> {
    override fun compareTo(other: Student): Int {

        return if (this.age == other.age) {
            this.name.compareTo(other.name)

        } else {
            other.age - this.age
        }

    }
}
