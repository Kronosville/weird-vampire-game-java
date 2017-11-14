package net.kronosville.marktwain;

import javax.swing.JFrame;

import java.awt.EventQueue;

public class Game extends JFrame {

    private Game() {
        // Set up GUI
        super("Mark Twain: Vampire Hunter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                new Game().setVisible(true));
    }
}
