/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import java.util.HashMap;
/**
 * Singleton
 * @author Kevin Lamblin 
 */
public class Carte {

    private HashMap<String, Niveaux> lNiveaux = new HashMap();
    private Niveaux niveauActuel;
    private static Carte instance = null; //Unique instance de la carte

    private Carte(){
        Niveaux lvlFerme = new Niveaux("Ferme","Ferme.txt", 20, 45);
        lNiveaux.put("Ferme", lvlFerme);
        niveauActuel = lNiveaux.get("Ferme");
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
    
    public Niveaux getNiveauActuel(){
        return niveauActuel;
    }
    
    public void setNiveauActuel(String s){
        for(Niveaux n : lNiveaux.values()){
            if(n.getNomNiveau().equals(s)){
                niveauActuel = n;
            }
        }
    }
}
