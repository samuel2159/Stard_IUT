/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pSceneMenu.Composants;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.Controler;
import stardewvalley.ControleursObservateurs.Controlers.ControleurMenuPerso;
import stardewvalley.ControleursObservateurs.Listeners.Controlable;
import stardewvalley.ControleursObservateurs.Observers.ObserverChangementScene;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pSceneMenu.SceneMenu;
import stardewvalley.Vues.Scenes.pScenePerso.ScenePerso;


/**
 *
 * @author simonetma
 */
public class BoutonCreerPartie extends ImageView implements Controlable {
    
    private SceneMenu scene;
    private ArrayList<Controler> listeControleurs = new ArrayList<>();
    
    public BoutonCreerPartie(SceneMenu scene) {
        super(GestionnaireImages.getImage("Creer"));
        this.setViewport(new Rectangle2D(0,0,270,121));
        //Gestion de la taille
        this.scene = scene;
        this.fitWidthProperty().bind(scene.widthProperty().multiply(0.2));
        this.fitHeightProperty().bind(scene.heightProperty().divide(6)); 
        
        //Controleurs
        Controler controleurMenuPerso = new ControleurMenuPerso();
        this.addControleur(controleurMenuPerso);
        //Observeur
        controleurMenuPerso.addObserver(new ObserverChangementScene(new ScenePerso(new Pane(), 1500, 844)));
        
        //Gestion du click
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    update();
                }
            });
        
        int test;
        //survol de la souris        
        this.setOnMouseExited(e -> this.setViewport(new Rectangle2D(0,0,270,121)));
        this.setOnMouseEntered(e -> this.setViewport(new Rectangle2D(0,122,270,121)));
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
