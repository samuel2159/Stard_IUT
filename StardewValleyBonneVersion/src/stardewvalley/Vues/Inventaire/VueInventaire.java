/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import stardewvalley.Metier.Personnages.Inventaire.Inventaire;
import stardewvalley.Metier.Personnages.Inventaire.Stack;
import stardewvalley.Vues.Inventaire.Objet.FabriqueVueObjet;
import stardewvalley.Vues.Inventaire.Objet.VueObjet;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pScenePartie.ScenePartie;

/**
 *
 * @author telli
 */
public class VueInventaire extends Pane{
    
    Inventaire inventaire;
    
    public VueInventaire(Inventaire i){
        inventaire = i;
        
        //positionnement
        this.layoutXProperty().set(200);
        this.layoutYProperty().set(60);
    }
    
    public void afficher(){
        //ajout du fond
        //System.out.println(inventaire);
        this.getChildren().add(new ImageView(GestionnaireImages.getImage("Inventaire")));
        
        
        //ajout des stacks
        for(Stack s : inventaire.getInventaire()){
            VueObjet v = FabriqueVueObjet.create(s.getObjet());
            v.layoutXProperty().set(55);
            v.layoutYProperty().set(58);
            this.getChildren().add(v);
        }
        ScenePartie.addVue(this);
    }
    
    public void fermer(){
        ScenePartie.delVue(this);
    }
    
}
