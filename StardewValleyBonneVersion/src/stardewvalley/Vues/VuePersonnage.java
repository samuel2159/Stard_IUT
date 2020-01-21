/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
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
   private boolean isReady;
   private int etat;
    
    public VuePersonnage(Personnage personnage){
        this.personnageModel = personnage;        
        //ajout du sprite
        this.selectionImageSprite();    
        etat = 0;
        isReady = true;
        this.fitWidthProperty().set(35);
        this.fitHeightProperty().set(70);
       
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
        
        if (this.isReady){
            this.isReady = false;
            Timeline timeline = new Timeline();
            KeyFrame frame =new KeyFrame(Duration.millis(100), ae-> deplacement(m));
            timeline.getKeyFrames().add(frame);
            timeline.setCycleCount(4);
            timeline.setOnFinished(ae -> finAnimation(m));
            timeline.play(); 
        }   
    }
      
      public void deplacement(Mouvement m ){
          double vitesse = 4;
          switch(m){
            case Bas:this.setTranslateY(personnageModel.getPosition().getY()*vitesse);break;
            case Gauche: this.setTranslateX(personnageModel.getPosition().getX()*vitesse); break;
            case Droite: this.setTranslateX(personnageModel.getPosition().getX()*vitesse);break;
            case Haut:this.setTranslateY(personnageModel.getPosition().getY()*vitesse); break;            
        }
          changeEtat(m);
          
      }
    
      public void changeEtat(Mouvement m){
        
        switch(m){
            case Bas:
            switch(this.etat) {
            case 0: this.setViewport(new Rectangle2D(0,1,16,32)); ; break;
            case 1:this.setViewport(new Rectangle2D(16,1,16,32)); break;
            case 2:this.setViewport(new Rectangle2D(32,1,16,32));  break;
            case 3: this.setViewport(new Rectangle2D(48,1,16,32)); break;
             }
            break;
            case Droite:
            switch(this.etat) {
            case 0: this.setViewport(new Rectangle2D(0,33,16,32));  break;
            case 1:this.setViewport(new Rectangle2D(16,33,16,32)); break;
            case 2:this.setViewport(new Rectangle2D(32,33,16,32));  break;
            case 3: this.setViewport(new Rectangle2D(48,33,16,32)); break;
             }
            break;
            case Haut:
            switch(this.etat) {
            case 0: this.setViewport(new Rectangle2D(0,65,16,32));  break;
            case 1:this.setViewport(new Rectangle2D(16,65,16,32)); break;
            case 2:this.setViewport(new Rectangle2D(32,65,16,32));  break;
            case 3: this.setViewport(new Rectangle2D(48,65,16,32)); break;
             }
            break;
            case Gauche:
            switch(this.etat) {
            case 0: this.setViewport(new Rectangle2D(0,97,16,32));  break;
            case 1:this.setViewport(new Rectangle2D(16,97,16,32)); break;
            case 2:this.setViewport(new Rectangle2D(32,97,16,32));  break;
            case 3: this.setViewport(new Rectangle2D(48,97,16,32)); break;
             }
            break;
        }
        
         this.etat = (this.etat + 1)%4;
         
          
      }
      

      
      private void setReady(){
          this.isReady = true;
           }
      private void finAnimation(Mouvement m) {
          
          
           
          setReady();
          etat = 0;
          changeEtat(m);
          System.out.println("remise a zero");
}
}