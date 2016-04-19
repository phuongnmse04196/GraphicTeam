/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author BIGSTONE
 */
public class Car extends OtherObject {

    private boolean isMoving;

    public Car(int x, int y, int speed) {
        super(x, y);
        this.speed = speed;
    }

    public void move() {
        if (isMoving) {
            x += speed;
        }
    }
}
