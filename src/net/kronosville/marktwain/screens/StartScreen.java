package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.images.ImageLoader;

import javax.swing.JLabel;

import java.awt.Container;

public final class StartScreen implements Screen {

    @Override
    public void displayOutput(Container pane, ImageLoader imageLoader) {
        pane.add(new JLabel("", imageLoader.load("mark-twain.jpg"), JLabel.CENTER));
    }

    @Override
    public Screen respondToInput() {
        return this;
    }
}
