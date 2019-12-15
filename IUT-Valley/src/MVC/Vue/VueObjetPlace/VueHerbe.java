/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue.VueObjetPlace;

import MVC.Vue.Arbres.VueObjetPlace;
import MVC.Vue.Vue;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueHerbe extends VueObjetPlace{

    public VueHerbe(Scene s,Image sprite) {
        ImageView spriteObjet = new ImageView(sprite);
        spriteObjet.setPreserveRatio(true);
        spriteObjet.setViewport(new Rectangle2D(96,96,14,14)); 
        spriteObjet.fitWidthProperty().bind(s.widthProperty().multiply(0.025));
        
        this.getChildren().add(spriteObjet);
    }

    @Override
    public void Update() {
       
    }
    
}
