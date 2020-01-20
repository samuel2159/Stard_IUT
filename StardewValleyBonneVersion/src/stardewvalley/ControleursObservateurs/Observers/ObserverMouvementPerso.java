/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Observers;

import stardewvalley.Metier.Mouvement;
import stardewvalley.Vues.VuePersonnage;
import stardewvalley.Metier.Personnages.Personnage;

/**
 *
 * @author ea058452
 */
public class ObserverMouvementPerso extends Observer{

    private VuePersonnage vue;
    private Personnage personnage;

    public ObserverMouvementPerso(VuePersonnage vue, Personnage personnage) {
        this.vue = vue;
        this.personnage = personnage;
    }
    
    
    @Override
    public void update(){
       
        vue.setTranslateX((double)personnage.getPosition().getX());
        vue.setTranslateY((double)personnage.getPosition().getY());
        //vue.updateFace();
    }
    
    public void update(Mouvement m){
       
        vue.setTranslateX((double)personnage.getPosition().getX());
        vue.setTranslateY((double)personnage.getPosition().getY());
        vue.animation(m);
    }    
    
}
