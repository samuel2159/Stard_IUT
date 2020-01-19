/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pSceneMenu.Composants;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.Controler;
import stardewvalley.ControleursObservateurs.Controlers.ControleurCreerPartie;
import stardewvalley.ControleursObservateurs.Listeners.Controlable;
import stardewvalley.ControleursObservateurs.Observers.ObeserverChangementScene;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pSceneMenu.SceneMenu;
import stardewvalley.Vues.Scenes.pScenePartie.ScenePartie;


/**
 *
 * @author simonetma
 */
public class BoutonCreerPartie extends ImageView implements Controlable {
    
    private SceneMenu scene;
    private ArrayList<Controler> listeControleurs = new ArrayList<>();
    
    public BoutonCreerPartie(SceneMenu scene) {
        super(GestionnaireImages.getImage("Creer"));
        //Gestion de la taille
        this.scene = scene;
        this.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
        this.fitHeightProperty().bind(scene.heightProperty().divide(6)); 
        //Controleurs
        Controler controleurCreerPartie = new ControleurCreerPartie();
        this.addControleur(controleurCreerPartie);
        //Observeur
        controleurCreerPartie.addObserver(new ObeserverChangementScene(new ScenePartie(new Pane(), 1100, 662)));
        
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
