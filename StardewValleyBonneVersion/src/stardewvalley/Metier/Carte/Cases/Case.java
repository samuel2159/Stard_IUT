/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Carte.Direction;
import stardewvalley.Metier.Carte.Niveau;
import stardewvalley.Metier.Objet.ObjetPlace;
import java.util.Objects;


/**
 * Ue case général
 * @author Kevin Lamblin 
 */
public abstract class Case {
    
    private Coordonnee position;
    private ObjetPlace objetCorrespondant;
    
    /**
     * @author Kevin Lamblin
     * Constructeur de case
     * @param c Coordonnee
     */
    public Case(Coordonnee c){
        position = c;
    }
    
    /**
     * @author Kevin Lamblin
     * Appel la fonction interagir de l'objet placé sur la case
     */
    public void InteragirObjet(){
        objetCorrespondant.Interagir();
    }
    
    /**
     * @author Kevin Lamblin
     * Interraction en fonction du type de case
     */
    public abstract void InteragirCase();
    
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
    
    /**
     * @author Kevin
     * Donne la position de la case sur la map
     * @return Coordonnee
     */
    public Coordonnee getCoordonnee(){
        return position;
    }
    
    /**
     * @author Kevin Lamblin
     * @param d Direction
     * @return Case
     */
    public Case getVoisine(Direction d){
        Niveau n = Carte.getNiveauActuel();
        Case c = n.getCaseProche(this, d);
        return c;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne le type de case
     * @return TypeCase
     */
    public abstract String getCaseType();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.position);
        hash = 41 * hash + Objects.hashCode(this.objetCorrespondant);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = true;

        if (getClass() != obj.getClass() || obj == null) {
            res = false;
        }
        final Case other = (Case) obj;
        if (!Objects.equals(this.position, other.position) || !Objects.equals(this.objetCorrespondant, other.objetCorrespondant)) {
            res = false;
        }
        return res;
    }
    

}
