package com.federicotoluzzo.classi.es9.kotlin

import javax.swing.*

class Game(game : Window) : JPanel() {
    val label = JLabel()
    val choice = JComboBox<String>()
    val guess = JTextField()
    val submitButton = JButton("Submit")

    var tries = 0;

    var phrases = setOf(
        "Mangio la pasta col pomodoro",
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
            if(guess.text.isNotEmpty()) {
                if(guess.text.lowercase() == phrase.lowercase()) {
                    game.winnerScreen = WinnerScreen(game, game.bestScore, tries)
                    game.contentPane = game.winnerScreen
                }
            } else {
                showedCharacters.add(choice.selectedItem.toString())
                choice.removeItem(choice.selectedItem)
            }

            label.text = hiddenText()
        }

        layout = BoxLayout(this, BoxLayout.Y_AXIS)

        add(label)
        add(choice)
        add(guess)
        add(submitButton)
    }

    fun hiddenText() : String {
        var text = ""
        for (character in phrase){
            text += if ((character.lowercase()[0] !in ('a'..'z')) || showedCharacters.contains(character.uppercase()))  character else "-"
        }
        return text
    }
}