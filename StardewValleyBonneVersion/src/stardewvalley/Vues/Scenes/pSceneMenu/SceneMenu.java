/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pSceneMenu;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pSceneMenu.Composants.BoutonCreerPartie;
import stardewvalley.Vues.Scenes.pSceneMenu.Composants.BoutonQuitter;

/**
 *
 * @author ea058452
 */
public class SceneMenu extends Scene{
    //Creation de la scene
    public SceneMenu(Pane menu, double width, double height) {
        super(menu, width, height);
        /*Ajout du fond*/
            ImageView background = new ImageView(GestionnaireImages.getImage("Background"));
            background.fitWidthProperty().bind(this.widthProperty());
            background.fitHeightProperty().bind(this.heightProperty());    
            menu.getChildren().add(background);
        
        /*Ajout du logo*/
            ImageView logo = new ImageView(GestionnaireImages.getImage("Logo"));
            //liaison des dimensions avec celles de la fenetre
            logo.fitWidthProperty().bind(this.widthProperty().multiply(0.7));
            logo.fitHeightProperty().bind(this.heightProperty().multiply(0.6));
            //centrer le logo
            logo.translateXProperty().bind(this.widthProperty().subtract(logo.fitWidthProperty()).divide(2));
            menu.getChildren().add(logo);
            
            
        /*Ajout d'un Vbox pour les boutons du menu*/        
            VBox vb = new VBox();
                //CENTRER LE MENU
                vb.prefWidthProperty().bind(this.widthProperty().multiply(0.4));
                vb.prefHeightProperty().bind(this.heightProperty().subtract(logo.fitHeightProperty()));
                vb.translateXProperty().bind(this.widthProperty().subtract(vb.widthProperty()).divide(1.5));
                vb.translateYProperty().bind(logo.fitHeightProperty());
                vb.setSpacing(4);
                menu.getChildren().add(vb);
                                    
        //BOUTONS        
            /*Creation de partie*/
                vb.getChildren().add(new BoutonCreerPartie(this)); 
                
            /*Quitter la partie*/
                vb.getChildren().add(new BoutonQuitter(this));

    }
}
