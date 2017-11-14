package net.kronosville.marktwain.images;

import javax.swing.ImageIcon;

public final class ImageLoader {
    public ImageIcon load(String name) {
        return new ImageIcon(getClass().getResource(name));
    }
}
