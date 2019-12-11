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
    

    private Item objetCourant; //Objet courant, dans la liste des favoris
    private HashMap<Integer, ItemInInventory> items; //Liste des objets dans l'inventaire(sur 36 emplacements)

    
    /**
     * @author Kevin Lamblin
     */
    public Inventaire() {
        items = new HashMap<>();
        objetCourant = items.get(1).getItem();
    }

    /**
     * @author Thiburce Tommy
     * Donne l'objet courant
     * @return Item
     */
    public Item getObjetCourant(){
        return objetCourant;
    }
    /**
     * @author Thiburce Tommy
     * @return HashMap
     */
    public HashMap<Integer, ItemInInventory> getItem(){  
        return items;
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * ajoute un item a l'inventaire
     * @param item Item
     * @throws Exception
     */
    public void ajouter(Item item) throws Exception{
       
        for(ItemInInventory i : items.values()){
            if(item.equals(i.getItem())){ //Ajoute l'item si il est déjà dans l'inventaire
                i.ajoutQuantite(1);
            }
            else if (items.size() == 35){ //Si l'inventaire est plein : erreur
                throw new Exception("Inventory full");
            }
            else{
                int j = 1;
                boolean res = false;
                do{
                    if(items.get(j) == null){ //Si il y a de la place à cet emplacement
                       ItemInInventory NItem = new ItemInInventory(item); //Créer l'item
                        items.put(j, NItem); //L'ajoute à la liste
                        res = true; //Sort de la boucle
                    }
                    j += 1;
                }while(res == false);
            }
        }
    }
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * Supprime un item de l'inventaire
     * @param item Item
     * @param Quantite int
     * @throws java.lang.Exception
     */
    public void supprimer(Item item, int Quantite) throws Exception{
        boolean res = false;
        int j = 1;
        do{
            if(item == items.get(j).getItem()){
                if(items.get(j).getQuantite() >= Quantite){
                    items.get(j).ajoutQuantite(Quantite);
                    if(items.get(j).getQuantite() == 0){
                        items.get(j).setItem(null);
                    }
                    res = true;
                }
                else{
                    throw new Exception("Pas assez d'objets à supprimer");
                }
            }
            j += 1;
        }while(res == false);
    }
    
    /**
     * @author Kevin Lamblin
     * Déplace un item dans l'inventaire
     * @param i Integer
     * @param item Item
     */
    public void deplacer(Integer i, ItemInInventory item){
        ItemInInventory tempExistant = item;
        int positionExistant = 0;
        int intTemp = 0;
        
        for(ItemInInventory it : items.values()){
            if(item.equals(it)){
                positionExistant = intTemp;
            }
            intTemp += 1;
        }
        
        if(items.get(i).getItem().equals(null)){

            items.get(i).setItem(tempExistant.getItem());
            items.get(i).setQuantite(tempExistant.getQuantite());
            items.remove(positionExistant, item);
        }
        else{
            items.get(positionExistant).setItem(items.get(i).getItem());
            items.get(positionExistant).setQuantite(items.get(i).getQuantite());
            items.get(i).setItem(tempExistant.getItem());
            items.get(i).setQuantite(tempExistant.getQuantite());
        }
    }
}
