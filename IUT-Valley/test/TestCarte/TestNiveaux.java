/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Cases.CasePlancher;
import Metier.Carte.Direction;
import Metier.Carte.Niveaux;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Vincent Tantet
 */
public class TestNiveaux {
    @Test
    public void TestGetCases() {
        Niveaux lvlMaison = new Niveaux("Maison","Maison.txt", 10, 10);
        assertEquals(100,lvlMaison.getCases().size());
    }
    
    @Test
    public void TestGetCase(){
        Niveaux lvlMaison = new Niveaux("Maison","Maison.txt", 10, 10);
        assertEquals(CasePlancher.class, lvlMaison.getCase(0, 0).getClass());
    }
    
    @Test
    public void TestGetCaseProche(){
        Niveaux lvlMaison = new Niveaux("Maison","Maison.txt", 10, 10);
        assertEquals(CasePlancher.class, lvlMaison.getCaseProche(lvlMaison.getCase(1,1), Direction.Bas).getClass());
    }
    
    @Test
    public void TestGetNomNiveau(){
        Niveaux lvlMaison = new Niveaux("Maison","Maison.txt", 10, 10);
        assertEquals("Maison",lvlMaison.getNomNiveau());
    }
}
