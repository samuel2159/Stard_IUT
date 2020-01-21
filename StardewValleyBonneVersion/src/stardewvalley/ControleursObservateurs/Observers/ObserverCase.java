/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Observers;

import java.util.ArrayList;
import stardewvalley.ControleursObservateurs.Controlers.ControlerClickSouris;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Vues.Carte.Cases.VueCase;

/**
 *
 * @author Vincent Tantet
 */
public class ObserverCase extends Observer{

    private ArrayList<VueCase> vuesCase;
    private ControlerClickSouris controler;
    
    public ObserverCase(ArrayList<VueCase> vc){
        this.vuesCase = vc;
    }
    @Override
    public void update() {
        Coordonnee coord = controler.getListener().getCoordonnee();
        VueCase vueCase = null;
        for (VueCase vue : vuesCase){
            if(vue.getCase().getCoordonnee().getX() == coord.getX() && vue.getCase().getCoordonnee().getY() == coord.getY())
                vueCase = vue;
        }
        if (vueCase != null)
            vueCase.update();
    }
    
    public void setControler(ControlerClickSouris ccs){
        this.controler = ccs;
    }
}
