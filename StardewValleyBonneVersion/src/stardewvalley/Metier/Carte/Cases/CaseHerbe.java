/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante.MaisPlante;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante.PanaisPlante;
import stardewvalley.Metier.Partie;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Graines.GraineMais;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Graines.GrainePanais;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Mais;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Panais;

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
        
        if(Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getType().equals(null)){
            try{
                switch(this.getObjetCorrespondant().getType()){
                    case "Mais" :
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new Mais());
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new GraineMais());
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new GraineMais());
                        break;
                    case "Panais" :
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new Panais());
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new GrainePanais());
                        Partie.getPartie().getJoueur().getInventaire().Ajout(new GrainePanais());
                        break;
                    default :
                        break;
            }
            }catch(Exception ex){
                
            }
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
                default :
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
