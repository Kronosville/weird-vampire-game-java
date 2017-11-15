package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.images.ImageLoader;

import javax.swing.JPanel;

public interface Screen {
    void displayOutput(JPanel panel, ImageLoader imageLoader);
    Screen respondToInput(/* input */);
}
