/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Carte.Coordonnee;

/**
 *
 * @author Kevin Lamblin 
 */
public abstract class Personnage {
    
    private Coordonnee position; //Position d'un personnage sur la carte
    private Inventaire inventaire; //Inventaire du personnage
    
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public Personnage(Coordonnee c){
        position = c;
        inventaire = new Inventaire();
    }
    /**
     * @author Tommy Saucey && @modify Kevin Lamblin
     * @param c Coordonnee
     * Modifie les coordonnées du personnage
     */
    public void Deplacer(Coordonnee c){
        
        position.setX(position.getX() + c.getX());
        position.setY(position.getY() + c.getY());
    }
    /**
     * @author Kevin Lamblin
     * Renvoie la position du personnage 
     * @return Coordonnee
     */
    public Coordonnee getPosition(){
        return position;
    }
    
    public Inventaire getInventaire(){
        return inventaire;
    }
}
