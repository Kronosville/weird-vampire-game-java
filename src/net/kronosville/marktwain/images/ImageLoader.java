package net.kronosville.marktwain.images;

import javax.swing.ImageIcon;

public final class ImageLoader {

    // TODO error if file doesn't load
    public ImageIcon load(String name) {
        return new ImageIcon(getClass().getResource(name));
    }
}
