/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import stardewvalley.Metier.Carte.Coordonnee;

/**
 * Case de terre
 * @author Kevin Lamblin
 */
public class CaseTerre extends Case{

    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public CaseTerre(Coordonnee c) {
        super(c);
    }

    @Override
    /**
     * @author Kevin Lamblin   
     * @return String
     */
    public String getCaseType() {
        return "terre";
    }

    @Override
    /**
     * @author Kevin Lamblin
     */
    public void InteragirCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
