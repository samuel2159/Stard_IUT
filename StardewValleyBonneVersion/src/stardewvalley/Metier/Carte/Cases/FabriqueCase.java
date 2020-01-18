/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Carte.Cases;

import stardewvalley.Metier.Carte.Coordonnee;

/**
 * Fabrique les cases
 * @author Kevin Lamblin
 */
public class FabriqueCase {
    
    public static Case CreationCase(Coordonnee coord, char s){
        Case c;
        
        switch(s){
            case 'T' : 
                c = new CaseTerre(coord);
                break;
            case 'H' :
                c = new CaseHerbe(coord);
                break;
            case 'E' : 
                c = new CaseEau(coord);
                break;
            case 'P' :
                c = new CasePlancher(coord);
                break;
            default :
                c = null;
                break;
        }
        
        return c;
    }
}
