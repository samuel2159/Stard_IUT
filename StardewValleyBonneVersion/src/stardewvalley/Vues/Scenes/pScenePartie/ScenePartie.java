/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pScenePartie;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.ControlerClickSouris;
import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.ControleursObservateurs.Observers.ObserverMouvementPerso;
import stardewvalley.Metier.Partie;
import stardewvalley.Vues.Carte.VueCarte;
import stardewvalley.ControleursObservateurs.Controlers.ControlerDeplacementClavier;
import stardewvalley.ControleursObservateurs.Listeners.ListenerSouris;
import stardewvalley.Metier.Mouvement;
import stardewvalley.Metier.Personnages.GestionnairePersonnages;
import stardewvalley.Metier.Personnages.NomPersonnage;
import stardewvalley.Vues.VuePersonnage;

/**
 *
 * @author simonetma
 */
public class ScenePartie extends Scene {
    
    private VueCarte vueCarte;
    private VuePersonnage vuePersonnage;
    
    public ScenePartie(Pane ferme, double width, double height) {
        super(ferme, width, height);
        //ajout de la carte
        this.vueCarte = new VueCarte(this,Partie.getPartie().getCarte());
        ferme.getChildren().add(vueCarte);
        
        //ajout listener
        ListenerClavier listenerClavier = new ListenerClavier();
        this.setOnKeyPressed(listenerClavier);
        
        ListenerSouris listenerSouris = new ListenerSouris();
        this.setOnMouseClicked(listenerSouris);
       
        //ajout du joueur
        this.vuePersonnage = new VuePersonnage(GestionnairePersonnages.getPersonnage(NomPersonnage.Joueur));        
        
        ObserverMouvementPerso omp = new ObserverMouvementPerso(vuePersonnage,Partie.getPartie().getJoueur());
        ControlerDeplacementClavier c_clavier = new ControlerDeplacementClavier(listenerClavier,omp,Partie.getPartie().getJoueur());     
        
        ControlerClickSouris c_souris = new ControlerClickSouris(listenerSouris);
        
        listenerClavier.setControleur(c_clavier);        
        c_clavier.addObserver(omp);
        
        listenerSouris.setControleur(c_souris);
        
        ferme.getChildren().add(vuePersonnage);
        vuePersonnage.animation(Mouvement.Bas);
        
    }
}
