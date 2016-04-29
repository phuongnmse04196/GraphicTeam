package GameWindow;

import Controller.GameController;
import Controller.ZombieController;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class GameWindow extends Frame implements Runnable {

    public GameWindow() {
        this.setTitle("JS Club - Tsunami");
        this.setSize(Constants.SIZE_WIDTH, Constants.SIZE_HEIGHT);
        this.setResizable(false);
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
                switch(e.getKeyCode()){
                    case KeyEvent.VK_F: 
                        ZombieController.getInstance().jumping = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_F: 
                        ZombieController.getInstance().jumping = false;
                }
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
        GameController.getInst().draw(g);
    }

    @Override
    public void run() {
        
        while (true) {
            GameController.getInst().run();
            repaint();
            try {
                Thread.sleep(17);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        GameWindow game = new GameWindow();
        Thread thread = new Thread(game);
        thread.start();
    }
}
