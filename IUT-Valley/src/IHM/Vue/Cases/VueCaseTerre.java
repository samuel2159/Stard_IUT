/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.Vue.Cases;

import Metier.Carte.Carte;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Direction;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueCaseTerre extends CaseVue{
    
    public VueCaseTerre(CaseTerre c,ImageView sprite){
        super();
        sprite.setViewport(new Rectangle2D(16+1,7*16+1,14,14)); 
        /* if(Carte.getCarte().getCaseProche(c, Direction.Gauche).getCaseType().equals("herbe"))
            sprite.setViewport(new Rectangle2D(0,144,14,14)); ;*/
    }
}
