/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import stardewvalley.Metier.Carte.Coordonnee;

/**
 * Case de plancher pour la maison
 * @author Kevin Lamblin
 */
public class CasePlancher extends Case{

    /**
     * @author Kevin Lamblin
     * @param c Coordonne
     */
    public CasePlancher(Coordonnee c) {
        super(c);
    }

    @Override
    public void InteragirCase() {
        
    }

    @Override
    /**
     * @author Kevin Lamblin
     * @return String
     */
    public String getCaseType() {
        return "plancher";
    }
    
}
