/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pHistoire;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pHistoire.Composants.BoutonFleche;
import stardewvalley.Vues.Scenes.pScenePerso.Composants.BoutonOk;

/**
 *
 * @author ea058452
 */
public class SceneHistoire extends Scene{
    
    public SceneHistoire(Pane histoire, double width, double height) {
        super(histoire, width, height);
                     
//IMAGES------------------------------------------------------------------------------------            
       /*Ajout du fond*/
            ImageView background = new ImageView(GestionnaireImages.getImage("Grandpere"));
            background.fitWidthProperty().bind(this.widthProperty());
            background.fitHeightProperty().bind(this.heightProperty());    
            histoire.getChildren().add(background);
            /*Creation de partie*/
           BoutonFleche fleche=new BoutonFleche(this);
           fleche.translateXProperty().bind(this.widthProperty().subtract(fleche.fitWidthProperty()).divide(1.09));
           fleche.translateYProperty().bind(this.heightProperty().subtract(fleche.fitHeightProperty()).divide(1.09));
           histoire.getChildren().add(fleche); 
   }
}
