/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.Cases;

//import MVC.Vue.Arbres.VueObjetPlace;
import javafx.geometry.Rectangle2D;
import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Cases.Case;
import stardewvalley.Metier.Carte.Direction;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author telli
 */
public class VueCaseEau extends VueCase {
    
    public VueCaseEau(Case c){
        super(c);
        
        this.setViewport(new Rectangle2D(16,1232,16,16)); 
        
        //terre angle haut droit
        if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("eau")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("eau")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(81,1217,16,16)); 
        }      
        //terre angle haut gauche
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("eau")) && (c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("eau")) && (c.getVoisine(Direction.HautDroite) != null) && (c.getVoisine(Direction.HautDroite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(95,1217,16,16));  
        } 
        // terre gauche, angle haut gauche, haut
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(0,1217,16,16));  
        } 
        // terre droite, angle haut droit, haut
        else if((c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("terre")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautDroite) != null) && (c.getVoisine(Direction.HautDroite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(32,1217,16,16));  
        }
        // terre gauche, angle bas gauche, bas, haut gauche
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(0,1263,16,16));  
        } 
        // terre droite, angle bas droit, bas, haut droit
        else if((c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasDroite) != null) && (c.getVoisine(Direction.BasDroite).getCaseType().equals("terre"))&& (c.getVoisine(Direction.HautDroite) != null) && (c.getVoisine(Direction.HautDroite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(32,1263,16,16));  
        }
        // terre gauche, angle bas gauche, bas
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(48,1231,16,16));  
        } 
        // terre droite, angle bas droit, bas
        else if((c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasDroite) != null) && (c.getVoisine(Direction.BasDroite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(64,1231,16,16));  
        }
    }      
    
}
