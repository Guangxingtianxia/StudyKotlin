package net.print.kt03.high_order_fun.xingzhou

class DbCongfig {
    var url: String = ""
    var username: String = ""
    var password: String = ""
    override fun toString(): String {
        return "DbCongfig(url='$url', username='$username', password='$password')"
    }


}

class DbConnection {
    fun config(conf: DbConnection) {
        println(conf)
    }
}

fun main(args: Array<String>) {
    val conn = DbConnection()
//    conn.config(DbCongfig().apply {
//        this.url = ""
//        this.username = ""
//        this.password = ""
//
//    })

    // conn.config(DbCongfig().apply { url = "",username= "",password= "" })

}