package net.kronosville.marktwain;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

final class GameListener implements MouseListener  {

    private final AppMain app;

    GameListener(AppMain app) {
        this.app = app;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        app.getScreen().respondToInput(e);
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
