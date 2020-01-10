/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue.Cases;

import Metier.Carte.Carte;
import Metier.Carte.Cases.CaseHerbe;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Direction;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueCaseHerbe extends CaseVue{
    
    public VueCaseHerbe(CaseHerbe c,ImageView sprite){
        super();       
        
        //angle haut droit
        if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("herbe")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(0,160,14,14));               
             sprite.setRotate(180);
        }      
        //angle haut gauche
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("herbe")) && (c.getVoisine(Direction.BasDroit) != null) && (c.getVoisine(Direction.BasDroit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(0,160,14,14));               
             sprite.setRotate(90);
        }       
        //angle bas gauche
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(32,160,14,14));               
             sprite.setRotate(180);
        }     
        //angle bas droit
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.Droit) != null) && (c.getVoisine(Direction.Droit).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(32,160,14,14));               
             sprite.setRotate(90);
        }  
        //angle haut gauche droit
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             sprite.setViewport(new Rectangle2D(32,160,14,14));               
             sprite.setRotate(270);
        }          
        //herbe à droite d'un angle haut droit
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("herbe")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
                sprite.setViewport(new Rectangle2D(49,160,14,14));
                sprite.setRotate(0);
                //----------------A changer
        }   
        //terre à droite
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Droit) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Droit).getCaseType().equals("terre"))
             sprite.setViewport(new Rectangle2D(0,144,14,14));      
        
        //terre à gauche
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Gauche) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Gauche).getCaseType().equals("terre"))
            sprite.setViewport(new Rectangle2D(48,144,14,14));
          
        //terre en bas
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Bas) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Bas).getCaseType().equals("terre")){
                sprite.setViewport(new Rectangle2D(48,144,14,14));
                sprite.setRotate(270);
        }   
        //terre en haut
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Haut) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Haut).getCaseType().equals("terre")){
                sprite.setViewport(new Rectangle2D(48,144,14,14));
               sprite.setRotate(90);
        }
       
        else
             sprite.setViewport(new Rectangle2D(0,112,15,15)); 
    }    
    
}
