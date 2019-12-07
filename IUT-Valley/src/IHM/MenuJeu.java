/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Carte.Carte;
import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.Cote;
import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
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
        double percent = 0.08;
        //Affichage de la carte
       
        //on ajoute toutes les cases de la carte dans le cadreillage
        Image sprites = new Image("Ressources/Map/spring.png");
                
        for(Case c : carte.getCases().values()){             


            //----------------Generation du terrain---------------------------------
            
            //affectation des sprites des cases
            ImageView sprite = new ImageView(sprites);
            
            if(c.getCaseType().equals("terre"))
                sprite.setViewport(new Rectangle2D(16+1,7*16+1,14,14));
            if(c.getCaseType().equals("eau"))
                sprite.setViewport(new Rectangle2D(97,785,14,14)); 
            if(c.getCaseType().equals("herbe"))
                sprite.setViewport(new Rectangle2D(0,177,14,14));             
            //-------------------------------------------------------
            
            //------------------Binding des sprites--------------

            sprite.fitHeightProperty().bind(scene.heightProperty().multiply(percent));
            sprite.fitWidthProperty().bind(scene.heightProperty().multiply(percent));            
            
            sprite.layoutXProperty().bind(sprite.fitWidthProperty().multiply(c.getCoordonnee().getX()));
            sprite.layoutYProperty().bind(sprite.fitHeightProperty().multiply(c.getCoordonnee().getY()));
            root.getChildren().add(sprite);
            
            
            //-------------------------------------------------------
         
            //--------------------Ajout des objetPlace--------------------------
            if(c.getObjetCorrespondant() != null){
                ImageView spriteObjet = new ImageView(sprites);
                
                spriteObjet.fitHeightProperty().bind(scene.heightProperty().multiply(percent));
                spriteObjet.fitWidthProperty().bind(scene.heightProperty().multiply(percent));

                spriteObjet.layoutXProperty().bind(spriteObjet.fitWidthProperty().multiply(c.getCoordonnee().getX()));
                spriteObjet.layoutYProperty().bind(spriteObjet.fitHeightProperty().multiply(c.getCoordonnee().getY()));
                           
              
                //AutoTile du sapin                
                if(c.getObjetCorrespondant().getType().equals("sapin")){
                    if((c.getCase(Cote.BasGauche).getObjetCorrespondant() != null) && (c.getCase(Cote.Gauche).getObjetCorrespondant() != null) && (c.getCase(Cote.Bas).getObjetCorrespondant() != null)){
                        if(c.getCase(Cote.BasGauche).getObjetCorrespondant().getType().equals("sapin") && c.getCase(Cote.Gauche).getObjetCorrespondant().getType().equals("sapin") && c.getCase(Cote.Bas).getObjetCorrespondant().getType().equals("sapin"))
                            ;
                        else
                            spriteObjet.setViewport(new Rectangle2D(0,0,16,16));
                    }
                    else
                        spriteObjet.setViewport(new Rectangle2D(0,0,16,16));
                }                
                       
                root.getChildren().add(spriteObjet);
            }
            

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
