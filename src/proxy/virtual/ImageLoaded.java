package proxy.virtual;

import javax.swing.*;
import java.awt.*;

public class ImageLoaded implements State {

    ImageIcon imageIcon;

    public ImageLoaded(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }
}
