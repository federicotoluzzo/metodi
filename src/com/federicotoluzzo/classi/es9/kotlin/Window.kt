package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.JFrame

class Window : JFrame() {
    val lobby = Lobby(this)
    val game = Game(this)
    val winnerScreen = WinnerScreen(this, 0, 0)
    val loserScreen = LoserScreen(this, 0)

    init{
        contentPane = lobby
        pack()
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}