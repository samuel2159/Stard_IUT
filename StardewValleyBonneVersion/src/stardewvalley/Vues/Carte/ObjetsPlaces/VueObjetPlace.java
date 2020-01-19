/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.ObjetsPlaces;

import javafx.scene.image.ImageView;
import stardewvalley.Metier.Objet.ObjetPlace;
import stardewvalley.Vues.Carte.VueCarteObjets;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author telli
 */
public abstract class VueObjetPlace extends ImageView{
    
    private ObjetPlace o;
    
    public VueObjetPlace(ObjetPlace o,VueCarteObjets vueCarteObjet){
        this.o = o;
        this.setImage(GestionnaireImages.getImage("ObjetPlaces"));
        this.setSmooth(true);
    }
    
}
