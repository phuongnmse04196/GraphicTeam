/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 *
 * @author Nguyễn Hoàng
 */
public class ZombieManager {
    private static ZombieManager ZMan;
    public Vector<Zombie> Zvect = new Vector<>();
    
    public void addZombie(Zombie e){
        ZMan.addZombie(e);
    }
    
    public void removeZombie (Zombie e){
        ZMan.removeZombie(e);
    }
    
    // dk die
    
    
    public static ZombieManager getZMan() {
        if (ZMan == null) {
            ZMan = new ZombieManager();
        }
        return ZMan;
    }

    public Vector<Zombie> getZvect() {
        return Zvect;
    }
    
    
}
