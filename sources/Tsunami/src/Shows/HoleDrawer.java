/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shows;

import GameWindow.Constants;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author BIGSTONE
 */
public class HoleDrawer {
    private int x;
    private int y;

    public HoleDrawer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.x, this.y, Constants.DEFAULT_ZOMBIE_WIDTH, Constants.DEFAULT_ZOMBIE_HEIGHT);
    }
}
