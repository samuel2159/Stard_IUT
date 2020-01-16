/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet;

import Metier.Carte.Carte;
import Metier.Carte.Cases.Case;
import Metier.Carte.Coordonnee;
import Metier.Partie;
import java.util.HashMap;

/**
 *
 * @author Lamblin Kévin
 */
public class Rocher extends ObjetNaturel{

    @Override
    /**
     * @author Kevin Lamblin & Vincent Tantet
     */
    public void Interagir() {
        if (Partie.getPartie().getJoueur().getInventaire().getObjetCourant().getItem().getType().equals("pioche")){
            HashMap<Coordonnee, Case> cases = Carte.getCarte().getNiveauActuel().getCases();
            for (int i = 0; i<cases.size(); i++){
                if (cases.get(i).getObjetCorrespondant() == this){
                    cases.get(i).setObjetCorrespondant(null);
                }
            }
        }
    }

    @Override
    /**
     * @author Kevin Lamblin
     * @return String
     */
    public String getType() {
        return "rocher";
    }
    
}
