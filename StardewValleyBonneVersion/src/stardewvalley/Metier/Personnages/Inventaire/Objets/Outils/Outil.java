/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages.Inventaire.Outils;

import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 *
 * @author Tommy Saucey
 */
public abstract class Outil extends Objet {
    
   
    public abstract String getType();
    
    
    public String getFamille(){
        return "Outil";
    }
    
}
