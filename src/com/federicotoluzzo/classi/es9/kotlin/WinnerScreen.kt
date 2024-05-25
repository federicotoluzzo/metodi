package com.federicotoluzzo.classi.es9.kotlin

import java.awt.Color
import java.awt.Component
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class WinnerScreen(game: Window, score: Int, bestScore: Int) : JPanel() {
    val winnerLabel = JLabel("You won!")
    val scoreLabel = JLabel()
    val bestScoreLabel = JLabel()
    val rematchButton = JButton("Play again")

    init {
        JPanel()
        layout = BoxLayout(this, BoxLayout.Y_AXIS)
        border = BorderFactory.createEmptyBorder(50, 50, 50, 50)
        background = Color(0xAAAAFA)

        val font = Font("OpenSans Regular", Font.PLAIN, 32)

        winnerLabel.font = font
        winnerLabel.alignmentX = Component.CENTER_ALIGNMENT

        scoreLabel.text = "It took you $score tries."
        scoreLabel.font = font
        scoreLabel.alignmentX = Component.CENTER_ALIGNMENT

        bestScoreLabel.text = "Best score: $bestScore"
        bestScoreLabel.font = font
        bestScoreLabel.alignmentX = Component.CENTER_ALIGNMENT

        rematchButton.addActionListener {
            game.contentPane = game.lobby
            game.pack()
        }

        add(winnerLabel)
        add(scoreLabel)
        add(bestScoreLabel)
        add(rematchButton)
    }
}