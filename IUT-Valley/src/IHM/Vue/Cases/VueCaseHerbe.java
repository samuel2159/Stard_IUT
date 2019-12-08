/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.Vue.Cases;

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
        
        //if((Carte.getCarte().getCaseProche(c, Direction.BasGauche) != null) && (Carte.getCarte().getCaseProche(Carte.getCarte().getCaseProche(c, Direction.BasGauche),Direction.BasGauche) != null) && Carte.getCarte().getCaseProche(c, Direction.BasGauche).equals("terre") && (Carte.getCarte().getCaseProche(Carte.getCarte().getCaseProche(c, Direction.BasGauche),Direction.BasGauche).getCaseType().equals("terre"))){
            //sprite.setViewport(new Rectangle2D(0,144,14,14));        
           // sprite.setViewport(new Rectangle2D(97,785,14,14));        
            //sprite.setRotate(90);
        //}           
        if(false);
        //terre à droite
        else if((Carte.getCarte().getCaseProche(c, Direction.Droit) != null) && Carte.getCarte().getCaseProche(c, Direction.Droit).getCaseType().equals("terre"))
             sprite.setViewport(new Rectangle2D(0,144,14,14));      
        
        //terre à gauche
        else if((Carte.getCarte().getCaseProche(c, Direction.Gauche) != null) && Carte.getCarte().getCaseProche(c, Direction.Gauche).getCaseType().equals("terre"))
            sprite.setViewport(new Rectangle2D(48,144,14,14));
           
/*
        //terre en bas
        else if((Carte.getCarte().getCaseProche(c, Direction.Bas) != null) && Carte.getCarte().getCaseProche(c, Direction.Bas).getCaseType().equals("terre")){
                sprite.setViewport(new Rectangle2D(48,144,14,14));
                sprite.setRotate(270);
        }   
        //terre en haut
        else if((Carte.getCarte().getCaseProche(c, Direction.Haut) != null) && Carte.getCarte().getCaseProche(c, Direction.Haut).getCaseType().equals("terre")){
                sprite.setViewport(new Rectangle2D(48,144,14,14));
               sprite.setRotate(90);
        }
    */    
        else
             sprite.setViewport(new Rectangle2D(0,112,14,14)); 
    }    
    
}
