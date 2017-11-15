package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.Game;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;

final class MapScreen implements Screen {
    private Game game;

    MapScreen(Game game) {
        this.game = game;
    }

    @Override
    public void displayOutput(JPanel panel) {

    }

    @Override
    public Screen respondToInput(MouseEvent e) {
        return this;
    }
}
