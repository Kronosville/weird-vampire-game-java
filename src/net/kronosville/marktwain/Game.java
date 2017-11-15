package net.kronosville.marktwain;

import net.kronosville.marktwain.images.ImageLoader;
import net.kronosville.marktwain.screens.Screen;
import net.kronosville.marktwain.screens.StartScreen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.Dimension;

public final class Game extends JFrame {

    private Screen screen;
    private ImageLoader imageLoader;
    private JPanel panel;

    private Game() {

        // Set up GUI

        super("Mark Twain: Vampire Hunter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1200, 600));

        panel = new JPanel();
        add(panel);

        pack();

        screen = new StartScreen();
        imageLoader = new ImageLoader();
        // TODO add listeners
        repaint();
    }

    @Override
    public void repaint() {
        // TODO clear?
        screen.displayOutput(panel, imageLoader);
        super.repaint();
    }

    // TODO respondToInput in listeners

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                new Game().setVisible(true));
    }
}
