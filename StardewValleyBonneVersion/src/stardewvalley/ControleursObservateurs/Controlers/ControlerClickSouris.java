/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;

import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.ControleursObservateurs.Listeners.ListenerSouris;
import stardewvalley.ControleursObservateurs.Observers.ObserverMouvementPerso;
import stardewvalley.Metier.Personnages.Personnage;

/**
 *
 * @author Vincent Tantet
 */
public class ControlerClickSouris extends Controler{

    private ListenerSouris listener;
    
    public ControlerClickSouris(ListenerSouris listener){
        this.listener = listener;
    }
    
    public void update(){
        //TODO
    }
    
    @Override
    public void warn() {
        //TODO
    }
    
}
