/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.Cases;

import javafx.scene.image.ImageView;
import stardewvalley.Metier.Carte.Cases.Case;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author telli
 */
public abstract class VueCase extends ImageView {

    public VueCase(){
        this.setImage(GestionnaireImages.getImage("Cases"));
        this.setSmooth(true);
    }
    
    public abstract Case getCase();
    
    public abstract void update();
    
    public abstract void setCase(Case c);
}
