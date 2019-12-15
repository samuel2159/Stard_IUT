/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte;

import Metier.Carte.Cases.Case;
import static Metier.Carte.Cases.FabriqueCase.CreationCase;
import Metier.Objet.HerbeSauvage;
import Metier.Objet.Rocher;
import Metier.Objet.Sapin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author Kevin
 */
public class Niveaux {
    
    private HashMap<Coordonnee,Case> cases = new HashMap(); //Liste des cases composant la carte du niveau
    private String nom;
    
    public Niveaux(String nom,String fichier, int x, int y){
        this.nom = nom;
         //Génération du niveau
                try{
                       FileInputStream file = new FileInputStream("src/Ressources/Niveaux/"+fichier);//Ouverture du fichier contenant le niveau
                       int lettre;//Caractère qui sera lu dans le fichier

                        Case c = null;
                        Coordonnee coord = null;
                        int i = 0;                        
                        
                            while( i < x){
                                int j = 0;                                
                                while(j < y){
                                    
                                    if((lettre = file.read()) != -1){
                                        coord = new Coordonnee(j, i);
                                        c = CreationCase(coord, (char)lettre); 
                                        if(i == 15 && j == 12)
                                            c.setObjetCorrespondant(new Sapin());
                                        if(i == 12 && j == 10)
                                            c.setObjetCorrespondant(new Sapin());
                                        if(i == 10 && j == 10)
                                            c.setObjetCorrespondant(new Rocher());
                                        if(i == 10 && j == 12)
                                            c.setObjetCorrespondant(new HerbeSauvage());                                        
                                    }

                                    if(c != null){
                                        cases.put(coord, c);
                                         j++;
                                    }
                                }
                                i++;
                            }                        

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
     * @return HashMap 
     */
    public HashMap<Coordonnee,Case> getCases(){
        return cases;
    }
    
    /**
     * @author Samuel Tellier
     * @param x int
     * @param y int
     * @return Case
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
                retour = getCase(c.getCoordonnee().getX(), c.getCoordonnee().getY()-1);
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
                retour = getCase(c.getCoordonnee().getX()-1, c.getCoordonnee().getY()+1);
                break;  
            case Bas: 
                retour = getCase(c.getCoordonnee().getX(), c.getCoordonnee().getY()+1);
                break;
            case BasDroit: 
                retour = getCase(c.getCoordonnee().getX()+1, c.getCoordonnee().getY()+1);
                break;            
        }
        return retour;
    }
    
    public String getNomNiveau(){
        return nom;
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
        final Niveaux other = (Niveaux) obj;
        if (!Objects.equals(this.cases, other.cases)) {
            res = false;
        }
        return res;
    }
}
