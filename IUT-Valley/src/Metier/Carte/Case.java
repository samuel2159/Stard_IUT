/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import Metier.Objet.ObjetPlace;


/**
 *
 * @author Kevin Lamblin 
 */
public class Case {
    
    private Coordonnee position;
    private ObjetPlace objetCorrespondant;
    
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public Case(Coordonnee c){
        position = c;
    }
    
    /**
     * @author Kevin LAmblin
     * Appel la fonction interagir de l'objet placé sur la case
     */
    public void Interagir(){
        objetCorrespondant.Interagir();
    }
    
    /**
     * @author Kevin Lamblin
     * Renvoie la valeur de objetCorrespondant
     * @return ObjetPlace
     */
    public ObjetPlace getObjetCorrespondant(){
        return objetCorrespondant;
    }
    /**
     * @author Kevin Lamblin
     * Definit la valeur de objetCorrespondant
     * @param o 
     */
    public void setObjetCorrespondant(ObjetPlace o){
        objetCorrespondant = o;
    }
    
    public Coordonnee getCoordonnee(){
        return position;
    }

}
