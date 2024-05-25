package com.federicotoluzzo.classi.es9.kotlin

import java.awt.Component
import java.awt.Font
import javax.swing.*
import kotlin.system.exitProcess

class Lobby(game : Window) : JPanel() {
    val label = JLabel("Hangman")
    val best = JLabel("Best score : 0")
    val startButton = JButton("New Game")
    val quitButton = JButton("Quit")

    init {
        JPanel()
        border = BorderFactory.createEmptyBorder(20, 20, 20, 20)
        layout = BoxLayout(this, BoxLayout.Y_AXIS)

        label.font = Font("Open Sans", Font.PLAIN, 32)
        best.font = Font("Open Sans", Font.PLAIN, 24)

        label.alignmentX = Component.CENTER_ALIGNMENT
        best.alignmentX = Component.CENTER_ALIGNMENT
        startButton.alignmentX = Component.CENTER_ALIGNMENT
        quitButton.alignmentX = Component.CENTER_ALIGNMENT

        startButton.addActionListener {
            game.contentPane = game.game
            game.pack()
        }

        quitButton.addActionListener {
            exitProcess(0)
        }

        add(label)
        add(best)
        add(startButton)
        add(quitButton)
    }
}