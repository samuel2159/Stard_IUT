/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier;

import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Personnages.Joueur;
import stardewvalley.Metier.Personnages.Personnage;
import java.util.ArrayList;
import stardewvalley.Metier.Personnages.GestionnairePersonnages;

/**
 * Correspond à une partie du jeu
 * @author Kevin Lamblin
 */
public class Partie {
    
    
    private static Partie instance; //Permet de stocker la partie.
    
    private Carte carte; //Récupère la carte du jeu
    private ArrayList<Personnage> personnages = new ArrayList(); //Listes des personnages
    private Joueur player; //Garde le joueur de la partie
    
    /**
     * @author Kevin Lamblin
     * Crée une partie avec une carte et un joueur
     */
    private Partie(){
        this.carte = getCarte();
        player = GestionnairePersonnages.getJoueur();
        player.setPosition(new Coordonnee(10,10));
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
    
    public Carte getCarte() {
        return this.carte;
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
    public Joueur getJoueur(){
        return player;
    }
    /**
     * Renvoie la partie.
     * @author Vincent Tantet
     * @return Partie
     */
    public static Partie getPartie(){
        if (instance == null){
            instance = new Partie();
        }
        return instance;
    }
    
    public static void create() {
        instance = new Partie();
    }
}
