/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte;

import javafx.scene.layout.Pane;

/**
 *
 * @author simonetma
 */
public class VueCarteObjets extends Pane {
    
    private VueCarte vueCarte;
    
    public VueCarteObjets(VueCarte vueCarte) {
        this.vueCarte = vueCarte;
        this.prefHeightProperty().bind(vueCarte.heightProperty());
        this.prefWidthProperty().bind(vueCarte.widthProperty());
    }
}
