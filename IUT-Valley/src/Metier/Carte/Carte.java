/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.*;
import Metier.Objet.ObjetPlace;
import Metier.Objet.Sapin;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Singleton
 * @author Kevin Lamblin 
 */
public class Carte {

    private HashMap<Coordonnee,Case> cases = new HashMap(); //Liste des cases composant la carte du jeu
    private static Carte instance = null; //Unique instance de la carte
    public static int X = 50; //Taille de la carte en largeur (modifier la valeur)
    public static int Y = 50; //Taille de la carte en longueur (modifier la valeur)
    
    

    private Carte(){
        
        //Double bloucle d'initialisation des cases
        for(int i = 0; i < X; i++){
            for(int j = 0; j < Y; j++){
                //Créer une nouvelle case et l'ajoute à la liste de cases avec ses coordonnées
                Coordonnee coord = new Coordonnee(i,j);
                Case c;
                if(i%15==0)
                    c = new CaseEau(coord);
                else
                    c = new CaseTerre(coord);
                if(i==2 && j==2)
                    c.setObjetCorrespondant(new Sapin());
                
                cases.put(coord, c);                                           
            }
        }
    }
    
    
    /**
     * @author Kevin Lamblin
     * Fonction qui renvoie l'unique instance de la carte
     * @return Carte
     */
    public static Carte getCarte(){
        
        //Créer une carte si elle n'éxiste pas déjà
        if(instance == null){
            instance = new Carte();
        }
        return instance;
    }
    
    /**
     * @author Kevin Lamblin
     * @return HashMap
     */
    public HashMap<Coordonnee,Case> getCases(){
        return cases;
    }
    
    public Case getCase(int x,int y){
        Case retour = null;
        for(Case c : cases.values()){
            if(c.getCoordonnee().getX() == x && c.getCoordonnee().getY() == y)
                retour = c;
        }
        return retour;
    }
    
    /**
     * Renvoie la liste des objetsCorespondants des cases autour de c
     * @param c
     * @return 
     */
    public ArrayList<ObjetPlace> getObjetsAdjacentes(Coordonnee c){
        ArrayList<ObjetPlace> adjacentes = new ArrayList<ObjetPlace>();
                
        for(int i=-1;i<=1;i++){                
                for(int j=-1;j<=1;j++){
                   Coordonnee coord = new Coordonnee(c.getX()+i,c.getY()+j);
                   if(this.getCases().get(coord)!=null)
                        adjacentes.add(this.getCases().get(coord).getObjetCorrespondant());
                   else
                       adjacentes.add(null);
                }                    
            }
        return adjacentes;
    }
    
}
