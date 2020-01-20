/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Inventaire;

import stardewvalley.Metier.Personnages.Inventaire.Inventaire;
import stardewvalley.Metier.Personnages.Inventaire.Objets.Objet;

/**
 *
 * @author telli
 */
public class VueInventaire {
    
    Inventaire inventaire;
    
    public VueInventaire(Inventaire i){
        inventaire = i;
    }
    
    private void afficher(){
        for(Objet o : inventaire.getObjets()){
            
        }
    }
    
}
