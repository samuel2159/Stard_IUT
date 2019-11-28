/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet;

import Metier.Objet.ObjetNaturel;
import Metier.Objet.ObjetPlace;

/**
 *
 * @author telli
 */
public class Terre extends ObjetNaturel {
    
    private EtatTerre etat; //Etat de la terre (de base ou bêchée)

    public Terre() {
    }

    @Override
    public void Interagir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return "terre";
    }
    
    /**
     * @author Kevin Lamblin
     * @return EtatTerre
     */
    public EtatTerre getEtat(){
        return etat;
    }    
    
}
