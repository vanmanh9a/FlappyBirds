/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flappybirds;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import pkg2dgamesframework.GameScreen;

/**
 *
 * @author admin
 */
public class FlappyBirds extends GameScreen{

    public FlappyBirds(){
        super(800,600);
        
        BeginGame();
    }
    
    public static void main(String[] args) {
        new FlappyBirds();
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {
        
        
    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {
        g2.setColor(Color.red);
        g2.fillRect(50, 100, 100, 100);
    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
