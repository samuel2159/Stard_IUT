/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Metier.Carte.Carte;
import static Metier.Carte.Carte.getCarte;
import Metier.Carte.Coordonnee;
import Metier.Personnage.Joueur;
import Metier.Personnage.Personnage;
import java.util.ArrayList;

/**
 * Correspond à une partie du jeu
 * @author Kevin Lamblin
 */
public class Partie {
    
    private Carte carte; //Récupère la carte du jeu
    private ArrayList<Personnage> personnages = new ArrayList(); //Listes des personnages
    private Joueur player; //Garde le joueur de la partie
    
    /**
     * @author Kevin Lamblin
     * Crée une partie avec une carte et un joueur
     * @throws java.io.FileNotFoundException
     */
    public Partie(){
        this.carte = getCarte();
        player = new Joueur(new Coordonnee(10,10));
        addPersonnage(player);
    }   
    
    /**
     * @author Kevin Lamblin
     * Fonction qui ajoute un personnage à la liste de personnages de la partie
     * @param p Personnage
     */
    public void addPersonnage(Personnage p){
        personnages.add(p);
    }  
    
    /**
     * @author Kevin Lamblin
     * Renvoie les personnages de la partie
     * @return Personnage
     */
    public ArrayList<Personnage> getPersonnages(){
        return personnages;
    }
    
    /**
     * @author Kevin Lamblin
     * Renvoie le joueur de la partie
     * @return Personnage
     */
    public Personnage getJoueur(){
        return player;
    }

}
