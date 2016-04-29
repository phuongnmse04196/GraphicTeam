/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Graphics;

public class GameController {

    private static GameController inst;

    private GameController() {

    }
    
    public void run(){
        ZombieController.getInstance().move();
    }
    
    public void draw(Graphics g) {
        ZombieController.getInstance().draw(g);

    }

    public static GameController getInst() {
        if (inst == null) {
            inst = new GameController();
        }
        return inst;
    }
}
