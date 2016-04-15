/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Hole;
import Model.HoleManager;

/**
 *
 * @author Recett
 */
public class HoleController {
    private static HoleController inst;
    private HoleManager holeManager;

    private HoleController() {

    }

    public void move() {
        for (Hole hole : holeManager.getVect()) {
            hole.move();
            if (hole.getX() <= 0) {
                holeManager.removeHole(hole);
            }
        }
    }

    public static HoleController getInst() {
        if (inst == null) {
            inst = new HoleController();
        }
        return inst;
    }
}
