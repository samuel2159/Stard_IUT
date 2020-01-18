/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pScenePartie;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import stardewvalley.Metier.Partie;
import stardewvalley.Vues.Carte.VueCarte;

/**
 *
 * @author simonetma
 */
public class ScenePartie extends Scene {
    
    private VueCarte vueCarte;
    
    public ScenePartie(Pane ferme, double width, double height) {
        super(ferme, width, height);
        this.vueCarte = new VueCarte(this,Partie.getPartie().getCarte());
        ferme.getChildren().add(vueCarte);
    }
}
