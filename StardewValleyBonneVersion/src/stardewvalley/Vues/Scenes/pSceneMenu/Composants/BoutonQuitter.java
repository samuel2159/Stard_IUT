/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pSceneMenu.Composants;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pSceneMenu.SceneMenu;

/**
 *
 * @author simonetma
 */
public class BoutonQuitter extends ImageView{
    
    private SceneMenu scene;
    
    public BoutonQuitter(SceneMenu scene) {
        super(GestionnaireImages.getImage("Quitter"));
        //Gestion taille
        this.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
        this.fitHeightProperty().bind(scene.heightProperty().divide(6)); 
        //Gestion du click
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Platform.exit();
            }
        });
    }
    
}
