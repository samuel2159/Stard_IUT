/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages;

import static stardewvalley.Metier.Personnages.NomPersonnage.Joueur;

/**
 *
 * @author simonetma
 */
public class Joueur extends Personnage {
    
    private String nomJoueur;
    private int energie; //Energie du joueur
    private int ENERGIE_MAX; //Energie maximale du joueur
    
    public Joueur() {
        super(Joueur);
        this.ENERGIE_MAX = 1000;
        this.setEnergie(ENERGIE_MAX);
    }
    
    
    public String getNomJoueur() {
        return this.nomJoueur;
    }
    
    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
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
