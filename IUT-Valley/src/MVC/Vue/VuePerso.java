/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue;

import MVC.Controleurs.ControleurPerso;
import Metier.Carte.Coordonnee;
import Metier.Personnage.Personnage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import MVC.Observers.Observer;
import javafx.scene.Parent;

/**
 *
 * @author telli
 */
public class VuePerso extends Parent implements KeyListener,Observer{
    
    private ArrayList<Integer> touches = new ArrayList<Integer>();
    private Personnage personnage;    
    private ControleurPerso controleur;
    private Scene scene;
    
    public VuePerso(Personnage p,Scene s,ControleurPerso cp){
        controleur = cp;
        scene = s;
        //Gestion du sprite ------------------------------------
        ImageView sprite  = new ImageView(new Image("Ressources/Personnages/Sebastian.png"));
        personnage = p;      
        sprite.setViewport(new Rectangle2D(0, 0, 16, 32));
        sprite.setSmooth(true);
        sprite.setPreserveRatio(true);
        sprite.fitHeightProperty().bind(s.heightProperty().multiply(0.12));
        this.getChildren().add(sprite);
        //-------------------------------------------------------   
        
        //Deplacements ------------------------------------------
        if(touches.contains((Integer)KeyEvent.VK_Z)){
            controleur.update("haut");
            System.out.println("ok");
        }
        
        else if(touches.contains((Integer)KeyEvent.VK_S)){
            controleur.update("bas");
        }         
        
        if(touches.contains((Integer)KeyEvent.VK_Q)){
            controleur.update("gauche");
        }

        if(touches.contains((Integer)KeyEvent.VK_D)){
            controleur.update("droite");
        }      
        if(touches.contains((Integer)KeyEvent.VK_I)){
            controleur.update("inventaire");
            //new VueInventaire();
        }
        
    }
    
    //animations
    @Override
    public void update(String message) {
       
        if(message.equals("haut")){
            
        }
        
    }
    public Personnage getPersonnage(){
        return personnage;
    }

    //---------inputs
    @Override
    public void keyPressed(KeyEvent e) {
        if(!touches.contains((Integer)e.getKeyCode())){
        touches.add((Integer)e.getKeyCode());
            System.out.println("test");
        }        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        touches.remove((Integer)e.getKeyCode());        
    }



    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    
}
