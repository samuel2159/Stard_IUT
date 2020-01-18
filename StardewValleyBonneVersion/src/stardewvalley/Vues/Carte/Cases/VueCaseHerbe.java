/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.Cases;

import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Direction;
import javafx.geometry.Rectangle2D;
import stardewvalley.Metier.Carte.Cases.Case;

/**
 *
 * @author telli
 */
public class VueCaseHerbe extends VueCase{
    
    public VueCaseHerbe(Case c){
        super(c);       
        
        //angle haut droit
        if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("herbe")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(0,160,14,14));               
             this.setRotate(180);
        }      
        //angle haut gauche
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("herbe")) && (c.getVoisine(Direction.BasDroite) != null) && (c.getVoisine(Direction.BasDroite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(0,160,14,14));               
             this.setRotate(90);
        }       
        //angle bas gauche
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.BasGauche) != null) && (c.getVoisine(Direction.BasGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(32,160,14,14));               
             this.setRotate(180);
        }     
        //angle bas droit
        else if((c.getVoisine(Direction.Bas) != null) && (c.getVoisine(Direction.Bas).getCaseType().equals("terre")) && (c.getVoisine(Direction.Droite) != null) && (c.getVoisine(Direction.Droite).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(32,160,14,14));               
             this.setRotate(90);
        }  
        //angle haut gauche droit
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("terre")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("terre")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
             this.setViewport(new Rectangle2D(32,160,14,14));               
             this.setRotate(270);
        }          
        //herbe à droite d'un angle haut droit
        else if((c.getVoisine(Direction.Haut) != null) && (c.getVoisine(Direction.Haut).getCaseType().equals("herbe")) && (c.getVoisine(Direction.Gauche) != null) && (c.getVoisine(Direction.Gauche).getCaseType().equals("herbe")) && (c.getVoisine(Direction.HautGauche) != null) && (c.getVoisine(Direction.HautGauche).getCaseType().equals("terre"))){
                this.setViewport(new Rectangle2D(49,160,14,14));
                this.setRotate(0);
                //----------------A changer
        }   
        //terre à droite
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Droite) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Droite).getCaseType().equals("terre"))
             this.setViewport(new Rectangle2D(0,144,14,14));      
        
        //terre à gauche
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Gauche) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Gauche).getCaseType().equals("terre"))
            this.setViewport(new Rectangle2D(48,144,14,14));
          
        //terre en bas
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Bas) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Bas).getCaseType().equals("terre")){
                this.setViewport(new Rectangle2D(48,144,14,14));
                this.setRotate(270);
        }   
        //terre en haut
        else if((Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Haut) != null) && Carte.getCarte().getNiveauActuel().getCaseProche(c, Direction.Haut).getCaseType().equals("terre")){
                this.setViewport(new Rectangle2D(48,144,14,14));
               this.setRotate(90);
        }
       
        else
             this.setViewport(new Rectangle2D(0,112,14,14)); 
    }    
    
}
