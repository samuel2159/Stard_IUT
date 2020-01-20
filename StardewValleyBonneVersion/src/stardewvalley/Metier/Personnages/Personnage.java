/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages;

import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Mouvement;
import stardewvalley.Metier.Personnages.Inventaire.Inventaire;

/**
 *
 * @Kevin Lamblin
 */
public abstract class Personnage {
    
    private Coordonnee position; //Position d'un personnage sur la carte
    private Inventaire inventaire;  //Inventaire du personnage
    private NomPersonnage nom; //Nom du personnage
    
    
    /**
     * @author Kevin Lamblin
     * Création d'un personnage
     * @param nom String
     */
    public Personnage(NomPersonnage nom) {
        this.nom = nom;
       //this.inventaire = new Inventaire();
    }
    
    /**
     * @author Kevin Lamblin
     * Change la position d'un personnage
     * @param c 
     */
    public void setPosition(Coordonnee c) {
        this.position = c;
    }
    
    public Coordonnee getPosition(){
        return position;
    }
    
    public void Deplacer(Coordonnee c){
        position.setX(position.getX() + c.getX());
        position.setY(position.getY() + c.getY());
    }
    
    public NomPersonnage getNom() {
        return this.nom;
    }
    
    public Inventaire getInventaire(){
        return inventaire;
    }

    public void deplacer(Mouvement mouvement) {
         switch(mouvement){
            case Haut : position.setY(position.getY()-1);
                break;
            case Bas : position.setY(position.getY()+1);
                break;
            case Droite : position.setX(position.getX()+1);
                break;
            case Gauche : position.setX(position.getX()-1);
                break;  
        }      
    }
    
    
    
}
