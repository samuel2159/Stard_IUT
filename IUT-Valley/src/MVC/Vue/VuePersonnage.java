/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue;

import Metier.Carte.Coordonnee;
import Metier.Personnage.Item.Mais;
import Metier.Personnage.Item.Panais;
import Metier.Personnage.Joueur;
import Metier.Personnage.Personnage;
import java.util.ArrayList;
import javafx.animation.TranslateTransition;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

/**
 *
 * @author Vincent Tantet
 */
public class VuePersonnage extends Parent{
    private ImageView perso;
    private ArrayList<String> touches = new ArrayList<>();
    private Scene scene;
    private boolean animationFini= true; //permet de garder une animation fluide sans faire bouger le perso avant la fin de l'animation
    private Personnage personnage;
    private VueInventaire inventaire;
    
    private boolean inventaireOpen = false;
    
    public VuePersonnage(Scene scene,Personnage p){
        this.scene = scene;
        personnage = new Joueur(new Coordonnee(0,0));
        try{
            p.getInventaire().ajouter(0,new Panais());
            
                for(int i=0;i<15;i++)
                    p.getInventaire().ajouter(0, new Mais());
                for(int i=0;i<15;i++)
                    p.getInventaire().ajouter(0, new Panais());
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        touches.add("Z");//avancer
        touches.add("Q");//gauche
        touches.add("S");//reculer
        touches.add("D");//droite
        touches.add("I");//inventaire
        
        //ajout du sprite
        perso = new ImageView(new Image("Ressources/Personnages/Sebastian.png"));
        perso.setViewport(new Rectangle2D(0,0,16,32)); //découpage du sprite voulu
        perso.setFitWidth(16);
        perso.setPreserveRatio(true);
        this.getChildren().add(perso);
        
        this.setTranslateX(46);
        this.setTranslateY(32);
        
        this.setOnKeyPressed(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent ke){
                if (animationFini){
                    for(String touche: touches){
                        if(touche.equals(ke.getText().toUpperCase())){
                            deplacement(touche);
                        }
                    }
                }
            }
        });
    }
    /**
     * Permet de gérer les déplacements
     * @param touche Touche appuyée
     */
    public void deplacement(String touche){
        animationFini = false;
        IntegerProperty vitesse = new SimpleIntegerProperty(0);
        double direction = 0;
        int positionY = 0;
        String axe = "X";
        switch (touche){
            case "Z": direction = -0.04; positionY = 65; axe = "Y"; break;
            case "Q": direction = -0.04; positionY = 97; break;
            case "S": direction = 0.04; positionY = 0; axe = "Y"; break;
            case "D": direction = 0.04; positionY = 33; break;
            case "I": 
                if(!inventaireOpen){
                     inventaire = new VueInventaire(scene, personnage);
                     this.getChildren().add(inventaire);
                     
                     inventaireOpen = true;
                }
                else{
                    this.getChildren().remove(inventaire);
                    inventaireOpen = false;
                }
                     
            break;
        }
        vitesse.bind(scene.heightProperty().multiply(direction));
        perso.setViewport(new Rectangle2D(16,positionY,16,32)); //le perso commance a marcher
        TranslateTransition tt1 = new TranslateTransition(Duration.millis(200), this);
        if (axe.equals("X")){
            tt1.setByX(vitesse.getValue());
        }
        else{
            tt1.setByY(vitesse.getValue());
        }
        
        //TranslateTransition tt2 = new TranslateTransition(Duration.millis(10), this);
        
        TranslateTransition tt3 = new TranslateTransition(Duration.millis(200), this);
        if (axe.equals("X")){
            tt3.setByX(vitesse.getValue());
        }
        else{
            tt3.setByY(vitesse.getValue());
        }
        tt1.setOnFinished(new EventHandler<ActionEvent>() { 
            @Override 
            public void handle(ActionEvent actionEvent) { 
                perso.setViewport(new Rectangle2D(48,perso.getViewport().getMinY(),16,32)); //le perso fait une pause
                tt3.play();
            } 
        });
        /*tt2.setOnFinished(new EventHandler<ActionEvent>() { 
            @Override 
            public void handle(ActionEvent actionEvent) { 
                perso.setViewport(new Rectangle2D(48,perso.getViewport().getMinY(),16,32)); //le perso fait le 2e pas
                tt3.play();
            } 
        });*/
        tt3.setOnFinished(new EventHandler<ActionEvent>() { 
            @Override 
            public void handle(ActionEvent actionEvent) { 
                perso.setViewport(new Rectangle2D(0,perso.getViewport().getMinY(),16,32)); //le perso retourne à son etat normal
                animationFini = true;
            } 
        });
        tt1.play();
    }
    
    public ImageView getPerso(){
        return perso;
    }
    
    public Personnage getPersonnage(){
        return personnage;
    }
}
