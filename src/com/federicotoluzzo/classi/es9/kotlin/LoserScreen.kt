package com.federicotoluzzo.classi.es9.kotlin

import java.awt.Color
import java.awt.Component
import java.awt.Font
import javax.swing.*

class LoserScreen(game: Window, bestScore: Int) : JPanel() {
    val loserLabel = JLabel("You lost!")
    val bestScoreLabel = JLabel()
    val rematchButton = JButton("Play again")

    init {
        JPanel()
        layout = BoxLayout(this, BoxLayout.Y_AXIS)
        border = BorderFactory.createEmptyBorder(50, 50, 50, 50)
        background = Color(0xFACAAA)

        val font = Font("OpenSans Regular", Font.PLAIN, 32)

        loserLabel.font = font
        loserLabel.alignmentX = Component.CENTER_ALIGNMENT

        bestScoreLabel.text = "Best score: $bestScore"
        bestScoreLabel.font = font
        bestScoreLabel.alignmentX = Component.CENTER_ALIGNMENT

        rematchButton.addActionListener {
            game.contentPane = game.lobby
            game.pack()
        }

        add(loserLabel)
        add(bestScoreLabel)
        add(rematchButton)
    }
}