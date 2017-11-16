package net.kronosville.marktwain;

import net.kronosville.marktwain.gui.GameGUI;
import net.kronosville.marktwain.images.ImageLoader;
import net.kronosville.marktwain.screens.Screen;
import net.kronosville.marktwain.screens.StartScreen;

import java.awt.EventQueue;

public final class AppMain {

    private final GameGUI gui;
    private Screen screen;

    public Screen getScreen() { return screen; }

    private AppMain() {
        screen = new StartScreen( new ImageLoader());
        gui = new GameGUI(this);
        gui.addMouseListener(new GameListener(this));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                new AppMain().gui.setVisible(true)
        );
    }
}
