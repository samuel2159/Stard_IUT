/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import static Metier.Carte.Carte.getCarte;
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
     * @throws java.lang.Exception
     * Modifie les coordonnées du personnage
     */
    public void Deplacer(Coordonnee c) throws Exception{
        if(estPossible(c)){
            position.setX(position.getX() + c.getX());
            position.setY(position.getY() + c.getY());
        }
        else{
            throw new Exception("Déplacement impossible");
        }
    }
    /**
     * @author Kevin Lamblin
     * Renvoie la position du personnage 
     * @return Coordonnee
     */
    public Coordonnee getPosition(){
        return position;
    }

    
    /**
     * @author Kevin Lamblin
     * Donne l'inventaire d'un personnage
     * @return Inventaire
     */
    public Inventaire getInventaire(){
        return inventaire;
    }
    
    /**
     * @author Kevin Lamblin
     * Indique si le déplacement est possible
     * @param c Coordonne
     * @return boolean
     */
    public boolean estPossible(Coordonnee c){
        boolean res = true;
        
        if(getCarte().getNiveauActuel().getCase(c.getX(), c.getY()).getCaseType().equals("eau")){
            res = false;
        }   
        return res;
    }

}
