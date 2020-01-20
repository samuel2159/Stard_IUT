/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire.Objet;

import javafx.scene.image.ImageView;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author telli
 */
public class VueObjet extends ImageView{
    
    Objet o;
    
    public VueObjet(Objet o){
        this.o = o;
        this.setImage(GestionnaireImages.getImage("Items"));
        this.setSmooth(true);
    }
    
    public Objet getObjet(){
        return o;
    }
    
}
