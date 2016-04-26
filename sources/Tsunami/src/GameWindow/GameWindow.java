package GameWindow;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;

public class GameWindow extends Frame implements Runnable {

    public GameWindow() {
        this.setTitle("JS Club - Tsunami");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setBackground(Color.WHITE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    private Image image;
    private Graphics second;

    @Override
    public void update(Graphics g) {
        if (image == null) {
            image = createImage(this.getWidth(), this.getHeight());
            second = image.getGraphics();
        }

        second.setColor(getBackground());
        second.fillRect(0, 0, getWidth(), getHeight());
        paint(second);
        g.drawImage(image, 0, 0, null);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void run() {

        while (true) {
            repaint();
        }
    }

    public static void main(String[] args) {
        GameWindow game = new GameWindow();
        Thread thread = new Thread(game);
        thread.start();
    }
}
