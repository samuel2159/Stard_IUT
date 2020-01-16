/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue;

import java.util.HashSet;
import java.util.Set;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueInventaire extends Vue{
    
    public VueInventaire(ImageView sprite,Scene s){

        sprite.setPreserveRatio(true);
        sprite.fitWidthProperty().bind(s.widthProperty().multiply(0.8));
        sprite.fitHeightProperty().bind(s.widthProperty().multiply(0.5));
        sprite.xProperty().bind(s.widthProperty().divide(2).subtract(sprite.fitWidthProperty().divide(2)));
        
        
    }

    @Override
    public void Update() {
       
    }
    
}
