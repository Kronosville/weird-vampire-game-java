package net.kronosville.marktwain.gui;

import net.kronosville.marktwain.AppMain;

import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame {

    private AppMain app;
    private JPanel panel;

    public JPanel getPanel() { return panel; }

    public GameGUI(AppMain app) {
        super("Mark Twain: Vampire Hunter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1200, 600));

        panel = new JPanel();
        add(panel);

        pack();

        this.app = app;

        repaint();
    }

    @Override
    public void repaint() {
        // TODO clear?
        app.getScreen().displayOutput(panel);
        super.repaint();
    }
}
