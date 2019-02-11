package net.print.kt03.eleven

fun main(args: Array<String>) {


    val player :Player = Player()
    player.paly("fds",30000)
    player.pause()
    player.resume()
    player.seekTo(30000)
    player.stop()
}