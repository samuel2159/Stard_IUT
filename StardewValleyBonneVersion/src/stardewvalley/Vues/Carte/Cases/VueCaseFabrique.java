/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.Cases;

import stardewvalley.Metier.Carte.Cases.Case;

/**
 *
 * @author simonetma
 */
public class VueCaseFabrique {
    
    public static VueCase create(Case c) {
        VueCase res = null;
        switch(c.getCaseType()) {
            case "terre" : res = new VueCaseTerre(c); break;
            case "eau" : res = new VueCaseEau(c); break;
            case "herbe" : res = new VueCaseHerbe(c); break;
        }
        return res;
    }
}
