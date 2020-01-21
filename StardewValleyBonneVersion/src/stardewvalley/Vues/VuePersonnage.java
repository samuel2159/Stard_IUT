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
        
        
        
      KeyFrame etape1 =null;
      KeyFrame etape2 =null;
      KeyFrame etape3 =null;
      KeyFrame etape4 =null;
      KeyFrame etape5 =null;
      
        
         switch(m){
            case Bas:
                this.setViewport(new Rectangle2D(0, 1, 16, 32)); 
                this.deplacement(m);
                
                etape1 = new KeyFrame( Duration.millis(150), e->this.setViewport(new Rectangle2D(0, 1, 16, 32)));  
                this.deplacement(m);
                etape2 = new KeyFrame( Duration.millis(300), e->this.setViewport(new Rectangle2D(17, 1, 16, 32)));
                this.deplacement(m);
                etape3 = new KeyFrame( Duration.millis(450), e->this.setViewport(new Rectangle2D(33, 1, 16, 32)));
                this.deplacement(m);
                etape4 = new KeyFrame( Duration.millis(600), e->this.setViewport(new Rectangle2D(49, 1, 16, 32))); 
                this.deplacement(m);
                etape5 = new KeyFrame( Duration.millis(750), e->this.setViewport(new Rectangle2D(0, 1, 16, 32)));  
                
              
                
                break;
            case Gauche:
                this.setViewport(new Rectangle2D(0, 97, 16, 32));
                etape1 = new KeyFrame( Duration.millis(150), e->this.setViewport(new Rectangle2D(0, 97, 16, 32)));               
                etape2 = new KeyFrame( Duration.millis(300), e->this.setViewport(new Rectangle2D(17, 97, 16, 32)));
                etape3 = new KeyFrame( Duration.millis(450), e->this.setViewport(new Rectangle2D(33, 97, 16, 32)));
                etape4 = new KeyFrame( Duration.millis(600), e->this.setViewport(new Rectangle2D(49, 97, 16, 32)));    
                etape5 = new KeyFrame( Duration.millis(750), e->this.setViewport(new Rectangle2D(0, 97, 16, 32)));  
                 
                
                this.deplacement(m);             
            break;
            case Droite:
                this.setViewport(new Rectangle2D(0,33,16,32));//(0, 33, 16, 32));//mettre le sprite de mouvement 
                etape1 = new KeyFrame( Duration.millis(150), e->this.setViewport(new Rectangle2D(0, 33, 16, 32)));               
                etape2 = new KeyFrame( Duration.millis(300), e->this.setViewport(new Rectangle2D(17, 33, 16, 32)));
                etape3 = new KeyFrame( Duration.millis(450), e->this.setViewport(new Rectangle2D(33, 33, 16, 32)));
                etape4 = new KeyFrame( Duration.millis(600), e->this.setViewport(new Rectangle2D(49, 33, 16, 32)));    
                etape5 = new KeyFrame( Duration.millis(750), e->this.setViewport(new Rectangle2D(0, 33, 16, 32)));  
                this.deplacement(m);           
            break;
            case Haut:
                this.setViewport(new Rectangle2D(0, 65, 16, 32));
                etape1 = new KeyFrame( Duration.millis(150), e->this.setViewport(new Rectangle2D(0, 65, 16, 32)));               
                etape2 = new KeyFrame( Duration.millis(300), e->this.setViewport(new Rectangle2D(17, 65, 16, 32)));
                etape3 = new KeyFrame( Duration.millis(450), e->this.setViewport(new Rectangle2D(33, 65, 16, 32)));
                etape4 = new KeyFrame( Duration.millis(600), e->this.setViewport(new Rectangle2D(49, 65, 16, 32)));    
                etape5 = new KeyFrame( Duration.millis(750), e->this.setViewport(new Rectangle2D(0, 65, 16, 32)));  
                this.deplacement(m);             
            break;            
        }
                etape1 = new KeyFrame( Duration.millis(150), e->this.setViewport(new Rectangle2D(0, 97, 16, 32)));               
                etape2 = new KeyFrame( Duration.millis(300), e->this.setViewport(new Rectangle2D(17, 97, 16, 32)));
                etape3 = new KeyFrame( Duration.millis(450), e->this.setViewport(new Rectangle2D(33, 97, 16, 32)));
                etape4 = new KeyFrame( Duration.millis(600), e->this.setViewport(new Rectangle2D(49, 97, 16, 32)));    
                etape5 = new KeyFrame( Duration.millis(750), e->this.setViewport(new Rectangle2D(0, 97, 16, 32))); 
                
         Timeline t = new Timeline(etape1,etape2,etape3,etape4,etape5);  
         t.play();         
        if(getScene() != null){
            this.fitWidthProperty().bind(this.getScene().heightProperty().multiply(0.05));
            this.fitHeightProperty().bind(this.getScene().heightProperty().multiply(0.10));
        }
      
            
      
    }
      
      public void deplacement(Mouvement m ){
          
          switch(m){
            case Bas:
               
                this.setTranslateY((double)personnageModel.getPosition().getY()*10);
            break;
            case Gauche:
                this.setViewport(new Rectangle2D(0, 97, 16, 32));
                this.setTranslateX((double)personnageModel.getPosition().getX()*10);
            break;
            case Droite:
               this.setViewport(new Rectangle2D(0,33,16,32));//(0, 33, 16, 32));//mettre le sprite de mouvement 
                this.setTranslateX((double)personnageModel.getPosition().getX()*10);
               
                break;
            case Haut:
                this.setViewport(new Rectangle2D(0, 65, 16, 32));
                 this.setTranslateY((double)personnageModel.getPosition().getY()*10);
                
            break;            
        }
          
      }
    
      public void changeSprite(){
         this.setViewport(new Rectangle2D(32, 290, 16, 32));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(VuePersonnage.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.setViewport(new Rectangle2D(16, 290, 16, 32));
         
         
          
      }//test pour le changement de sprite 
    
}