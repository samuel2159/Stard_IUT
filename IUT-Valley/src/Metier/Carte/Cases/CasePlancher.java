/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Coordonnee;

/**
 *
 * @author Kevin
 */
public class CasePlancher extends Case{

    public CasePlancher(Coordonnee c) {
        super(c);
    }

    @Override
    public void InteragirCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCaseType() {
        return "plancher";
    }
    
}
