package net.kronosville.marktwain.screens;

import net.kronosville.marktwain.Game;
import net.kronosville.marktwain.characters.player.Lincoln;
import net.kronosville.marktwain.characters.player.Twain;
import net.kronosville.marktwain.characters.player.Player;
import net.kronosville.marktwain.images.ImageLoader;

import javax.swing.*;

import java.awt.event.MouseEvent;

public final class StartScreen implements Screen {
    private final ImageIcon twainImage, lincolnImage;
    private final JLabel twainLabel, lincolnLabel;

    public StartScreen(ImageLoader imageLoader) {
        twainImage = imageLoader.load("mark-twain.jpg");
        lincolnImage = imageLoader.load("abraham-lincoln.jpg");
        twainLabel = new JLabel("", twainImage, JLabel.LEFT);
        lincolnLabel = new JLabel("", lincolnImage, JLabel.RIGHT);
    }

    @Override
    public void displayOutput(JPanel panel) {
        panel.add(twainLabel);
        panel.add(lincolnLabel);
    }

    @Override
    public Screen respondToInput(MouseEvent e) {
        if (!(e.getComponent() == twainLabel || e.getComponent() == lincolnLabel)) return this;

        Player player = e.getComponent() == twainLabel ? new Twain(twainImage) : new Lincoln(lincolnImage);
        return new MapScreen(new Game(player));
    }
}
