/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages;

import stardewvalley.Metier.Personnages.Inventaire.Objets.Panais;
import static stardewvalley.Metier.Personnages.NomPersonnage.Joueur;

/**
 *
 * @author Kevin Lamblin
 */
public class Joueur extends Personnage {
    
    private String nomJoueur; //Nom du joueur
    private int energie; //Energie du joueur
    private int ENERGIE_MAX; //Energie maximale du joueur
    
    public Joueur() {
        super(Joueur);
        this.ENERGIE_MAX = 1000;
        this.setEnergie(ENERGIE_MAX);
        //********************A SUPPRIMER TEST INVENTAIRE********************
        try{
            this.getInventaire().Ajout(new Panais());
        }
        catch(Exception e){
            System.err.println("erreur inventaire");
        }
    }
    
    /**
     * @author Kevin Lamblin
     * Renvoie le nom du joueur
     * @return String
     */
    public String getNomJoueur() {
        return this.nomJoueur;
    }
    
    /**
     * @author Kevin Lamblin
     * Change le nom du joueur
     * @param s String 
     */
    public void setNomJoueur(String s){
        nomJoueur = s;
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
    public void setEnergie(int e){
        energie = e;
    }
    
}
