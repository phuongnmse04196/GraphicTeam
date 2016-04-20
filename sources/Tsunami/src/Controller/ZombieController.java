/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Zombie;
import Model.ZombieManager;

/**
 *
 * @author Nguyễn Hoàng
 */
public class ZombieController {
    private static ZombieController ZCon;
    private ZombieManager Zman;

   private ZombieController (){
       
   }
    
    public void move(){
        for (Zombie zombie: Zman.getZvect() ){
            zombie.move();
            if (zombie.die) {
                Zman.removeZombie(zombie);
                
            }
        }
    }

    public static ZombieController getZCon() {
        if (ZCon == null) {
            ZCon = new ZombieController();
        }
        return ZCon;
    }

}
