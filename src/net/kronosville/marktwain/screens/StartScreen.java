package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.images.ImageLoader;

import javax.swing.JPanel;
import javax.swing.JLabel;

public final class StartScreen implements Screen {

    @Override
    public void displayOutput(JPanel pane, ImageLoader imageLoader) {

        pane.add(new JLabel("", imageLoader.load("mark-twain.jpg"), JLabel.LEFT));
        pane.add(new JLabel("", imageLoader.load("abraham-lincoln.jpg"), JLabel.RIGHT));
    }

    @Override
    public Screen respondToInput() {
        return this;
    }
}
