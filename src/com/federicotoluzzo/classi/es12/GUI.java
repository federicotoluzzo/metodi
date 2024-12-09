package com.federicotoluzzo.classi.es12;

import javax.swing.*;

public class GUI extends JFrame {
    public GUI(){
        setTitle("Richieste");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane();
        pack();
    }
}
