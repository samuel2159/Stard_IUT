/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte;

import stardewvalley.Metier.Carte.Cases.Case;
import static stardewvalley.Metier.Carte.Cases.FabriqueCase.CreationCase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Arbres.Sapin;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Rocher;

/**
 *
 * @author Kevin Lamblin
 */
public class Niveau {
    
    private HashMap<Coordonnee,Case> cases = new HashMap<>(); //Liste des cases composant la carte du niveau
    private EnumNiveau nom;
    
    
    //TODO déplacer le x,y dans le fichier
    public Niveau(EnumNiveau nom,String fichier, int largeurNiveau, int hauteurNiveau){
        this.nom = nom;
         //Génération du niveau
                try{
                       FileInputStream file = new FileInputStream("src/stardewvalley/Vues/Ressources/Niveaux/"+fichier);//Ouverture du fichier contenant le niveau
                       int lettre;//Caractère qui sera lu dans le fichier

                        Case c = null;
                        Coordonnee coord = null;
                        int ligne = 0;  
                            while( ligne < largeurNiveau){
                                int colonne = 0;                                
                                while(colonne < hauteurNiveau){
                                    c = null;
                                    if((lettre = file.read()) != -1){
                                        coord = new Coordonnee(colonne, ligne);
                                        c = CreationCase(coord, (char)lettre); 
                                        
                                        //test sapin
                                        if(ligne == 20 && colonne == 20)
                                            c.setObjetCorrespondant(new Sapin());
                                        if(ligne == 12 && colonne == 10)
                                            c.setObjetCorrespondant(new Sapin());
                                        if(ligne == 10 && colonne == 10)
                                            c.setObjetCorrespondant(new Rocher());
                                        /*if(ligne == 10 && colonne == 12)
                                            c.setObjetCorrespondant(new HerbeSauvage());     */                                   
                                    }

                                    if(c != null){
                                        cases.put(coord, c);
                                        colonne++;
                                    }
                                }
                                ligne++;
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
    public Collection<Case> getCases(){
        return cases.values();
    }
    
    /**
     * @author Samuel Tellier
     * @param x int
     * @param y int
     * @return Case
     */
    public Case getCase(int x,int y){
        Coordonnee coordonnee = new Coordonnee(x,y);
        return cases.get(coordonnee);
    }
    
    public Case getCase(Coordonnee c) {
        return cases.get(c);
    }
    
    /**
     * @author Samuel Tellier && Kévin Lamblin
     * @param c Case   
     * @param d Direction
     * @return Case
     */
    public Case getCaseProche(Case c, Direction d){
        return getCase(c.getCoordonnee().plusDirection(d));
    }
    
    /**
     * @author Kevin Lamblin
     * renvoie le nom du niveau
     * @return String
     */
    public EnumNiveau getNomNiveau(){
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
        final Niveau other = (Niveau) obj;
        if (!Objects.equals(this.cases, other.cases)) {
            res = false;
        }
        return res;
    }
}
