/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Coordonnee;

/**
 * Case de plancher pour la maison
 * @author Kevin Lamblin
 */
public class CasePlancher extends Case{

    public CasePlancher(Coordonnee c) {
        super(c);
    }

    @Override
    public void InteragirCase() {
        
    }

    @Override
    public String getCaseType() {
        return "plancher";
    }
    
}
