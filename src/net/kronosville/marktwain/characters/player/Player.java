package net.kronosville.marktwain.characters.player;

import javax.swing.ImageIcon;

public abstract class Player {
    private final String name;
    private final ImageIcon image;

    private int xp;

    protected Player(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }

    private final void message(String msg) {
        // TODO
    }
}
