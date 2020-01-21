/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pScenePerso.Composants;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.Controler;
import stardewvalley.ControleursObservateurs.Controlers.ControleurMenuHistoire;
import stardewvalley.ControleursObservateurs.Listeners.Controlable;
import stardewvalley.ControleursObservateurs.Observers.ObserverChangementScene;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.Scenes.pHistoire.SceneHistoire;
import stardewvalley.Vues.Scenes.pScenePerso.ScenePerso;

/**
 *
 * @author ea058452
 */
public class BoutonOk extends ImageView implements Controlable {

    private ScenePerso scene;
    private ArrayList<Controler> listeControleurs = new ArrayList<>();
    
    public BoutonOk(ScenePerso scene) {
        super(GestionnaireImages.getImage("Ok"));
        this.setViewport(new Rectangle2D(0,0,168,124));
        //Gestion de la taille
        this.scene = scene;
        this.fitWidthProperty().bind(scene.widthProperty().multiply(0.1));
        this.fitHeightProperty().bind(scene.heightProperty().divide(9)); 
        //Controleurs
        Controler controleurMenuHistoire = new ControleurMenuHistoire();
        this.addControleur(controleurMenuHistoire);
        //Observeur
        controleurMenuHistoire.addObserver(new ObserverChangementScene(new SceneHistoire(new Pane(), 1500, 844)));
        
        //Gestion du click
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    update();
                }
            });
        this.setOnMouseExited(e -> this.setViewport(new Rectangle2D(0,0,168,124)));
        this.setOnMouseEntered(e -> this.setViewport(new Rectangle2D(0,121,168,125)));              
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
