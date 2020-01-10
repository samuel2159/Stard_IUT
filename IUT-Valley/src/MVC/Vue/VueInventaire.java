/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Vue;

import Metier.Personnage.Inventaire;
import Metier.Personnage.Item.Item;
import Metier.Personnage.Item.Mais;
import Metier.Personnage.Item.Panais;
import Metier.Personnage.Personnage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author telli
 */
public class VueInventaire extends Parent{

    private Personnage personnage;
    private ImageView sprite;
    private Scene scene;
    
    private ArrayList<VueItem> items = new ArrayList<VueItem>();
    
    public VueInventaire(Scene s,Personnage p){
        scene = s;
        personnage = p;        
        
        
        try{
            p.getInventaire().ajouter(0,new Panais());
            
            if(p.getInventaire().getItems().size()<30){
                for(int i=0;i<15;i++)
                    p.getInventaire().ajouter(0, new Mais());
                for(int i=0;i<15;i++)
                    p.getInventaire().ajouter(0, new Panais());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        //ajout des vueItem
        for(Item item : personnage.getInventaire().getItems()){    
            ImageView spriteItem = new ImageView(new Image("Ressources/Personnages/items.png"));
            VueItem v = new VueItem(item,spriteItem,this);
            items.add(v);
        }
        //ajout des objets
        update();
        System.out.println(personnage.getInventaire().getItems());
        
    }
 

    public void update() {
       
       //if(!items.isEmpty())
       //    this.getChildren().remove(items);
       this.getChildren().clear();
       
        // ajout du fond
        ImageView sprite = new ImageView(new Image("Ressources/Personnages/inventaire.png"));         
        sprite.setPreserveRatio(true);
        sprite.fitWidthProperty().bind(scene.widthProperty().multiply(0.8));
        sprite.fitHeightProperty().bind(scene.widthProperty().multiply(0.5));
        sprite.xProperty().bind(scene.widthProperty().divide(2).subtract(sprite.fitWidthProperty().divide(2)));
        //sprite.yProperty().bind(s.heightProperty().multiply(0.01));
        this.getChildren().add(sprite);
        
        this.sprite = sprite;       
        
       int i =0;
       for(VueItem v : items){
           
           ImageView spriteItem = v.getSprite();
           
            //placement et redimmensionnement            
            spriteItem.xProperty().bind(sprite.xProperty().add((sprite.fitWidthProperty().divide(1060/49))).add(sprite.fitWidthProperty().multiply(0.068).multiply(i%12)));
            spriteItem.yProperty().bind(sprite.yProperty().add((sprite.fitHeightProperty().divide(730/55))).add((sprite.fitHeightProperty().multiply(0.13*(i/12)))));
   
            
            spriteItem.fitWidthProperty().bind(sprite.fitWidthProperty().divide(16));
            spriteItem.fitHeightProperty().bind(sprite.fitWidthProperty().divide(16));
            
            this.getChildren().add(spriteItem);
            
            if(v.isSelected){//carre autour de l'item selectionné
                ImageView carre = new ImageView(new Image("Ressources/Personnages/selection.png"));
                carre.setPreserveRatio(true);
                carre.fitWidthProperty().bind(spriteItem.fitWidthProperty());
                carre.xProperty().bind(spriteItem.xProperty());
                carre.yProperty().bind(spriteItem.yProperty());
                this.getChildren().add(carre);
            }
            i++;
        }        
        //ajout du menu
        
        ImageView poubelle = new ImageView(new Image("Ressources/Personnages/poubelle.png"));
        poubelle.xProperty().bind(scene.widthProperty().multiply(0.85));//position
        poubelle.fitWidthProperty().bind(scene.widthProperty().multiply(0.07));//taille
        poubelle.fitHeightProperty().bind(scene.widthProperty().multiply(0.11));//taille
        this.getChildren().add(poubelle);
        
        //clique sur la poubelle
        poubelle.setOnMouseClicked(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent me){
                for(VueItem i : items){                    
                    Item item = i.getItem();
                    if(i.isSelected){
                        personnage.getInventaire().supprimer(item); 
                        
                        System.out.println(i.getItem());//test affichage des adresses des items selectionnes
                        update();
                    }
                }                                                  
            }
        });
        
    }
}
