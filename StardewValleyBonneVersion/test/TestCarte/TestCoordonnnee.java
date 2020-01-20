/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import stardewvalley.Metier.Carte.Coordonnee;

/**
 *
 * @author Kevin Lamblin
 */
public class TestCoordonnnee {
    
    @Test
    public void TestGetSetXY(){
        //Création d'une coodonnee
        Coordonnee c = new Coordonnee(1,2);
        
        //Vérification getX
        assertEquals(1, c.getX());
        
        //Vérification getY
        assertEquals(2, c.getY());
        
        //Vérification setX
        c.setX(3);
        assertEquals(3, c.getX());
        
       //Vérification setY
       c.setY(4);
        assertEquals(4, c.getY());
    }
}
