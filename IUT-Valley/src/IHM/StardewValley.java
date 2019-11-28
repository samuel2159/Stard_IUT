/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author telli
 */
public class StardewValley extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creation de la scene
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 562);        
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(scene);        
        
        /*Ajout du fond*/
        ImageView background = new ImageView(new Image("Ressources/MainMenu/background.png"));
        background.fitWidthProperty().bind(scene.widthProperty());
        background.fitHeightProperty().bind(scene.heightProperty());    
        root.getChildren().add(background);
        
        /*Ajout du logo*/
        ImageView logo = new ImageView(new Image("Ressources/MainMenu/logo.png"));
        //liaison des dimensions avec celles de la fenetre
        logo.fitWidthProperty().bind(scene.widthProperty().multiply(0.7));
        logo.fitHeightProperty().bind(scene.heightProperty().multiply(0.7));
        //On centre le logo :
        logo.layoutXProperty().bind(scene.widthProperty().multiply(0.15));
        root.getChildren().add(logo);
     
        
        //Creation du menu
        VBox vb = new VBox();//Contient les différents boutons du menu
        //On centre le menu
        
        vb.spacingProperty().bind(scene.heightProperty().divide(80));
        vb.layoutXProperty().bind(scene.widthProperty().multiply(0.2));
        vb.layoutYProperty().bind(scene.heightProperty().multiply(0.67));
        root.getChildren().add(vb);
        
        //IntegerProperty buttonSize = new IntegerProperty() ;
        
        /*Creation de partie*/
        Button creerPartie = new Button();
        creerPartie.setText("Créer une partie");
        //liaison des dimensions avec celles de la fenetre
        creerPartie.minWidthProperty().bind(scene.widthProperty().multiply(0.6));
        creerPartie.minHeightProperty().bind(scene.heightProperty().divide(6.5));
        
        vb.getChildren().add(creerPartie);
        
        /*Fermeture du jeu*/
        Button fermerJeu = new Button();
        fermerJeu.setText("Quitter");
        fermerJeu.minWidthProperty().bind(scene.widthProperty().multiply(0.6));
        fermerJeu.minHeightProperty().bind(scene.heightProperty().divide(6.5));        
        vb.getChildren().add(fermerJeu);
        
        
        creerPartie.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //A faire ouvrir une fenetre de creation de personnage
            }
        });

        
        fermerJeu.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
