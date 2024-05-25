package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.*

class Game(game : Window) : JPanel() {
    val label = JLabel()
    val choice = JComboBox<String>()
    val submitButton = JButton("Submit")

    var phrases = setOf(
        "Mangio la paèsta col pomodoro",
        "Guardo film ottenuti tramite strumenti illeciti",
        "Corro al parco quando ho voglia",
        "Acido desossiribonucleico",
        "Preferisco l'NBA alla serie A",
        "Mi piace seguire l'atletica leggera"
    )

    val phrase = phrases.random()

    var showedCharacters = mutableSetOf<String>()

    init {
        for (letter in 'A'..'Z') {
            choice.addItem(letter.toString())
        }
        label.text = hiddenText()

        submitButton.addActionListener {
            showedCharacters.add(choice.selectedItem.toString())
            label.text = hiddenText()
        }

        add(label)
        add(choice)
        add(submitButton)
    }

    fun hiddenText() : String {
        var text = ""
        for (character in phrase){
            text += if (!character.isLetter() || showedCharacters.contains(character.uppercase()))  character else "-"
        }
        return text
    }
}