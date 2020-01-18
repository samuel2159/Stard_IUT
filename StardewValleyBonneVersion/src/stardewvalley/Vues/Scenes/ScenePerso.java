/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author ea058452
 */
public class ScenePerso extends Scene{
    
    public ScenePerso(Pane perso, double width, double height) {
        super(perso, width, height);
                     
//IMAGES------------------------------------------------------------------------------------            
        /*Ajout du fond*/
        
        /*ImageView background = new ImageView(new Image("Ressources/MenuPerso/fond.png"));
        background.fitWidthProperty().bind(this.widthProperty());
        background.fitHeightProperty().bind(this.heightProperty());    
        perso.getChildren().add(background);*/
        
         /*Ajout du perso*/
        //ImageView personnage = new ImageView(new Image("Ressources/MenuPerso/perso.png"));
        //liaison des dimensions avec celles de la fenetre
            /*personnage.fitWidthProperty().bind(this.widthProperty().multiply(0.2));
            personnage.fitHeightProperty().bind(this.heightProperty().multiply(0.35));
            personnage.layoutYProperty().bind(this.heightProperty().multiply(0.4));
               
            //CENTRER LE LOGO
                perso.translateXProperty().bind(this.widthProperty().subtract(personnage.fitWidthProperty()).divide(2));
                perso.getChildren().add(perso);*/
        
        
//BOUTTONS------------------------------------------------------------------------------------                  
        /*ImageView ok = new ImageView(new Image("Ressources/MenuPerso/ok.png"));;
        //liaison des dimensions avec celles de la fenetre
        ok.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
        ok.fitHeightProperty().bind(scene.heightProperty().divide(6));
        
        ok.layoutXProperty().bind(scene.widthProperty().subtract(ok.fitWidthProperty().multiply(1.2)));
        ok.layoutYProperty().bind(scene.heightProperty().subtract(ok.fitHeightProperty().multiply(1.2)));
        
        monLayout.getChildren().add(ok);*/
//ACTIONS------------------------------------------------------------------------------------                   
        /*ok.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                
                MenuJeu m = new MenuJeu();
                m.start(primaryStage);
                //A faire ouvrir une fenetre de creation de personnage
                
            }
        });*/
   }
}
