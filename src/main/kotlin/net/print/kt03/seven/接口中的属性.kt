package net.print.kt03.seven


class Milestone {}

interface MilestoneService {
    val name: String
    val owner: String get() = "Jack"

    fun save(milestone: Milestone)

    fun print() {
        println("I am MileStone")
    }
}

class MilesoneServiceImpl : MilestoneService {
    override fun save(milestone: Milestone) {
        println("save Milestone ")
    }

    override val name: String
        get() = "MilesoneServiceImpl name ."

}


