/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Recett
 */
public abstract class OtherObject extends GameObject {

    public OtherObject(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        x = x - speed;
    }       
}
