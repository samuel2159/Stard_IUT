/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjet;

import Metier.Objet.Porte;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ab899799
 */
public class TestPorte {
    
    public TestPorte() {
    }
   
    @Test
    public void TestGetType()
    {
        Porte p = new Porte();
        assertEquals(p.getType(),"porte");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
