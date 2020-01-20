/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pHistoire.Composants;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.Controler;
import stardewvalley.ControleursObservateurs.Controlers.ControleurCreerPartie;
import stardewvalley.ControleursObservateurs.Controlers.ControleurMenuPerso;
import stardewvalley.ControleursObservateurs.Listeners.Controlable;
import stardewvalley.ControleursObservateurs.Observers.ObserverChangementScene;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pHistoire.SceneHistoire;
import stardewvalley.Vues.Scenes.pSceneMenu.SceneMenu;
import stardewvalley.Vues.Scenes.pScenePartie.ScenePartie;
import stardewvalley.Vues.Scenes.pScenePerso.ScenePerso;

/**
 *
 * @author ea058452
 */
public class BoutonFleche extends ImageView implements Controlable {
    
    private SceneHistoire scene;
    private ArrayList<Controler> listeControleurs = new ArrayList<>();
    
    public BoutonFleche(SceneHistoire scene) {
        super(GestionnaireImages.getImage("Fleche"));
        //Gestion de la taille
        this.scene = scene;
        this.fitWidthProperty().bind(scene.widthProperty().multiply(0.05));
        this.fitHeightProperty().bind(scene.heightProperty().divide(16)); 
        //Controleurs
        Controler controleurCreerPartie = new ControleurCreerPartie();
        this.addControleur(controleurCreerPartie);
        //Observeur
        controleurCreerPartie.addObserver(new ObserverChangementScene(new ScenePartie(new Pane(), 1100, 662)));
        
        //Gestion du click
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    update();
                }
            });
              
    }

    @Override
    public void update() {
        for(Controler c : this.listeControleurs) {
            c.warn();
        }
    }

    @Override
    public void addControleur(Controler c) {
        this.listeControleurs.add(c);
    }
}
