/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 *
 * @author Recett
 */
public class HoleManager {

    private Vector<Hole> vect = new Vector<>();
    private static HoleManager inst;
    
    public void addHole(Hole e) {
        vect.add(e);
    }
    
    public void removeHole(Hole e) {
        vect.remove(e);
    }
        
    public static HoleManager getInst() {
        if (inst == null) {
            inst = new HoleManager();
        }
        return inst;
    }

    public Vector<Hole> getVect() {
        return vect;
    }
        
}
