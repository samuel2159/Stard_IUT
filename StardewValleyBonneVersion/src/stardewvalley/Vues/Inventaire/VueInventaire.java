/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        
        int x = 55;
        int y = 58;
        //ajout des stacks
        for(Stack s : inventaire.getStacks()){
            VueObjet v = FabriqueVueObjet.create(s.getObjet());
            v.layoutXProperty().set(x);
            v.layoutYProperty().set(y);
            //ajout du texte nombre d'objets dans le stack     
            //System.out.println(String.valueOf(s.getQuantite()));
            Text t = new Text(x+40, y+65, String.valueOf(s.getQuantite()));
            t.setFont(Font.font ("Verdana", 25));
            t.setFill(Color.BROWN);
            
            this.getChildren().add(t);
            x += 79;
            this.getChildren().add(v);
        }
        ScenePartie.addVue(this);
    }
    
    public void fermer(){
        ScenePartie.delVue(this);
    }
    
}
