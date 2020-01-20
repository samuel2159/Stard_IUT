/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.ObjetsPlaces;

import javafx.geometry.Rectangle2D;
import stardewvalley.Metier.Objet.ObjetPlace;
import stardewvalley.Vues.Carte.VueCarteObjets;

/**
 *
 * @author telli
 */
public class VueRocher extends VueObjetPlace{
    
    public VueRocher(ObjetPlace o,VueCarteObjets vueCarteObjet) {
        super(o, vueCarteObjet);
        this.setViewport(new Rectangle2D(368, 1056, 16, 16));       
        this.fitWidthProperty().bind(vueCarteObjet.heightProperty().multiply(0.05));  
        this.fitHeightProperty().bind(vueCarteObjet.heightProperty().multiply(0.05));         
    }
    
}
