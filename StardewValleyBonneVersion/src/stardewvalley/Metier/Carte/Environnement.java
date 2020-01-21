/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import stardewvalley.Metier.Carte.Cases.Case;

/**
 * Correspond à la couche environnement d'un niveau
 * @author Kevin Lamblin
 */
public class Environnement {
    
    EnumNiveau nom;
    
     public Environnement(EnumNiveau nom,String fichier, int largeurNiveau, int hauteurNiveau){
        this.nom = nom;
         //Génération du niveau
                try{
                       FileInputStream file = new FileInputStream("src/stardewvalley/Vues/Ressources/Environnements/"+fichier);//Ouverture du fichier contenant le niveau
                       int lettre;//Caractère qui sera lu dans le fichier

                        Case c;
                        Coordonnee coord;
                        
                        int ligne = 0;
                            while( ligne < largeurNiveau){
                                int colonne = 0;                                
                                while(colonne < hauteurNiveau){
                                    coord = new Coordonnee(ligne, colonne);
                                    c = Carte.getNiveauActuel().getCase(coord);
                                    
                                    if((lettre = file.read()) != -1){
                                        FabriqueEnvironnement.CreationEnvironnement(c, (char)lettre);
                                    }
                                    colonne++;
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
}
