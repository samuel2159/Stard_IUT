/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;

import stardewvalley.Metier.Partie;

/**
 *
 * @author simonetma
 */
public class ControleurCreerPartie extends Controler {

    @Override
    public void warn() {
        Partie.create();
        this.update();
    }
    
}
