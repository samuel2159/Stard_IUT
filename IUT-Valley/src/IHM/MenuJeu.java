/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Carte.Carte;
import Metier.Carte.Case;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Astérisk
 */
public class MenuJeu extends Application{
    
    Carte carte = Carte.getCarte();
    
    public void start(Stage primaryStage) {
        
        //Creation de la scene
        Group root = new Group();
        Scene scene = new Scene(root, 1100, 662);        
        primaryStage.setTitle("Fenetre de jeu");
        primaryStage.setScene(scene);        
        
        //Affichage de la carte
       
        //on ajoute toutes les cases de la carte dans le cadreillage
        
        for(Case c : carte.getCases().values()){
            Image sprite = new Image("Ressources/Map/"+c.getObjetCorrespondant().getType() + ".png");
            ImageView uneCase = new ImageView(sprite);
    
            uneCase.fitHeightProperty().bind(sprite.heightProperty());
            uneCase.fitWidthProperty().bind(sprite.widthProperty());
//            uneCase.fitHeightProperty().setValue(sprite.getHeight()+0.05*scene.getHeight());
  //          uneCase.fitWidthProperty().setValue(sprite.getWidth()+0.05*scene.getWidth());
            
            uneCase.setLayoutX(c.getCoordonnee().getX()*uneCase.getFitWidth());
            uneCase.setLayoutY(c.getCoordonnee().getY()*uneCase.getFitHeight());
            root.getChildren().add(uneCase);      

        }

        

        
        /*Ajout du perso*/
        ImageView perso = new ImageView(new Image("Ressources/Map/perso.png"));
        //liaison des dimensions avec celles de la fenetre
        perso.fitWidthProperty().bind(scene.widthProperty().multiply(0.12));
        perso.fitHeightProperty().bind(scene.heightProperty().multiply(0.12));
        //On ajuste la position du perso :
        perso.layoutXProperty().bind(scene.widthProperty().multiply(0.8));
        perso.layoutYProperty().bind(scene.widthProperty().multiply(0.3));
        root.getChildren().add(perso);

 
        
        primaryStage.show();
    }
}
