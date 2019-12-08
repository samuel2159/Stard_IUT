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
    
    private HashMap<Integer, ItemInInventory> favoris; //Liste des objets de la barre de raccourcis
    private Item ObjetCourant; //Objet courant, dans la liste des favoris
    private HashMap<Integer, ItemInInventory> items; //Liste des objets dans l'inventaire(sur 36 emplacements)
    
    /**
     * @author Kevin Lamblin
     * Crée un inventaire
     */
    public Inventaire() {
        favoris = new HashMap<>();
        items = new HashMap<>();
    }

    /**
     * @author Kevin Lamblin
     * Donne la liste des items
     * @return HashMap
     */
    public HashMap getItems(){
        return items;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne l'objetCourant
     * @return Item
     */
    public Item getObjetCourant(){
        return ObjetCourant;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne les favoris
     * @return HashMap
     */
    public HashMap getFavoris(){
        return favoris;
    }
    
    /**
     * @author Kevin Lamblin
     * Actualise l'inventaire pour les emplacement notamment
     */
    public void actualiserInventaire(){
        favoris.clear(); //Clear la liste des favoris
        for(int i = 0; i < 12; i++){
            ItemInInventory item = items.get(i); //Récupère les 12 premiers items de l'invantaire
            favoris.put(i, item); //Et le place dans les favoris
        }
    }
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * ajoute un item a l'inventaire
     * @param item Item
     * @throws Exception
     */
    public void ajouter(Item item) throws Exception{
        
        //Si l'inventaire est plein on renvoie une exception
        if(items.size() >= 36){
            throw new Exception("Inventory full");
        }
        //Sinon on ajoute l'Item là ou il y a de la place
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
    
    /**
     * @author Thiburce Tommy && Kevin Lamblin
     * Supprime un item de l'inventaire
     * @param item Item
     * @param Quantite int
     */
    public void supprimer(Item item, int Quantite){
        boolean res = false;
        int j = 1;
        do{
            if(item == items.get(j).getItem()){
                items.get(j).setQuantite(Quantite);
                res = true;
            }
            j += 1;
        }while(res == false);
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
