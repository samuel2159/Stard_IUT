/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue;

import Metier.Personnage.Item.Item;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author telli
 */
public class VueItem extends Parent{
    
    ImageView sprite;
    Item item;
    int id;
    
    boolean isSelected = false;
    
    public VueItem(Item i,ImageView im,VueInventaire source){
        sprite = im;
        item = i;        
        
        switch(i.getType()){
            case "Panais":
                sprite.setViewport(new Rectangle2D(0,17,16,16));  
                break;
            case "Mais":
                sprite.setViewport(new Rectangle2D(96,176,16,15));;
                break;
        }
        //this.getChildren().add(sprite);
        sprite.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent me){
                if(!isSelected)
                    isSelected = true;
                else 
                    isSelected = false;
                source.update();                
            }
        });
    }   
    
    public ImageView getSprite(){
        return sprite;
    }
    
    public Item getItem(){
        return item;
    }
    
    public int getIdentifiant(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
}
