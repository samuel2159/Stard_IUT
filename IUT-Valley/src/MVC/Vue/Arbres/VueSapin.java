/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue.Arbres;

import Metier.Carte.Cases.CaseEau;
import Metier.Objet.Sapin;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueSapin extends VueObjetPlace{
    
    public VueSapin(Scene s,Image sprite){
        super();
        ImageView spriteObjet = new ImageView(sprite);
        spriteObjet.setViewport(new Rectangle2D(160,0,48,96));
        spriteObjet.setPreserveRatio(true);
        spriteObjet.fitWidthProperty().bind(s.widthProperty().multiply(0.10));
        this.getChildren().add(spriteObjet);
    }  

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
