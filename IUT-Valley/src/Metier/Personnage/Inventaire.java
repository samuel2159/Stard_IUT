/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage;

import Metier.Personnage.Item.Item;
import java.util.HashMap;

/**
 * Inventaire
 * @author Kevin Lamblin
 */
public class Inventaire {
    
    private Item ObjetCourant;//Objet courant
    private HashMap<Integer, Stack> items;//Liste des objets dans l'inventaire(sur 36 emplacements)
    
    /**
     * Constructeur d'inventaire
     * @author Kevin Lamblin
     */
    public Inventaire() {
        items = new HashMap<>();        
    }

    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * Renvoie la liste des items de l'inventaire
     * @return HashMap
     */
    public HashMap<Integer, Stack> getItem(){  
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
        for(int i = 1; i<=36; i++){
            if(items.get(i).getItem().getType().equals(item.getType())){
                items.get(i).ajoutQuantite(1);
            }
            //Si l'inventaire est plein on renvoie une exception
            else if(items.size() >= 36){
                throw new Exception("Inventory full");
            }
            //Sinon on ajoute l'Item
            else{
                Stack stack = new Stack(item);
                items.put(i, stack);
            }
        }  
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * Supprime un nombre d'objet de l'inventaire
     * @param s Stack
     * @param quantite
     * @throws Exception
     */
    public void supprimer(Stack s, int quantite) throws Exception{
        if(s.getQuantite() < quantite){
            throw new Exception("Invalid value");
        }
        else if(s.getQuantite() == quantite){
            for(int i = 1; i<= 36; i++){
                if(items.get(1).equals(s)){
                    items.remove(i);
                }
            }
        }
        else{
            s.ajoutQuantite(-quantite);
        }
    }
    
    /**
     * @author Kevin Lamblin
     * Déplace un stack d'objet à la place d'un autre
     * @param s Stack
     * @param i int
     */
    public void deplacer(Stack s, int i){
        
        int oldPos = 0;        
        Stack newStack;
        
        for(int j = 1; j <= 36; j++){
            if(items.get(j).equals(s)){
                oldPos = j;
            }
        }
        
        if(items.get(i).equals(null)){
            items.put(i, s);
            items.remove(oldPos);
        }
        else{
            newStack = items.get(i);
            items.replace(i, s);
            items.replace(oldPos, newStack);
        }
    }
}
