/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pScenePerso;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pSceneMenu.Composants.BoutonCreerPartie;
import stardewvalley.Vues.Scenes.pScenePerso.Composants.BoutonOk;

/**
 *
 * @author ea058452
 */
public class ScenePerso extends Scene{
    
    public ScenePerso(Pane perso, double width, double height) {
        super(perso, width, height);
                     
//IMAGES------------------------------------------------------------------------------------            
       /*Ajout du fond*/
            ImageView background = new ImageView(GestionnaireImages.getImage("BackgroundPerso"));
            background.fitWidthProperty().bind(this.widthProperty());
            background.fitHeightProperty().bind(this.heightProperty());    
            perso.getChildren().add(background);
       
         /*Ajout du perso*/
            ImageView sebastianPerso = new ImageView(GestionnaireImages.getImage("SebastianPortrait"));
            sebastianPerso.fitWidthProperty().bind(this.widthProperty().multiply(0.1));
            sebastianPerso.fitHeightProperty().bind(this.heightProperty().multiply(0.1));
           
            //centrer le logo
            sebastianPerso.translateXProperty().bind(this.widthProperty().subtract(sebastianPerso.fitWidthProperty()).divide(2));
            sebastianPerso.translateYProperty().bind(this.heightProperty().subtract(sebastianPerso.fitHeightProperty()).divide(6));
            perso.getChildren().add(sebastianPerso);
            
            
       /*Ajout d'un Vbox pour les boutons du menu*/        
            VBox vb = new VBox();
                //CENTRER LE MENU
                vb.prefWidthProperty().bind(this.widthProperty().multiply(0.4));
                vb.prefHeightProperty().bind(this.heightProperty().subtract(sebastianPerso.fitHeightProperty()));
                vb.translateXProperty().bind(this.widthProperty().subtract(vb.widthProperty()).divide(1.5));
                vb.translateYProperty().bind(sebastianPerso.fitHeightProperty());
                vb.setSpacing(4);
                perso.getChildren().add(vb);
      //BOUTONS        
                 
        /*Ajout du sprite perso*/
            ImageView sebastianSprites = new ImageView(GestionnaireImages.getImage("SebastianSprites"));
            sebastianSprites.fitWidthProperty().bind(this.widthProperty().multiply(0.2));
            sebastianSprites.fitHeightProperty().bind(this.heightProperty().multiply(0.3));
            sebastianSprites.translateYProperty().bind(this.heightProperty().subtract(sebastianPerso.fitHeightProperty()).divide(4));
            vb.getChildren().add(sebastianSprites);
            
            /*Creation de partie*/
            BoutonOk ok=new BoutonOk(this);
            ok.translateXProperty().bind(this.widthProperty().subtract(sebastianPerso.fitWidthProperty()).divide(16));
            ok.translateYProperty().bind(this.heightProperty().subtract(sebastianPerso.fitHeightProperty()).divide(3.5));
            vb.getChildren().add(ok); 
   }
}
