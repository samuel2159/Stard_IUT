/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Personnage.Item.Item;

/**
 * Classe reliant un objet à sa quantité dans l'inventaire
 * @author Kevin Lamblin
 */
public class ItemInInventory {
    private Item item; //Item du jeu
    private int nbItem; //Quantité de item

    /**
     * @author Kevin Lamblin
     * Crée un objet dans l'inventaire
     * @param i Item
     */
    public ItemInInventory(Item i){
        item = i;
        nbItem = 1;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne l'item
     * @return Item
     */
    public Item getItem(){
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
     * Modifie la quantité d'un objet
     * @param i int
     */
    public void setQuantite(int i){
        nbItem += i;
    }
}
