/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages;

import stardewvalley.Metier.Carte.Coordonnee;

/**
 *
 * @kevin
 */
public abstract class Personnage {
    
    private Coordonnee position;    //Position d'un personnage sur la carte
    //TODO//private Inventaire inventaire;  //Inventaire du personnage
    private NomPersonnage nom;      //Nom du personnage
    
    
    
    public Personnage(NomPersonnage nom) {
        this.nom = nom;
        //this.inventaire = new Inventaire();
    }
    
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
    
    /*public Inventaire getInventaire(){
        return inventaire;
    }*/
    
    
    
}
