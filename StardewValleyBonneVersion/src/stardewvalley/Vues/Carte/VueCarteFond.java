/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte;

import javafx.scene.layout.GridPane;
import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Cases.Case;
import stardewvalley.Vues.Carte.Cases.VueCase;
import stardewvalley.Vues.Carte.Cases.VueCaseFabrique;

/**
 *
 * @author simonetma
 */
public class VueCarteFond extends GridPane {
    
    private VueCarte vueCarte;
    
    public VueCarteFond(VueCarte vueCarte) {
                
        
        this.vueCarte = vueCarte;
        this.prefHeightProperty().bind(vueCarte.heightProperty());
        this.prefWidthProperty().bind(vueCarte.widthProperty());
    
        this.setVgap(-1);
        this.setHgap(-1);
        
        this.affichage();
    }
    
    private void affichage() {
        for(Case c : Carte.getNiveauActuel().getCases()) {
            VueCase vue = VueCaseFabrique.create(c);
            vue.setFitWidth(35);
            vue.setFitHeight(35);
            //vue.fitHeightProperty().bind(this.heightProperty().multiply(0.05));
            //vue.fitWidthProperty().bind(this.heightProperty().multiply(0.05));
            this.add(vue, c.getCoordonnee().getX(), c.getCoordonnee().getY());
        }
    }
    
}
