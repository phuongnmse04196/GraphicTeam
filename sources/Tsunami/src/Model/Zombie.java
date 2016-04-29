/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nguyễn Hoàng
 */
public class Zombie extends GameObject {

    boolean skip ;
    public boolean die;

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }
    
    public Zombie(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void move() {
    }   
}
