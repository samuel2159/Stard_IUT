/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;

import stardewvalley.ControleursObservateurs.Listeners.ListenerSouris;
import stardewvalley.Metier.Carte.Carte;
import stardewvalley.Metier.Carte.Cases.Case;

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
        Case c = Carte.getCarte().getNiveauActuel().getCase(listener.getCoordonnee());
        if (c.getObjetCorrespondant() == null){
            c.InteragirCase();
        }
        else{
            c.InteragirObjet();
        }
    }
    
    @Override
    public void warn() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
