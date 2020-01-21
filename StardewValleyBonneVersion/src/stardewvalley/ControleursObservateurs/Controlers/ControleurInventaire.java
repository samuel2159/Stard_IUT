/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;

import stardewvalley.ControleursObservateurs.Listeners.ListenerClavier;
import stardewvalley.ControleursObservateurs.Observers.ObserverInventaire;
import stardewvalley.Metier.Personnages.Inventaire.Inventaire;

/**
 *
 * @author telli
 */
public class ControleurInventaire extends Controler{
    
    private ObserverInventaire observer;
    private Inventaire inventaire;
    private ListenerClavier listener;    
    
    public ControleurInventaire(ListenerClavier listener,ObserverInventaire observer,Inventaire inventaire){
        this.observer = observer;
        this.inventaire = inventaire;
        this.listener = listener;
    }

    public void update(){
        observer.update(listener.inventaireEstOuvert());
    }
    
    @Override
    public void warn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
