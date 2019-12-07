/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;

import Metier.Carte.Carte;
import Metier.Carte.Coordonnee;

/**
 *
 * @author telli
 */
public class CaseTerre extends Case{

    public CaseTerre(Coordonnee coord, Carte carte) {
        super(coord,carte);
    }

    @Override
    public void InteragirCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCaseType() {
        return "terre";
    }
/*
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CaseTerre other = (CaseTerre) obj;

        return true;
    }*/
    
    
}
