/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import Metier.Carte.Cases.*;
import static Metier.Carte.Cases.FabriqueCase.CreationCase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;



/**
 * Singleton
 * @author Kevin Lamblin 
 */
public class Carte {

    private HashMap<Coordonnee,Case> cases = new HashMap(); //Liste des cases composant la carte du jeu
    private static Carte instance = null; //Unique instance de la carte
    public static int X = 20; //Taille de la carte en largeur (modifier la valeur)
    public static int Y = 20; //Taille de la carte en longueur (modifier la valeur)
    
    

    private Carte(){
                //Génération de la carte
                try{
                       FileInputStream file = new FileInputStream("src/Ressources/Carte.txt");//Ouverture du fichier contenant la carte
                        int lettre;//Caractère qui sera lu dans le fichier
                        //String ligne = "";
                        Case c;
                        while((lettre = file.read()) != -1){ 
                            //ligne += (char)lettre;
                            for (int i = 1; i <= Y; i++){
                                for(int j = 1; j <= X; j++){
                                    Coordonnee coord = new Coordonnee(X, Y);
                                    c = CreationCase(coord, (char)lettre);
                                    cases.put(coord, c);
                                }
                            }
                        }
                        //System.out.println(ligne);
                    }
                catch(FileNotFoundException e){
                    System.err.println("Fichier introuvable");
                }
                catch(IOException e2){
                    System.err.println("Erreur dans la lecture du fichier");
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
    
    /**
     * @author Samuel Tellier
     * @param x
     * @param y
     * @return 
     */
    public Case getCase(int x,int y){
        Case retour = null;
        
        for(Case c : cases.values()){
            if(c.getCoordonnee().getX() == x && c.getCoordonnee().getY() == y)
                retour = c;
        }
        return retour;
    }

    /**
     * @author Samuel Tellier && Kévin Lamblin
     * @param c Case   
     * @param d Direction
     * @return Case
     */
    public Case getCaseProche(Case c, Direction d){
        Case retour = null;
        switch(d){
            case HautGauche: 
                retour = getCase(c.getCoordonnee().getX()-1, c.getCoordonnee().getY()-1);
                break;            
            case Haut: 
                retour = getCase(c.getCoordonnee().getX(), c.getCoordonnee().getY()+1);
                break;
            case HautDroit: 
                retour = getCase(c.getCoordonnee().getX()+1, c.getCoordonnee().getY()-1);
                break;
            case Gauche: 
                retour = getCase(c.getCoordonnee().getX()-1, c.getCoordonnee().getY());
                break;
            case Droit: 
                retour = getCase(c.getCoordonnee().getX()+1, c.getCoordonnee().getY());
                break;
            case BasGauche: 
                retour = getCase(c.getCoordonnee().getX()-1, c.getCoordonnee().getY()-1);
                break;  
            case Bas: 
                retour = getCase(c.getCoordonnee().getX(), c.getCoordonnee().getY()-1);
                break;
            case BasDroit: 
                retour = getCase(c.getCoordonnee().getX()+1, c.getCoordonnee().getY()-1);
                break;            
        }
        return retour;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = true;
        if (getClass() != obj.getClass() || obj == null) {
            res = false;
        }
        final Carte other = (Carte) obj;
        if (!Objects.equals(this.cases, other.cases)) {
            res = false;
        }
        return res;
    }
}
