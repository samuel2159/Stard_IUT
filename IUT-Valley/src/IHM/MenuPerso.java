/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import MVC.Listener.HandlerPerso;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author ea058452
 */
public class MenuPerso extends Application {
    
     public void start(Stage primaryStage) {
        
        //Creation de la scene
        Pane monLayout = new Pane();
        Scene scene = new Scene(monLayout, 1100, 662);        
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(scene);          
        
//IMAGES------------------------------------------------------------------------------------            
        /*Ajout du fond*/
        
        ImageView background = new ImageView(new Image("Ressources/MenuPerso/fond.png"));
        background.fitWidthProperty().bind(scene.widthProperty());
        background.fitHeightProperty().bind(scene.heightProperty());    
        monLayout.getChildren().add(background);
 //GROS PROBLEME ICI HELP LE PERSO NE SAFFICHE PAS, LE BOUTON NON PLUS       
         /*Ajout du perso*/
            ImageView perso = new ImageView(new Image("Ressources/MenuPerso/perso.png"));
            //liaison des dimensions avec celles de la fenetre
            perso.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
            perso.fitHeightProperty().bind(scene.heightProperty().multiply(0.35));
            perso.layoutYProperty().bind(scene.heightProperty().multiply(0.4));
            //HANDLER
                HandlerPerso handlerperso = new HandlerPerso(this);
                perso.setOnMouseClicked(handlerperso);
                
            //CENTRER LE LOGO
                perso.translateXProperty().bind(scene.widthProperty().subtract(perso.fitWidthProperty()).divide(2));
                monLayout.getChildren().add(perso);
        
        
//BOUTTONS------------------------------------------------------------------------------------                  
        ImageView ok = new ImageView(new Image("Ressources/MenuPerso/ok.png"));;
        //liaison des dimensions avec celles de la fenetre
        ok.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
        ok.fitHeightProperty().bind(scene.heightProperty().divide(6));
        
        ok.layoutXProperty().bind(scene.widthProperty().subtract(ok.fitWidthProperty().multiply(1.2)));
        ok.layoutYProperty().bind(scene.heightProperty().subtract(ok.fitHeightProperty().multiply(1.2)));
        
        monLayout.getChildren().add(ok);
//ACTIONS------------------------------------------------------------------------------------                   
        ok.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                
                MenuJeu m = new MenuJeu();
                m.start(primaryStage);
                //A faire ouvrir une fenetre de creation de personnage
                
            }
        });
      
        primaryStage.show();
     }
     
}
