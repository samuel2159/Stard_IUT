/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Listeners;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import stardewvalley.ControleursObservateurs.Controlers.ControlerDeplacementClavier;
import stardewvalley.ControleursObservateurs.Controlers.ControleurInventaire;
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
    private ControleurInventaire controleurInventaire;
    private Mouvement mouv;
    private boolean inventaireOuvert;
    
    public ListenerClavier(){
        super();  
        mouv = Mouvement.Statique;
        inventaireOuvert = false;
    }
    
    @Override
    public void handle(KeyEvent event) {
        
        switch(event.getText()){
            //Deplacements
            
            case "z" : this.mouv = Mouvement.Haut;
            break;
            
            case "q" : this.mouv = Mouvement.Gauche;
            break;
           
            case "s" : this.mouv = Mouvement.Bas;
            break;
            
            case "d" : this.mouv = Mouvement.Droite;
            break;
            //Inventaire
            case "i" :
                if(inventaireOuvert)
                    inventaireOuvert = false;
                else
                    inventaireOuvert = true;    
                System.out.println(inventaireOuvert);
                mouv = Mouvement.Statique;
                controleurInventaire.update();
            break;
            default:
                this.mouv = Mouvement.Statique;
            break;
                    
        }
        controleur.update();
       
    }    
    
    
    public Mouvement getMouvement(){             
        return mouv;
    }
    
    public void setControleur(ControlerDeplacementClavier c){
        controleur = c;
    }

    public void setControleurInventaire(ControleurInventaire c){
        controleurInventaire = c;
    }

    public boolean inventaireEstOuvert(){
        return inventaireOuvert; 
   }
}