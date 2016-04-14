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
public abstract class GameObject {
    
    protected int x;
    protected int y;
    protected int speed;
    
    public abstract void move();
}
