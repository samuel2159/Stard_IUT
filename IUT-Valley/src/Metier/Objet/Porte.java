/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet;

import Metier.Carte.Carte;

/**
 *
 * @author Kevin Lamblin 
 */
public class Porte extends ObjetPlace{

    @Override
    /**
     * @author Kevin Lamblin
     */
    public void Interagir() {
        if(Carte.getCarte().getNiveauActuel().getNomNiveau().equals("Ferme"))
        {
            Carte.getCarte().setNiveauActuel("Maison");
        }
        else if(Carte.getCarte().getNiveauActuel().getNomNiveau().equals("Maison"))
        {
            Carte.getCarte().setNiveauActuel("Maison");
        }
        
    }

    @Override
    /**
     * @author Kevin Lamblin
     * @return String
     */
    public String getType() {
        return "porte";
    }
    
}
