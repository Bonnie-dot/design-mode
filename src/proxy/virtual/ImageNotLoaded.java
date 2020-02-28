package proxy.virtual;


import javax.swing.*;
import java.awt.*;

public class ImageNotLoaded implements State {

    ImageProxy imageProxy;

    public ImageNotLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    Thread retrievedThread;
    boolean retrieving = false;


    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover", x + 300, y + 190);
        if (!retrieving) {
            retrieving = true;
            retrievedThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    ImageIcon cd_cover = new ImageIcon(imageProxy.getImageUrl(), "CD Cover");
                    imageProxy.setImageIcon(cd_cover);
                    imageProxy.setState(imageProxy.getImageLoaded());
                    c.repaint();
                }
            });
            retrievedThread.start();
        }
    }
}
