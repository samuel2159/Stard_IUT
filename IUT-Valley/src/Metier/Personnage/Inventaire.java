/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Personnage.Item.Item;
import java.util.HashMap;

/**
 *
 * @author Kevin
 */
public class Inventaire {
        private Item favoris[];//Liste des objets de la barre de raccourcis
    private Item ObjetCourant;//Objet courant, dans la liste des favoris
    private HashMap<Integer,Item> items;//Liste des objets dans l'inventaire(sur 36 emplacements)
    
    /**
     * @author Kevin Lamblin
     */
    public Inventaire() {
        items = new HashMap<>();
    }

    /**
     * @author Thiburce Tommy
     * Supprime un item de l'inventaire
     * @param i Integer
     * @param item Item
     */
    public void supprimer(Integer i,Item item){
        items.remove(i,item);
    }
    
    /**
     * @author Thiburce Tommy
     * @return HashMap
     */
    public HashMap getItem(){  
        return items;
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * ajoute un item a l'inventaire
     * @param i Integer
     * @param item Item
     * @throws Exception
     */
    public void ajouter(Integer i, Item item) throws Exception{
        
        //Si l'inventaire est plein on renvoie une exception
        if(items.size() >= 36){
            throw new Exception("Inventory full");
        }
        //Sinon on ajoute l'Item
        else{
            items.put(i, item);
        }
    }
    
    /**
     * @author Kevin Lamblin
     * @param i Integer
     * @param item Item
     */
    /*
    public void deplacer(Integer i, Item item){
        if(items.get(i).equals(null)){
            
        }
        else{
            
        }
    }
    */
}
