/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.event.KeyEvent;

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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(true) {
            this.x = this.x- speed; 
            if (skip) {
                int i = 1;
                if ( i <= 10) {
                    this.y = this.y - 1;
                    i++;                                
                }
            }
        }
    }
    
    // khi giu phim
    public void keyPress(KeyEvent key){
        if (key.getKeyCode() == KeyEvent.VK_SPACE) {
            setSkip(true);
        }
    }
    public void keyReleased (KeyEvent key){
        if (key.getKeyCode() == KeyEvent.VK_SPACE) {
            setSkip(false);
        }
    }
}
