/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages.Inventaire.Objets.Graines;

import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 * Graine en général
 * @author Kevin Lamblin
 */
public abstract class Graine extends Objet{

    @Override
    /**
     * @author Kevin Lamblin
     * @return String
     */
    public abstract String getType();
    
    @Override
    /**
     * @author Kevin Lamblin
     * Donne la famille graine 
     * @return Strings
     */
    public String getFamille(){
        return "graine";
    }
    
}
