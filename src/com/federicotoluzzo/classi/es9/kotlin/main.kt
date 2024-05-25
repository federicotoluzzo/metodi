package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.JFrame

fun main(args: Array<String>) {
    val jf = JFrame("Hangman")
    jf.contentPane = WinnerScreen(Window(), 69, 420)
    jf.pack()
    jf.isVisible = true
}
