/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import MVC.Controleurs.ControleurPerso;
import MVC.Observers.Observer;
import MVC.Vue.Arbres.VueObjetPlace;
import MVC.Vue.Arbres.VueSapin;
import MVC.Vue.Cases.CaseVue;
import MVC.Vue.Cases.VueCaseEau;
import MVC.Vue.Cases.VueCaseHerbe;
import MVC.Vue.Cases.VueCaseTerre;
import MVC.Vue.VueObjetPlace.VueHerbe;
import MVC.Vue.VueInventaire;
import MVC.Vue.VueItem;
import MVC.Vue.VueObjetPlace.VueLit;
import MVC.Vue.VueObjetPlace.VueRocher;
import MVC.Vue.VuePerso;
import MVC.Vue.VuePersonnage;
import Metier.Carte.Carte;
import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.CaseEau;
import Metier.Carte.Cases.CaseHerbe;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import Metier.Objet.Sapin;
import Metier.Personnage.Item.Panais;
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
public class MenuJeu extends Application implements Observer{
    
    Carte carte = Carte.getCarte();
    private Group root;
    private ImageView spriteJoueur = new ImageView(new Image("Ressources/Personnages/Sebastian.png"));
    private Scene scene;
    
    public void start(Stage primaryStage) {
        
        //Creation de la scene
        root = new Group();
        Scene scene = new Scene(root, 1100, 662);        
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(scene);    
        this.scene = scene;
        //Affichage de la carte
       
        //on ajoute toutes les cases de la carte dans le cadreillage
        Image sprites = new Image("Ressources/Map/spring.png"); 
                
        for(Case c : carte.getNiveauActuel().getCases().values()){             


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
            
            sprite.setSmooth(true);
            //-------------------------------------------------------
            
            //------------------Binding des sprites--------------
            sprite.fitHeightProperty().bind(scene.heightProperty().multiply(0.05));
            sprite.fitWidthProperty().bind(scene.heightProperty().multiply(0.05));
            
            sprite.layoutXProperty().bind(sprite.fitWidthProperty().multiply(c.getCoordonnee().getX()));
            sprite.layoutYProperty().bind(sprite.fitHeightProperty().multiply(c.getCoordonnee().getY()));
            root.getChildren().add(sprite);
        }    
            
            //-------------------------------------------------------         
                          
                //--------------------Ajout des objetPlace--------------------------
            for(Case c : carte.getNiveauActuel().getCases().values()){ 
                if(c.getObjetCorrespondant() != null){
                    VueObjetPlace objetVue = null;
                    //ImageView spriteObjet = new ImageView(sprites);                  

                   // spriteObjet.fitWidthProperty().bind(scene.widthProperty().multiply(0.05));
                   // spriteObjet.fitHeightProperty().bind(scene.widthProperty().multiply(0.05));                                   
                         
                    
                    if(c.getObjetCorrespondant().getType().equals("sapin"))
                       objetVue = new VueSapin(scene,sprites);
                    
                    if(c.getObjetCorrespondant().getType().equals("herbe"))
                       objetVue = new VueHerbe(scene,sprites);
                    
                    if(c.getObjetCorrespondant().getType().equals("rocher"))
                       objetVue = new VueRocher(scene,sprites);       
                    if(!c.getObjetCorrespondant().getType().equals("sapin")){
                        objetVue.layoutXProperty().bind(scene.heightProperty().multiply(0.05).multiply(c.getCoordonnee().getX()));
                        objetVue.layoutYProperty().bind(scene.heightProperty().multiply(0.05).multiply(c.getCoordonnee().getY()));
                    }
                    
                    else{
                        objetVue.layoutXProperty().bind(scene.heightProperty().multiply(0.05).multiply(c.getCoordonnee().getX()).subtract(scene.heightProperty().multiply(0.05).multiply(1.5)));
                        objetVue.layoutYProperty().bind(scene.heightProperty().multiply(0.05).multiply(c.getCoordonnee().getY()));                        
                    }

                    root.getChildren().add(objetVue);
                }
            
            

        }
            
        VueLit lit = new VueLit(scene);
        lit.getLit().fitHeightProperty().bind(scene.heightProperty().multiply(0.16));
        lit.getLit().fitWidthProperty().bind(scene.heightProperty().multiply(0.16));
        root.getChildren().add(lit);

        //ajout du perso
        
        VuePersonnage perso = new VuePersonnage(scene,new Joueur(new Coordonnee(0,0)));
        perso.getPerso().fitHeightProperty().bind(scene.heightProperty().multiply(0.16));
        perso.getPerso().fitWidthProperty().bind(scene.heightProperty().multiply(0.16));
        root.getChildren().add(perso);       
       
        //test inventaire
        // i = new VueInventaire(scene,perso.getPersonnage());
        //root.getChildren().add(i);
        
        /*
        Joueur j = new Joueur(new Coordonnee(5,5));
        ControleurPerso cp = new ControleurPerso(j);
        //cp.register(this);
        VuePerso joueur = new VuePerso(j,scene,spriteJoueur,cp);    
        
        root.getChildren().add(spriteJoueur);
*/
        primaryStage.show();
       // joueur.requestFocus();
        perso.requestFocus();
    }
    
    public void update(String message){
        if(message.equals("joueur")){/*
            root.getChildren().remove(spriteJoueur); 
            root.getChildren().add(spriteJoueur);*/
        }
    }
    
    public void printInventaire(Personnage personnage){
        root.getChildren().add(new VueInventaire(scene,personnage));
    }
    
}
