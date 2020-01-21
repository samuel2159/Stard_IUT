package stardewvalley.Metier.Carte;

import stardewvalley.Metier.Carte.Cases.Case;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetNaturel.Arbres.Sapin;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetNaturel.HerbeSauvage;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetNaturel.Rocher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Lamblin
 */
public class FabriqueEnvironnement {
    
    public static void CreationEnvironnement(Case c, char s){
        
        switch(s){
            case 'S' :
                c.setObjetCorrespondant(new Sapin());
                break;
            case 'R' :
                c.setObjetCorrespondant(new Rocher());
                break;
            case 'H' :
                c.setObjetCorrespondant(new HerbeSauvage());
                break;
            case ' ' :
                break;
            default :
                break;
        }
    }
}
