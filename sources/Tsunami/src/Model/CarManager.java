/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Vector;

/**
 *
 * @author BIGSTONE
 */
public class CarManager {
    private Vector<Car> vect = new Vector<>();
    private static CarManager inst;
    
    public void addCar(Car e) {
        vect.add(e);
    }
    
    public void removeCar(Car e) {
        vect.remove(e);
    }
        
    public static CarManager getInst() {
        if (inst == null) {
            inst = new CarManager();
        }
        return inst;
    }

    public Vector<Car> getVect() {
        return vect;
    }
}
