/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.ObjetsPlaces;

import stardewvalley.Metier.Objet.ObjetsPlace.ObjetPlace;
import stardewvalley.Vues.Carte.VueCarteObjets;

/**
 *
 * @author telli
 */
public class VueObjetPlaceFabrique {
    
    public static VueObjetPlace create(VueCarteObjets v,ObjetPlace o){
        
        VueObjetPlace retour = null;
        switch(o.getType()){
            
            case "sapin":
                    retour = new VueSapin(o,v);
            break;
            case "rocher":
                retour = new VueRocher(o,v);
            break;
            
        }
        return retour;
    }
    
}
