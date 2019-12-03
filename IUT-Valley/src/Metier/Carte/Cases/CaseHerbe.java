/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Coordonnee;

/**
 *
 * @author Kevin Lamblin
 */
public class CaseHerbe extends Case{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /**
     * @author Kevin Lamblin
     */
    public String getCaseType() {
        return "herbe";
    }
    
}
