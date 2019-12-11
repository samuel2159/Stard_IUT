/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import IHM.Vue.Cases.CaseVue;
import IHM.Vue.Cases.VueCaseEau;
import IHM.Vue.Cases.VueCaseHerbe;
import IHM.Vue.Cases.VueCaseTerre;
import IHM.Vue.VuePerso;
import IHM.Vue.VuePersonnage;
import Metier.Carte.Carte;
import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.CaseEau;
import Metier.Carte.Cases.CaseHerbe;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import Metier.Personnage.Joueur;
import Metier.Personnage.Personnage;
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
 * @modify Vincent Tantet
 */
public class MenuJeu extends Application{
    
    Carte carte = Carte.getCarte();
    
    public void start(Stage primaryStage) {
        
        //Creation de la scene
        Group root = new Group();
        Scene scene = new Scene(root, 1100, 662);        
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(scene);    
        
        //Affichage de la carte
       
        //on ajoute toutes les cases de la carte dans le cadreillage
        Image sprites = new Image("Ressources/Map/spring.png");
                
        for(Case c : carte.getCases().values()){             


            //----------------Generation du terrain---------------------------------
            
            //affectation des sprites des cases
            ImageView sprite = new ImageView(sprites);
            
            CaseVue casevue;
            
            if(c.getCaseType().equals("terre"))
                casevue = new VueCaseTerre((CaseTerre) c,sprite);
            
            if(c.getCaseType().equals("eau"))
                casevue = new VueCaseEau((CaseEau) c,sprite);                   
            
            if(c.getCaseType().equals("herbe"))
                casevue = new VueCaseHerbe((CaseHerbe) c,sprite);
                               
            //-------------------------------------------------------
            
            //------------------Binding des sprites--------------
            sprite.fitHeightProperty().bind(scene.heightProperty().multiply(0.08));
            sprite.fitWidthProperty().bind(scene.heightProperty().multiply(0.08));
            
            sprite.layoutXProperty().bind(sprite.fitWidthProperty().multiply(c.getCoordonnee().getX()));
            sprite.layoutYProperty().bind(sprite.fitHeightProperty().multiply(c.getCoordonnee().getY()));
            root.getChildren().add(sprite);
            
            
            //-------------------------------------------------------
         
            //--------------------Ajout des objetPlace--------------------------
            if(c.getObjetCorrespondant() != null){
                ImageView spriteObjet = new ImageView(sprites);
                
                spriteObjet.fitHeightProperty().bind(scene.heightProperty().multiply(0.08));
                spriteObjet.fitWidthProperty().bind(scene.heightProperty().multiply(0.08));

                spriteObjet.layoutXProperty().bind(spriteObjet.fitWidthProperty().multiply(c.getCoordonnee().getX()));
                spriteObjet.layoutYProperty().bind(spriteObjet.fitHeightProperty().multiply(c.getCoordonnee().getY()));
                           
              
                //AutoTile du sapin                
                if(c.getObjetCorrespondant().getType().equals("sapin")){
                    //if(!(c.getCase(Cote.BasDroit).getObjetCorrespondant() != null) && (c.getCase(Cote.Droit) != null) && !(c.getCase(Cote.Bas) != null)){
                        //if(!(c.getCase(Cote.BasDroit).getObjetCorrespondant().getType().equals("sapin")))
                            spriteObjet.setViewport(new Rectangle2D(0,0,16,16));
                   // }
                }                
                       
                root.getChildren().add(spriteObjet);
            }
            

        }

        //ajout du perso
        
        VuePersonnage perso = new VuePersonnage(scene);
        perso.getPerso().fitHeightProperty().bind(scene.heightProperty().multiply(0.16));
        perso.getPerso().fitWidthProperty().bind(scene.heightProperty().multiply(0.16));
        root.getChildren().add(perso);
        
       /* ImageView spriteJoueur = new ImageView(new Image("Ressources/Personnages/Sebastian.png"));
        VuePerso joueur = new VuePerso(new Joueur(new Coordonnee(5,5)),spriteJoueur);        
        root.getChildren().add(spriteJoueur);*/
        
        primaryStage.show();
        perso.requestFocus();
    }
}
