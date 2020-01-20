/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte;

import stardewvalley.Vues.Carte.ObjetsPlaces.VueObjetPlaceFabrique;
import stardewvalley.Vues.Carte.ObjetsPlaces.VueObjetPlace;
import javafx.scene.layout.Pane;
import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Cases.Case;

/**
 *
 * @author simonetma
 */
public class VueCarteObjets extends Pane {
    
    private VueCarte vueCarte;
    
    public VueCarteObjets(VueCarte vueCarte) {      
        
        this.vueCarte = vueCarte;
        this.prefHeightProperty().bind(vueCarte.heightProperty());
        this.prefWidthProperty().bind(vueCarte.widthProperty());
        
        affichage();
        System.out.println(widthProperty());
    }
    
    private void affichage(){
        
        //this.setStyle("-fx-background-color:yellow");
                
        for(Case c : Carte.getNiveauActuel().getCases()){     
            if(c.getObjetCorrespondant() != null){
                
                VueObjetPlace vue = VueObjetPlaceFabrique.create(this,c.getObjetCorrespondant());

                //binding et positionnement
                vue.setSmooth(true);
                
                vue.setX(c.getCoordonnee().getX()*35);
                vue.setY(c.getCoordonnee().getY()*35);
                this.getChildren().add(vue); 
            }
            
        }
    }
}
