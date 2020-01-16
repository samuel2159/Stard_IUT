/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage.Item;

/**
 * Item qui pourra être dans l'inventaire
 * @author Kevin Lamblin
 */
public abstract class Item {
    
    private String type;
    
    /**
     * @author Kevin Lamblin
     * Constructeur de Item
     * @param type String
     */
    public Item(String type){
        this.type = type;
    }
    
    /**
     * @author Kevin Lamblin
     * Renvoie le type de l'item
     * @return String
     */
    public String getType(){
        return type;
    }
}
