/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import stardewvalley.Metier.Carte.Cases.CasePlancher;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Carte.Direction;
import stardewvalley.Metier.Carte.EnumNiveau;
import stardewvalley.Metier.Carte.Niveau;

/**
 *
 * @author Vincent Tantet
 */
public class TestNiveaux {
    @Test
    public void TestGetCases() {
        Niveau lvlMaison = new Niveau(EnumNiveau.Maison,"Maison.txt", 10, 10);
        assertEquals(100,lvlMaison.getCases().size());
    }
    
    @Test
    public void TestGetCase(){
        Niveau lvlMaison = new Niveau(EnumNiveau.Maison,"Maison.txt", 10, 10);
        Coordonnee coord = new Coordonnee(0,0);
        assertEquals(CasePlancher.class, lvlMaison.getCase(coord).getClass());
    }
    
    @Test
    public void TestGetCaseProche(){
        Niveau lvlMaison = new Niveau(EnumNiveau.Maison,"Maison.txt", 10, 10);
        Coordonnee coord = new Coordonnee(1,1);
        assertEquals(CasePlancher.class, lvlMaison.getCaseProche(lvlMaison.getCase(coord), Direction.Bas).getClass());
    }
    
    @Test
    public void TestGetNomNiveau(){
        Niveau lvlMaison = new Niveau(EnumNiveau.Maison,"Maison.txt", 10, 10);
        assertEquals("Maison",lvlMaison.getNomNiveau());
    }
}
