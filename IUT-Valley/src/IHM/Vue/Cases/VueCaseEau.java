/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.Vue.Cases;

import MVC.Vue.Arbres.VueObjetPlace;
import Metier.Carte.Carte;
import Metier.Carte.Cases.CaseEau;
import Metier.Carte.Direction;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueCaseEau extends VueObjetPlace{
    
    public VueCaseEau(CaseEau c,ImageView sprite){
        super();
        sprite.setViewport(new Rectangle2D(0,0,16,16)); 
        /* if(Carte.getCarte().getCaseProche(c, Direction.Gauche).getCaseType().equals("herbe"))
            sprite.setViewport(new Rectangle2D(0,144,14,14)); ;*/
        
        /*
        //terre angle haut droit
        if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("eau")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("eau")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(81,1217,16,16)); 
        }      
        //terre angle haut gauche
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("eau")) && (c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("eau")) && (c.getVoisine(Direction.HautDroit) != null) && (c.getVoisine(Direction.HautDroit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(95,1217,16,16));  
        } 
        // terre gauche, angle haut gauche, haut
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(0,1217,16,16));  
        } 
        // terre droite, angle haut droit, haut
        else if((c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("terre")) && (c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautDroit) != null) && (c.getVoisine(Direction.HautDroit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(32,1217,16,16));  
        }
        // terre gauche, angle bas gauche, bas, haut gauche
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(0,1263,16,16));  
        } 
        // terre droite, angle bas droit, bas, haut droit
        else if((c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasDroit) != null) && (c.getVoisine(Direction.BasDroit).getCaseType().equals("terre"))&& (c.getVoisine(Direction.HautDroit) != null) && (c.getVoisine(Direction.HautDroit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(32,1263,16,16));  
        }
        // terre gauche, angle bas gauche, bas
        else if((c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(48,1231,16,16));  
        } 
        // terre droite, angle bas droit, bas
        else if((c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("terre")) && (c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasDroit) != null) && (c.getVoisine(Direction.BasDroit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(64,1231,16,16));  
        }*/
    }       

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
