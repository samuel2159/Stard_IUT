/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import stardewvalley.Metier.Mouvement;
import stardewvalley.Metier.Personnages.NomPersonnage;
import stardewvalley.Metier.Personnages.Personnage;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author ea058452
 */
public class VuePersonnage extends ImageView{
    
    private Personnage personnageModel;
    
    public VuePersonnage(Personnage personnage){
        this.personnageModel = personnage;        
        //ajout du sprite
        this.selectionImageSprite();         
       
    }
    
    private void selectionImageSprite() {
        Image sprite = null;
        NomPersonnage nom = this.personnageModel.getNom();
        switch(nom) {
            case Joueur: sprite = GestionnaireImages.getImage("Sebastian");
                    break;
            case Emily: sprite = GestionnaireImages.getImage("Emily");
                break;
        }
        this.setImage(sprite);
    }


    public void animation(Mouvement m) {
        
        Timeline timeline = new Timeline();
        KeyFrame etape1 = null;
        KeyFrame etape2 = null;
        
         switch(m){
            case Bas:
                this.setViewport(new Rectangle2D(0, 1, 16, 32));
                //etape1 = new KeyFrame(0., values)
            break;
            case Gauche:
                this.setViewport(new Rectangle2D(0, 97, 16, 32));
            break;
            case Droite:
                this.setViewport(new Rectangle2D(0, 33, 16, 32));
            break;
            case Haut:
                this.setViewport(new Rectangle2D(0, 65, 16, 32));
            break;            
        }
        if(getScene() != null){
            this.fitWidthProperty().bind(this.getScene().heightProperty().multiply(0.05));
            this.fitHeightProperty().bind(this.getScene().heightProperty().multiply(0.10));
        }
      //  timeline.getKeyFrames().addAll(etape1,etape2);
      //  timeline.play();
            
        
    }
    
}