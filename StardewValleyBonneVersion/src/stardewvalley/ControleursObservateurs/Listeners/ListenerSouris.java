/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Listeners;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import stardewvalley.ControleursObservateurs.Controlers.ControlerClickSouris;
import stardewvalley.Metier.Carte.Coordonnee;

/**
 *
 * @author Vincent Tantet
 */
public class ListenerSouris implements EventHandler<MouseEvent>{

    private ControlerClickSouris controleur;
    private Coordonnee coord;
    
    public ListenerSouris(){
        super();  
        coord = new Coordonnee(0,0);
    }
    
    @Override
    public void handle(MouseEvent event) {
        double x = event.getSceneX()/35;
        double y = event.getSceneY()/35;
        coord.setX((int)x);
        coord.setY((int)y);
        controleur.update();
    }
    
    public void setControleur(ControlerClickSouris c){
        controleur = c;
    }
    
    public Coordonnee getCoordonnee(){
        return coord;
    }
}
