/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Personnage.Item.Item;
import java.util.ArrayList;

/**
 * Inventaire
 * @author Kevin Lamblin
 */
public class Inventaire {
    
    private Item ObjetCourant;//Objet courant
    private ArrayList<Stack> items;//Liste des objets dans l'inventaire(sur 36 emplacements)
    
    /**
     * Constructeur d'inventaire
     * @author Kevin Lamblin
     */
    public Inventaire() {
        items = new ArrayList<>();        
    }

    /**
     * @author Thiburce Tommy
     * @return ArrayList
     */
    public ArrayList<Stack> getItem(){  
        return items;
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * ajoute un item a l'inventaire
     * @param item Item
     * @throws Exception
     */
    public void ajouter(Item item) throws Exception{
        
        //Si l'item est déjà dans l'inventaire
        for(Stack s : items){
            if(s.getItem().getType().equals(item.getType())){
                s.ajoutQuantite(s.getQuantite()+1);
            }
        }
        
        //Si l'inventaire est plein on renvoie une exception
        if(items.size() >= 36){
            throw new Exception("Inventory full");
        }
        //Sinon on ajoute l'Item
        else{
            Stack stack = new Stack(item);
            items.add(stack);
        }
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * Supprime un stack de l'inventaire
     * @param s Stack
     */
    public void supprimer(Stack s){
        items.remove(s);
    }
    
    /**
     * @author Kevin Lamblin
     */
    public void deplacer(){
        
    }
}
