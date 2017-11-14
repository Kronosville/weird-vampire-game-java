package net.kronosville.marktwain;

import net.kronosville.marktwain.images.ImageLoader;
import net.kronosville.marktwain.screens.Screen;
import net.kronosville.marktwain.screens.StartScreen;

import javax.swing.*;

import java.awt.EventQueue;

public final class Game extends JFrame {

    private Screen screen;
    private ImageLoader imageLoader;

    private Game() {
        // Set up GUI
        super("Mark Twain: Vampire Hunter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        screen = new StartScreen();
        imageLoader = new ImageLoader();
        // TODO add listeners
        repaint();
    }

    @Override
    public void repaint() {
        // TODO clear?
        screen.displayOutput(getContentPane(), imageLoader);
        super.repaint();
    }

    // TODO respondToInput in listeners

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                new Game().setVisible(true));
    }
}
