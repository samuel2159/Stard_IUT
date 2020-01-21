/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Vues.Carte.Cases;

import javafx.geometry.Rectangle2D;
import stardewvalley.Metier.Carte.Cases.Case;
import stardewvalley.Metier.Carte.Cases.CaseTerre;

/**
 *
 * @author telli
 */
public class VueCaseTerre extends VueCase{
    private CaseTerre c;
    public VueCaseTerre(Case c){
        super();
        this.c = (CaseTerre)c;
        this.setViewport(new Rectangle2D(16+1,7*16+1,14,14)); 
        /* if(Carte.getCarte().getCaseProche(c, Direction.Gauche).getCaseType().equals("herbe"))
            sprite.setViewport(new Rectangle2D(0,144,14,14)); ;*/
    }

    @Override
    public Case getCase() {
        return c;
    }

    @Override
    public void setCase(Case c) {
        this.c = (CaseTerre)c;
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
