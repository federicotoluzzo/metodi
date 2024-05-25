package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.*

class Game(game : Window) : JPanel() {
    val label = JLabel()
    val choice = JComboBox<String>()
    val submitButton = JButton("Submit")

    init {
        for (letter in 'A'..'Z') {
            choice.addItem(letter.toString())
        }
        add(choice)
    }
}