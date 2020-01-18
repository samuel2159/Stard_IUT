/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Listeners;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import stardewvalley.ControleursObservateurs.Controlers.ControlerDeplacementClavier;
import stardewvalley.Metier.Mouvement;

/**
 *
 * @author ea058452
 */
/**
 *
 * @author telli
 */
public class ListenerClavier implements EventHandler<KeyEvent>{

    private ControlerDeplacementClavier controleur;
    private Mouvement mouv;
    
    public ListenerClavier(){
        super();  
        mouv = Mouvement.Bas;
    }
    
    @Override
    public void handle(KeyEvent event) {
        
        switch(event.getText()){
            //Haut
            case "z" : this.mouv = Mouvement.Haut;
            break;
            //Gauche
            case "q" : this.mouv = Mouvement.Gauche;
            break;
            //Bas
            case "s" : this.mouv = Mouvement.Bas;
            break;
            //Droite
            case "d" : this.mouv = Mouvement.Droite;
            break;
                    
        }
        controleur.update();
       // System.out.println(mouv);
    }    
    
    
    public Mouvement getMouvement(){             
        return mouv;
    }
    
    public void setControleur(ControlerDeplacementClavier c){
        controleur = c;
    }
}