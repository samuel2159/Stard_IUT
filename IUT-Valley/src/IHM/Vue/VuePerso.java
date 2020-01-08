/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.Vue;

import Metier.Personnage.Personnage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import MVC.Observers.Observer;

/**
 *
 * @author telli
 */
public class VuePerso implements KeyListener,Observer{
    
    private ArrayList<Integer> touches = new ArrayList<>();
    private Personnage personnage;    
    /*
    public VuePerso(Personnage p,ImageView sprite){
        personnage = p;      
        sprite.setViewport(new Rectangle2D(0, 0, 16, 32));
        
        if(touches.contains((Integer)KeyEvent.VK_Z)){
            animationHaut();
            p.Deplacer(new Coordonnee(0, -25));
        }
        
        else if(touches.contains((Integer)KeyEvent.VK_S)){
            animationBas();
            p.Deplacer(new Coordonnee(0, 25));
        }         
        
        if(touches.contains((Integer)KeyEvent.VK_Q)){
            animationGauche();
            p.Deplacer(new Coordonnee(-25, 0));
        }

        if(touches.contains((Integer)KeyEvent.VK_D)){
            animationDroit();
            p.Deplacer(new Coordonnee(25, 0));
        }       
        
    }
    */
    private void animationHaut(){
        
    }
    
    private void animationBas() {
        
    }

    private void animationGauche() {
        
    }

    private void animationDroit() {
        
    }    

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!touches.contains((Integer)e.getKeyCode())){
        touches.add((Integer)e.getKeyCode());
        }        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        touches.remove((Integer)e.getKeyCode());        
    }

    public void update(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
