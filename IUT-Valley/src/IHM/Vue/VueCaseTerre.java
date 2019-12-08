/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.Vue;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

/**
 *
 * @author telli
 */
public class VueCaseTerre {
    
    public VueCaseTerre(ImageView sprite){
         sprite.setViewport(new Rectangle2D(16+1,7*16+1,14,14));        
    }
}
