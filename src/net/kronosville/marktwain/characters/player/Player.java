package net.kronosville.marktwain.characters.player;

import javax.swing.ImageIcon;

public abstract class Player {
    protected String name;
    protected ImageIcon image;

    protected Player(String name, ImageIcon image) {
        this.name = name;
        this.image = image;
    }
}
