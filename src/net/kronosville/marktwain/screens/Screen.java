package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.images.ImageLoader;

import java.awt.Container;

public interface Screen {
    void displayOutput(Container pane, ImageLoader imageLoader);
    Screen respondToInput(/* input */);
}
