package net.print.kt03.four

interface ProjectService
{
    val name:String
    val owmer :String
    fun save(string :String)
    fun print(){
        println(" I am project.")
    }
}

/**
 * 冒号，： 语法来实现一个接口，ps，和java 是一样的。
 */
class ProjectServiceImpl(override val name: String, override val owmer: String) : ProjectService{


    override fun save(string: String) {
        println("save func had been invoked.")
    }

}


fun main(args: Array<String>) {
    val projectServiceIpl = ProjectServiceImpl("tom","Jim")
    projectServiceIpl.save("345")


}