package net.print.kt03.eleven

/**
 * 理解成扩展版本的枚举
 */
sealed class PlayerCmd {
    class Play(val url: String, val positon: Long) : PlayerCmd()

    class SeekTo(val positon: Long):PlayerCmd()

    object Pause :PlayerCmd()
    object Resume:PlayerCmd()
    object Stop:PlayerCmd()


}