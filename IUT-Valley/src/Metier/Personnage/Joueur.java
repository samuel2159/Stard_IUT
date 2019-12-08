/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Carte.Coordonnee;

/**
 * Correspond au joueur
 * @author Kevin Lamblin 
 */
public class Joueur extends Personnage{
    
    private int energie; //Energie du joueur
    public static int ENERGIE_MAX = 1000; //Energie maximale du joueur
    
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public Joueur(Coordonnee c){
        super(c);
        setEnergie(ENERGIE_MAX);
        
    }
    
    /**
     * @author Kevin Lamblin
     * Donne la valeur de l'énergie du joueur
     * @return int
     */
    public int getEnergie(){
        return energie;
    }
    
    /**
     * @author Kevin Lamblin
     * Définit l'énergie du joueur
     * @param e int
     */
    public final void setEnergie(int e){
        energie = e;
    }
}
