/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Listeners;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import stardewvalley.ControleursObservateurs.Controlers.ControlerClickSouris;
import stardewvalley.Metier.Mouvement;

/**
 *
 * @author Vincent Tantet
 */
public class ListenerSouris implements EventHandler<MouseEvent>{

    private ControlerClickSouris controleur;
    
    public ListenerSouris(){
        super();  
    }
    
    @Override
    public void handle(MouseEvent event) {
        //event.get
    }
    
    public void setControleur(ControlerClickSouris c){
        controleur = c;
    }
}
