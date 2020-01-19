/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;

import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.Metier.Personnages.Personnage;
import stardewvalley.ControleursObservateurs.Observers.ObserverMouvementPerso;

/**
 *
 * @author ea058452
 */
public class ControlerDeplacementClavier extends Controler{
    
    private ObserverMouvementPerso observer;
    private Personnage personnage;
    private ListenerClavier listener;
    
    public ControlerDeplacementClavier(ListenerClavier listener, ObserverMouvementPerso o,Personnage personnage){
        this.listener = listener;
        this.observer = o;
        this.personnage = personnage;
    }
    
    public void update(){
         //on change la position en metier
        personnage.deplacer(listener.getMouvement());
        //on change la vue de position aussi
        observer.update(listener.getMouvement());
        
        
    }

    @Override
    public void warn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}