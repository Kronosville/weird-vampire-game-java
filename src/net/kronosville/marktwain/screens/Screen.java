package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.images.ImageLoader;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;

public interface Screen {
    void displayOutput(JPanel panel);
    Screen respondToInput(MouseEvent e);
}
