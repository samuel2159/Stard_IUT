/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte;

import javafx.scene.layout.Pane;
import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Vues.Scenes.pScenePartie.ScenePartie;

/**
 *
 * @author simonetma
 */
public class VueCarte extends Pane {
    
    private ScenePartie scene;
    private VueCarteFond vueCarteFond;
    private VueCarteObjets vueCarteObjets;
    
    public VueCarte(ScenePartie scene, Carte carte) {
        
        
        this.prefHeightProperty().bind(scene.heightProperty());
        this.prefWidthProperty().bind(scene.widthProperty());
        
        this.vueCarteFond = new VueCarteFond(this);
        this.vueCarteObjets = new VueCarteObjets(this);
        
        
        this.getChildren().addAll(this.vueCarteFond,this.vueCarteObjets);
        
    }
    
}