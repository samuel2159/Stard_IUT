/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import MVC.ControleurLogo;
import MVC.Listener.HandlerLogo;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author telli
 */
public class MenuPrincipal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creation de la scene
        Pane monLayout = new Pane();
        Scene scene = new Scene(monLayout, 1100, 662);        
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(scene);       
        
//IMAGES------------------------------------------------------------------------------------        
        
        /*Ajout du fond*/
            ImageView background = new ImageView(new Image("Ressources/MainMenu/background.png"));
            background.fitWidthProperty().bind(scene.widthProperty());
            background.fitHeightProperty().bind(scene.heightProperty());    
            monLayout.getChildren().add(background);
        
        /*Ajout du logo*/
            ImageView logo = new ImageView(new Image("Ressources/MainMenu/logo.png"));
            //liaison des dimensions avec celles de la fenetre
            logo.fitWidthProperty().bind(scene.widthProperty().multiply(0.7));
            logo.fitHeightProperty().bind(scene.heightProperty().multiply(0.6));
            //HANDLER
                HandlerLogo handlerlogo = new HandlerLogo(this);
                logo.setOnMouseClicked(handlerlogo);
                handlerlogo.ajouterControleur(new ControleurLogo());
            //CENTRER LE LOGO
                logo.translateXProperty().bind(scene.widthProperty().subtract(logo.fitWidthProperty()).divide(2));
        monLayout.getChildren().add(logo);
     
        /*Ajout d'un Vbox pour les boutons du menu*/        
            VBox vb = new VBox();
                //CENTRER LE MENU
                vb.prefWidthProperty().bind(scene.widthProperty().multiply(0.4));
                vb.prefHeightProperty().bind(scene.heightProperty().subtract(logo.fitHeightProperty()));
                vb.translateXProperty().bind(scene.widthProperty().subtract(vb.widthProperty()).divide(1.5));
                vb.translateYProperty().bind(logo.fitHeightProperty());
                vb.setSpacing(4);
        monLayout.getChildren().add(vb);
        
                                            //IntegerProperty buttonSize = new IntegerProperty() ;*/
        
//BOUTONS        
        /*Creation de partie*/
            ImageView creerPartie = new ImageView(new Image("Ressources/MainMenu/creer.png"));
            
            //liaison des dimensions avec celles de la fenetre
            creerPartie.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
            creerPartie.fitHeightProperty().bind(scene.heightProperty().divide(6)); 
            vb.getChildren().add(creerPartie);        
        /*Quitter la partie*/
            ImageView fermerJeu = new ImageView(new Image("Ressources/MainMenu/quitter.png"));
            fermerJeu.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
            fermerJeu.fitHeightProperty().bind(scene.heightProperty().divide(6));        
            vb.getChildren().add(fermerJeu);
        
//ACTIONS------------------------------------------------------------------------------------        
        creerPartie.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                MenuPerso m = new MenuPerso();
                m.start(primaryStage);
            }
        });

        
        fermerJeu.setOnMouseClicked(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                Platform.exit();
            }
        });


//SHOW        
        primaryStage.show(); 
     
    }    
}
