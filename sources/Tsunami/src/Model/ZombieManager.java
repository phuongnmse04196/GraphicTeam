/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;
import GameWindow.Constants;

/**
 *
 * @author Nguyễn Hoàng
 */
public class ZombieManager {

    private static ZombieManager ZMan;
    public Vector<Zombie> Zvect = new Vector<>();

    public boolean movingDown;

    public void addZombie(Zombie e) {
        Zvect.add(e);
    }

    public void addZombie(int numberOfZombie) {
        for (int i = 0; i < numberOfZombie; i++) {
            Zombie newZombie = new Zombie(Constants.DEFAULT_POSITON_X, Constants.DEFAULT_POSITION_Y);
            addZombie(newZombie);
        }
    }

    public boolean doneMoveDown() {
        Zombie zombie = Zvect.get(0);
        if (zombie.x == Constants.DEFAULT_POSITION_Y) {
            return true;
        }
        return false;
    }

    public void removeZombie(Zombie e) {
        Zvect.remove(e);
    }

    public void moveUp() {
        for (Zombie zombie : Zvect) {
            if (zombie.y > 150) {
                zombie.y--;
            }
        }
    }

    public void moveDown() {
        for (Zombie zombie : Zvect) {
            if (zombie.y < 300) {
                zombie.y++;
            } else {
                movingDown = false;
            }
        }

    }
    // dk die

    public static ZombieManager getInstance() {
        if (ZMan == null) {
            ZMan = new ZombieManager();
        }
        return ZMan;
    }

    public Vector<Zombie> getZvect() {
        return Zvect;
    }
}
