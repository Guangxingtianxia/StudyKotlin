package net.print.kt03.eleven

import kotlin.properties.Delegates

class Player {

    private var state: State by Delegates.observable(State.IDLE, { prop, old, new ->
        print("$old -> $new")

        // ? . 的方式安全调用
        onPlayerStateChanged?.onStateChange(old, new)
    })

    private fun senondCmd(cmd: PlayerCmd) {
        when (cmd) {
            is PlayerCmd.Play -> {
                println("\nPlay ${cmd.url}from ${cmd.positon}ms")
                state = State.PALYING
                doPlay(cmd.url, cmd.positon)
            }

            is PlayerCmd.Resume -> {
                println("\nResume")
                state = State.PALYING
                doResume()
            }

            is PlayerCmd.Pause -> {
                print("\n Pause")
                state = State.PAUSED
                doPause()
            }

            is PlayerCmd.Stop -> {
                print("\nStop")
                state = State.IDLE
                doStop()
            }

            is PlayerCmd.SeekTo -> {
                println("\n Seek to ${cmd.positon}ms ,state:$state")
            }
        }

    }

    private fun doPlay(url: String, positon: Long) {}

    private fun doResume() {
        println("invoke doResume()")
    }

    private fun doPause() {
        println("invoke doPause()")
    }

    private fun doStop() {
        println("invoke doStop()")
    }


    interface OnPlayerStateChangedListener {
        fun onStateChange(oldState: State, new: State)
    }


    var onPlayerStateChanged: OnPlayerStateChangedListener? = null


    fun paly(url: String, position: Long = 0) {
        senondCmd(PlayerCmd.Play(url, position))

    }

    fun resume() {
        senondCmd(PlayerCmd.Resume)
    }

    fun pause() {
        senondCmd(PlayerCmd.Pause)
    }

    fun stop() {
        senondCmd(PlayerCmd.Stop)
    }

    fun seekTo(position: Long) {
        senondCmd(PlayerCmd.SeekTo(position))
    }

}

