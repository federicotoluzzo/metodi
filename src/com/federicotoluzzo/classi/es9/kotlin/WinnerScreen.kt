package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.JLabel
import javax.swing.JPanel

class WinnerScreen(score: Int) : JPanel() {
    val winnerLabel = JLabel("You won!")
    val scoreLabel = JLabel()

    init {
        JPanel()
        scoreLabel.text = "It took you $score tries"
    }
}