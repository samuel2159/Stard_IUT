/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Carte.Cases;
import Metier.Carte.Coordonnee;

/**
 *
 * @author tommy saucey
 */
public class CaseEau extends Case{
    /**
     * @author Tommy Saucey
     * @param c 
     */
    public CaseEau(Coordonnee c) {
        super(c);
    }
    /**
     * @author Tommy Saucey
     */
    @Override
    public void InteragirCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @author Tommy Saucey
     * @return 
     */
    @Override
    public String getCaseType() {
        
        return "eau";
    }
     /**
     * @author Tommy Saucey
     * @param c Coordonnee
     */
}
