/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Cases.*;
import Metier.Objet.Sapin;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Objects;



/**
 * Singleton
 * @author Kevin Lamblin 
 */
public class Carte {

    private HashMap<Coordonnee,Case> cases = new HashMap(); //Liste des cases composant la carte du jeu
    private static Carte instance = null; //Unique instance de la carte
    public static int X = 50; //Taille de la carte en largeur (modifier la valeur)
    public static int Y = 50; //Taille de la carte en longueur (modifier la valeur)
    
    

    private Carte(){
        
        //Double bloucle d'initialisation des cases
        for(int i = 0; i < X; i++){
            for(int j = 0; j < Y; j++){
                //Créer une nouvelle case et l'ajoute à la liste de cases avec ses coordonnées
                Coordonnee coord = new Coordonnee(i,j);                  
                Case c = null;                              
                if(i%15==0)
                    c = new CaseEau(coord,this);
                else
                    c = new CaseHerbe(coord,this);
                if(i==7 && j==7)
                    c.setObjetCorrespondant(new Sapin());
                
                cases.put(coord, c);                                           

            }
        }
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
    
    public HashMap<Coordonnee,Case> getCases(){
        return cases;

    }
    

    public Case getCase(int x,int y){
        Case retour = null;
        
        for(Case c : cases.values()){
            if(c.getCoordonnee().getX() == x && c.getCoordonnee().getY() == y)
                retour = c;
        }
        return retour;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carte other = (Carte) obj;
        if (!Objects.equals(this.cases, other.cases)) {
            return false;
        }
        return true;
    }


}
