/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Zombie;
import Model.ZombieManager;
import Shows.ZombieDrawer;
import java.awt.Graphics;

/**
 *
 * @author Nguyễn Hoàng
 */
public class ZombieController {

    private static ZombieController ZCon;
    private int numberOfZombie;
    public boolean jumping;

    private ZombieController() {
        this.jumping = false;
        this.numberOfZombie = 0;
        ZombieManager.getInstance().addZombie(1);

    }

    public void move() {
        if (this.jumping && ZombieManager.getInstance().movingDown == false) {
            ZombieManager.getInstance().moveUp();
        } else {
            ZombieManager.getInstance().movingDown = true;
            ZombieManager.getInstance().moveDown();
        }

    }

    public void addZombie(int numberOfZombie) {
        this.numberOfZombie += numberOfZombie;
        ZombieManager.getInstance().addZombie(numberOfZombie);
    }

    public void draw(Graphics g) {

        for (Zombie zombie : ZombieManager.getInstance().getZvect()) {
            ZombieDrawer zombieDrawer = new ZombieDrawer(zombie.getX(), zombie.getY());
            zombieDrawer.draw(g);
        }
    }

    public static ZombieController getInstance() {
        if (ZCon == null) {
            ZCon = new ZombieController();
        }
        return ZCon;
    }

}
