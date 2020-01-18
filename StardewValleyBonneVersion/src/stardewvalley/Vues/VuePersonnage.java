/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import stardewvalley.Metier.Personnages.NomPersonnage;
import stardewvalley.Metier.Personnages.Personnage;
import stardewvalley.Vues.Ressources.GestionnaireImages;

/**
 *
 * @author ea058452
 */
public class VuePersonnage extends Pane{
    
    private Personnage personnageModel;
    private ImageView sprite;
    
    public VuePersonnage(Personnage personnage){
        this.personnageModel = personnage;
        this.sprite = new ImageView();
        this.selectionImageSprite();
    }
    
    private void selectionImageSprite() {
        NomPersonnage nom = this.personnageModel.getNom();
        switch(nom) {
            case Joueur: this.sprite.setImage(GestionnaireImages.getImage("Sebastian"));
                    break;
            case Emily: this.sprite.setImage(GestionnaireImages.getImage("Emily"));
                break;
        }
        this.sprite = sprite;
        this.getChildren().add(sprite);
    }
    
    public ImageView getSprite(){
        return sprite;
    }
   
}