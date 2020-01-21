/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Observers;

import stardewvalley.Metier.Personnages.Inventaire.Inventaire;
import stardewvalley.Vues.Inventaire.VueInventaire;

/**
 *
 * @author telli
 */
public class ObserverInventaire extends Observer{

    private VueInventaire vue;
    
    public ObserverInventaire(VueInventaire vue,Inventaire i){
        this.vue = vue;
    }
    
    @Override
    public void update() {
        
    }
    
    public void update(boolean isOuvert){
        if(isOuvert){
            vue.afficher();
        }
        else
            vue.fermer();
    }
    
}
