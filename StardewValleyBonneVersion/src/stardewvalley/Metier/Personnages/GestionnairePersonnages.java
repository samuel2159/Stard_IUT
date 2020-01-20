/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages;

import java.util.HashMap;
import static stardewvalley.Metier.Personnages.NomPersonnage.*;

/**
 *
 * @author Simonet
 */
public class GestionnairePersonnages {
    
    private static GestionnairePersonnages instance;
    private HashMap<NomPersonnage,Personnage> listePersonnage;
    private Joueur joueur;
    
    public GestionnairePersonnages() {
        this.listePersonnage = new HashMap<>();
        //Création du joueur
        this.joueur = new Joueur();
        this.listePersonnage.put(Joueur,joueur);
        //Création des NPC
        this.listePersonnage.put(Emily,new NPC(Emily));
    }
    
    private static GestionnairePersonnages get() {
        if(instance == null) {
            instance = new GestionnairePersonnages();
        }
        return instance;
    }
    
    public static Personnage getPersonnage(NomPersonnage nom) {
        return get().listePersonnage.get(nom);
    }
    
    public static Joueur getJoueur() {
        return get().joueur;
    }
    
}
