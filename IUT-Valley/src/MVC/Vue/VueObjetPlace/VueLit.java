/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue.VueObjetPlace;

import Metier.Carte.Carte;
import Metier.Objet.Lit;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Vincent Tantet
 */
public class VueLit extends Parent{
    private Scene scene;
    private ImageView litImage;
    private Lit lit = new Lit();
    private Carte carte;
    public VueLit(Scene scene){
        this.scene = scene;
        litImage = new ImageView(new Image("Ressources/Map/farmhouse_tiles.png"));
        litImage.setViewport(new Rectangle2D(128,120,32,48)); //découpage du sprite voulu
        litImage.setFitWidth(16);
        litImage.setPreserveRatio(true);
        this.getChildren().add(litImage);
        this.setTranslateX(224);
        this.setTranslateY(224);
        
        this.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent me){
                lit.Interagir();
            }
        });
    }
    
    public ImageView getLit(){
        return this.litImage;
    }
}
