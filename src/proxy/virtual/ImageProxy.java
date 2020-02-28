package proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    State imageLoaded;
    State imageNotLoaded;
    ImageIcon imageIcon;
    URL imageUrl;
    State state;

    public ImageProxy(URL imageUrl) {
        // In a Java application, when an object reference is a parameter passed to a method,
        // you are passing a copy of the reference (by value), not the reference itself
        //this.imageLoaded = new ImageLoaded(imageIcon);
        this.imageNotLoaded = new ImageNotLoaded(this);
        this.imageUrl = imageUrl;
        this.setState(this.imageNotLoaded);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    public State getImageLoaded() {
        return imageLoaded;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
        initImageLoaded();
    }

    public void initImageLoaded() {
        this.imageLoaded = new ImageLoaded(imageIcon);
    }

    public URL getImageUrl() {
        return imageUrl;
    }

}
