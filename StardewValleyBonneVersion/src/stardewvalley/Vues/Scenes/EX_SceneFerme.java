/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes;



import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.ControlerDeplacementClavier;
import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.Metier.Personnages.Personnage;
import stardewvalley.ControleursObservateurs.Observers.ObserverMouvementPerso;
import stardewvalley.Metier.Personnages.NomPersonnage;
import stardewvalley.Metier.Personnages.GestionnairePersonnages;
import stardewvalley.Vues.Ressources.GestionnaireImages;
import stardewvalley.Vues.VuePersonnage;

/**
 *
 * @author telli
 */
public class EX_SceneFerme extends Scene {
    
    public EX_SceneFerme(Pane ferme, double width, double height) {
        super(ferme, width, height);
        
        //création du personnage
        Personnage joueur = GestionnairePersonnages.getPersonnage(NomPersonnage.Joueur);
        VuePersonnage vueJoueur = new VuePersonnage(joueur);
        ferme.getChildren().add(vueJoueur);
        
        //gère la map
        
        
        //gère le perso et ses déplacements
        /*ListenerClavier monListener = new ListenerClavier();
        this.setOnKeyPressed(monListener);
        ObserverMouvementPerso omp = new ObserverMouvementPerso(vuePerso,p);
        ControlerDeplacementClavier clavier = new ControlerDeplacementClavier(monListener,omp,p);     
        monListener.setControleur(clavier);        
        clavier.addObserver(omp);   */
       
    }
    
}