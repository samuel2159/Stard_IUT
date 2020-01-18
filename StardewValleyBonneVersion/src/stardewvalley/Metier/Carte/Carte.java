/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte;

import java.util.HashMap;
import static stardewvalley.Metier.Carte.EnumNiveau.*;
/**
 * Singleton
 * @author Kevin Lamblin 
 */
public class Carte {

    private HashMap<EnumNiveau, Niveau> lNiveaux = new HashMap();
    private Niveau niveauActuel;
    private static Carte instance = null; //Unique instance de la carte

    private Carte(){
        Niveau lvlFerme = new Niveau(Ferme,"Ferme.txt", 20, 45);
        Niveau lvlMaison = new Niveau(Maison, "Maison.txt", 10, 10);
        lNiveaux.put(Ferme, lvlFerme);
        lNiveaux.put(Maison, lvlMaison);
        niveauActuel = lNiveaux.get(Ferme);
    }
    
    /**
     * @author Kevin Lamblin
     * Fonction qui renvoie l'unique instance de la carte
     * @return Carte
     */
    public static Carte getCarte(){
        //Créer une carte si elle n'éxiste pas déjà
        if(instance == null){
            instance = new Carte();
        }
        return instance;
    }
    
    public static Niveau getNiveauActuel(){
        return getCarte().niveauActuel;
    }
    
    public static void setNiveauActuel(EnumNiveau niveau){
        getCarte().niveauActuel = getCarte().lNiveaux.get(niveau);
    }
}
