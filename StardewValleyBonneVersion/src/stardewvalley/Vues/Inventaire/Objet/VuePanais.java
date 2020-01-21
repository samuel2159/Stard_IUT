/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire.Objet;

import javafx.geometry.Rectangle2D;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 *
 * @author telli
 */
public class VuePanais extends VueObjet {

    public VuePanais(Objet o) {
        super(o);
        this.setViewport(new Rectangle2D(0, 16, 16, 16));
        this.setFitHeight(65);
        this.setFitWidth(65);
    }
    
}
