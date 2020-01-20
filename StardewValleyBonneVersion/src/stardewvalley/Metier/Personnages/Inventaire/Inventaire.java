/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages.Inventaire;

import java.util.ArrayList;
import stardewvalley.Metier.Personnages.Inventaire.Objets.NullItem;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;


/**
 * Inventaire d'un personnage
 * @author Lamblin Kevin
 */
public class Inventaire {
    
    Stack objetCourant; //Objet courant de la barre d'inventaire compris dans les 12 premies slots
    ArrayList<Stack> inventaire; //Liste de tous les objets dans l'inventaire
    
    /**
     * @author Kevin Lamblin && Vincent Tantet
     * Création d'un inventaire et initialisation des 36 cases à null
     */
    public Inventaire(){
        inventaire = new ArrayList<>();
        for(int i = 0; i < 36; i++){
            inventaire.add(null);
        }
        objetCourant = inventaire.get(1);
    }
    
    /**
     * @author Kevin Lamblin
     * Donne la liste des objets de l'inventaire
     * @return ArrayList
     */
    public ArrayList<Stack> getInventaire(){
        return inventaire;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne l'objet tenu par le joueur
     * @return Stack
     */
    public Stack getObjetCourant(){
        return objetCourant;
    }
    
    /**
     * @author Kevin Lamblin && Vincent Tantet
     * @param item Objet
     * @throws Exception 
     */
    public void Ajout(Objet item) throws Exception{
        /*
        for(Stack s : inventaire)
        {
            if(s.getItem().getType().equals(item.getType()))
                s.ajoutQuantite(1);
            else{
                if(inventaire.size() <= 36)
                    inventaire.add(new Stack(item));
                else    
                    throw new Exception("inventaire plein");
            }
                
        }*/
        
        int position = 0;
        int size = inventaire.size();
        boolean exit = false;
        boolean exit2 = false;
        
        if(!inventaire.isEmpty()){ 
            do{
                if(inventaire.get(position).getItem().getType().equals(item.getType())){
                    inventaire.get(position).ajoutQuantite(1);
                    exit = true;
                }
                position ++;
            }while( position != size && !exit);
        }
        if(!exit){
            position = 0;
            if(size < 36){
                do{
                    if(inventaire.get(position).equals(null)){
                        inventaire.set(position, new Stack(item));
                        exit2 = true;
                    }
                    position ++;
                }while(!exit2);
            }
            else{
                throw new Exception("Inventory full");
            }
        }
    }
    
    /**
     * @author Kevin Lamblin
     * Supprime un stack de l'inventaire
     * @param s Stack
     * @param quantite int
     * @throws Exception 
     */
    public void Supprimer(Stack s, int quantite) throws Exception{
        if(s.getQuantite() < quantite){
            throw new Exception("Invalid value");
        }
        else if(s.getQuantite() == quantite){
            for(int i = 1; i <= 36; i++){
                if(inventaire.get(i).equals(s)){
                    inventaire.remove(i);
                    inventaire.add(i, new Stack(new NullItem()));
                }
            }
        }
        else{
            s.ajoutQuantite(-quantite);
        }
    }
    
    /**
     * @author Kevin Lamblin && Vincent Tantet
     * @param aDeplacer Stack
     * @param posVoulue int
     */
    public void deplacer(Stack aDeplacer, int posVoulue){
        int oldPos = 0;
        Stack newStack;
        
        int compteur = 1;
        do{
            if(inventaire.get(compteur).equals(aDeplacer)){
                oldPos = compteur;
            }
            compteur ++;
            
        }while(compteur <= 36 && oldPos == 0);
        
        if(inventaire.get(posVoulue).getItem().getType().equals("null")){
            inventaire.set(posVoulue, aDeplacer);
            inventaire.set(oldPos, new Stack(new NullItem()));
        }
        else{
            newStack = inventaire.get(posVoulue);
            inventaire.set(posVoulue, aDeplacer);
            inventaire.set(oldPos, newStack);
        }
    }
}
