/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Scenes.pScenePartie;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import stardewvalley.ControleursObservateurs.Controlers.ControlerClickSouris;
import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.ControleursObservateurs.Observers.ObserverMouvementPerso;
import stardewvalley.Metier.Partie;
import stardewvalley.Vues.Carte.VueCarte;
import stardewvalley.ControleursObservateurs.Controlers.ControlerDeplacementClavier;
import stardewvalley.ControleursObservateurs.Controlers.ControleurInventaire;
import stardewvalley.ControleursObservateurs.Listeners.ListenerSouris;
import stardewvalley.ControleursObservateurs.Observers.ObserverInventaire;
import stardewvalley.Metier.Mouvement;
import stardewvalley.Metier.Personnages.GestionnairePersonnages;
import stardewvalley.Metier.Personnages.Inventaire.Inventaire;
import stardewvalley.Metier.Personnages.Joueur;
import stardewvalley.Metier.Personnages.NomPersonnage;
import stardewvalley.Vues.Inventaire.VueInventaire;
import stardewvalley.Vues.VuePersonnage;

/**
 *
 * @author simonetma
 */
public class ScenePartie extends Scene {
    
    private VueCarte vueCarte;
    private VuePersonnage vuePersonnage;
    private static Pane ferme;
    
    public ScenePartie(Pane ferme, double width, double height) {
        super(ferme, width, height);
        this.ferme = ferme;
        
        //ajout de la carte
        this.vueCarte = new VueCarte(this,Partie.getPartie().getCarte());
        ferme.getChildren().add(vueCarte);
        
        //ajout listener
        ListenerClavier listenerClavier = new ListenerClavier();
        this.setOnKeyPressed(listenerClavier);
        
        ListenerSouris listenerSouris = new ListenerSouris();
        this.setOnMouseClicked(listenerSouris);
       
        //**************Joueur*******************
        this.vuePersonnage = new VuePersonnage(GestionnairePersonnages.getPersonnage(NomPersonnage.Joueur));        
        Joueur joueur = Partie.getPartie().getJoueur();        
        ObserverMouvementPerso omp = new ObserverMouvementPerso(vuePersonnage,joueur);
        ControlerDeplacementClavier c_clavier = new ControlerDeplacementClavier(listenerClavier,omp,joueur);  
        
        
        //************Inventaire*****************
        Inventaire inventaire = joueur.getInventaire();
        VueInventaire vueInventaire = new VueInventaire(inventaire);
        ObserverInventaire observerInventaire = new ObserverInventaire(vueInventaire,inventaire);
        ControleurInventaire c_inventaire = new ControleurInventaire(listenerClavier,observerInventaire,inventaire);
        listenerClavier.setControleurInventaire(c_inventaire);
        
        ControlerClickSouris c_souris = new ControlerClickSouris(listenerSouris);
        
        listenerClavier.setControleur(c_clavier);        
        c_clavier.addObserver(omp);
        
        listenerSouris.setControleur(c_souris);
        
        ferme.getChildren().add(vuePersonnage);
        //ferme.getChildren().add(vueInventaire);
        vuePersonnage.animation(Mouvement.Bas);
        
    }
    public static void addVue(Node v){
       ferme.getChildren().add(v);
    }
    
    public static void delVue(Node v){
        ferme.getChildren().remove(v);
    }
}
