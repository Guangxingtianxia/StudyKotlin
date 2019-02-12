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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

