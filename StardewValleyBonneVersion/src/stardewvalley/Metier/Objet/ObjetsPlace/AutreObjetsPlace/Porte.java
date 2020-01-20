/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace.AutreObjetsPlace;

import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Objet.ObjetsPlace.ObjetPlace;
import static stardewvalley.Metier.Carte.EnumNiveau.*;

/**
 *
 * @author Kevin Lamblin 
 */
public class Porte extends ObjetPlace{

    @Override
    /**
     * @author Kevin Lamblin
     * Ouverture de la porte
     */
    public void Interagir() {
        if(Carte.getNiveauActuel().getNomNiveau().equals(Ferme))
        {
            Carte.setNiveauActuel(Maison);
        }
        else if(Carte.getNiveauActuel().getNomNiveau().equals(Maison))
        {
            Carte.setNiveauActuel(Maison);
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
