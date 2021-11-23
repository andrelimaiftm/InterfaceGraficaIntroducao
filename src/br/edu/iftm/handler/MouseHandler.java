package br.edu.iftm.handler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("X: " + e.getX() + " Y: "+ e.getY());        
    }
    
}
