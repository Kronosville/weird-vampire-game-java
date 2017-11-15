package net.kronosville.marktwain;

import net.kronosville.marktwain.images.ImageLoader;
import net.kronosville.marktwain.screens.Screen;
import net.kronosville.marktwain.screens.StartScreen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public final class AppMain extends JFrame implements MouseListener {

    private Screen screen;
    private ImageLoader imageLoader;
    private JPanel panel;

    private AppMain() {

        // Set up GUI

        super("Mark Twain: Vampire Hunter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1200, 600));

        panel = new JPanel();
        add(panel);

        pack();

        imageLoader = new ImageLoader();
        screen = new StartScreen(panel, imageLoader);

        addMouseListener(this);

        repaint();
    }

    @Override
    public void repaint() {
        // TODO clear?
        screen.displayOutput(panel);
        super.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        screen.respondToInput(e);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                new AppMain().setVisible(true));
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
