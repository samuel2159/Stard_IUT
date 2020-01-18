/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Arbres;

import stardewvalley.Metier.Objet.ObjetsPlace.ObjetNaturel;

/**
 * Arbre du jeu
 * @author Kevin Lamblin
 */

public abstract class Arbre extends ObjetNaturel{
    
    /**
     * @author Kevin Lamblin
     * Donne la famille arbre
     * @return String
     */
    @Override
    public String getFamille(){
        return "arbre";
    }
}
