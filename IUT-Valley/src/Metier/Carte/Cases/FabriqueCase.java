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
public class FabriqueCase {
    
    public static Case CreationCase(Coordonnee coord, Character s){
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
            default :
                c = null;
                break;
        }
        
        return c;
    }
}
