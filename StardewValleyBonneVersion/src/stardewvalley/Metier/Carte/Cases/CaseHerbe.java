/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import java.util.logging.Level;
import java.util.logging.Logger;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante.MaisPlante;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante.PanaisPlante;
import stardewvalley.Metier.Partie;

/**
 * Case herbe
 * @author Kevin Lamblin
 */
public class CaseHerbe extends Case{

    public boolean becher = false; //Indique si la case d'herbe est bêchée
    public boolean arroser = false; //Indique si la case est arrosée
    
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public CaseHerbe(Coordonnee c) {
        super(c);
    }

    @Override
    /**
     * @author Kevin Lamblin
     */
    public void InteragirCase() {
        if(Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getType().equals("beche")){
            becher = true;
        }
        
        if(Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getType().equals("arrosoir")){
            arroser = true;
        }
        
        if(Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getFamille().equals("graine")){
                
            switch(Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getType()){
                case "graineMais" :
                    this.setObjetCorrespondant(new MaisPlante());
                    try {
                        Partie.getPartie().getJoueur().getInventaire().Supprimer(Partie.getPartie().getJoueur().getInventaire().getObjetCourant(), 1);
                    } catch (Exception ex) {

                    }
                    break;
                case "grainePanais" :
                    this.setObjetCorrespondant(new PanaisPlante());
                    try {
                        Partie.getPartie().getJoueur().getInventaire().Supprimer(Partie.getPartie().getJoueur().getInventaire().getObjetCourant(), 1);
                    } catch (Exception ex) {

                    }
                    break;
            }
        }
    }

    @Override
    /**
     * @author Kevin Lamblin
     * @param String
     */
    public String getCaseType() {
        return "herbe";
    }
    
    /**
     * @author Kevin Lamblin    
     * @return boolean
     */
    public boolean getBecher(){
        return becher;
    }
    
    /**
     * @author Kevin Lamblin
     * @return boolean
     */
    public boolean getArroser(){
        return arroser;
    }
    
}
