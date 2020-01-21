/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages.Inventaire;

import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 * Classe reliant un objet à sa quantité dans l'inventaire
 * @author Kevin Lamblin
 */
public class Stack {
    private Objet item; //Item du jeu
    private int nbItem; //Quantité de item

    /**
     * @author Kevin Lamblin
     * Crée un objet dans l'inventaire
     * @param i Item
     */
    public Stack(Objet i){
        item = i;
        nbItem = 1;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne l'item
     * @return Item
     */
    public Objet getObjet(){
        return item;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne le nombre d'un item
     * @return int
     */
    public int getQuantite(){
        return nbItem;
    }
    
    /**
     * @author Kevin Lamblin
     * Modifie la valeur de item
     * @param i int
     */
    public void setItem(Objet i){
        item = i;
    }
    
    /**
     * @author Kevin Lamblin
     * Modifie la quantité
     * @param i int
     */
    public void setQuantite(int i){
        nbItem = i;
    }
    
    /**
     * @author Kevin Lamblin
     * Ajoute une quantité à un objet
     * @param i int
     */
    public void ajoutQuantite(int i){
        nbItem += i;
    }
}
