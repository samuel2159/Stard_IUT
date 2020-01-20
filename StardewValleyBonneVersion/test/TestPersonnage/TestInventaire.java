/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPersonnage;

import Metier.Personnage.Inventaire;
import Metier.Personnage.Item.Mais;
import Metier.Personnage.Item.Panais;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ab899799
 */
public class TestInventaire{
    
    @Test
    public void TestAjouter1() throws Exception{
        
    
        Mais m = new Mais();
        Mais m1 = new Mais();
        Inventaire inv = new Inventaire();
        inv.ajouter(m);
        inv.ajouter(m1);
        
         for(int i = 1; i<=36; i++)
         {
             if (inv.getStacks().get(i).getItem().getType().equals(m.getType()))
             {
                 assertEquals(2,inv.getStacks().get(i).getQuantite());
                
             }
         }
    }
    
      @Test
    public void TestAjouter2() throws Exception{
        
    
        Mais m = new Mais();
        Panais p = new Panais();
        Inventaire inv = new Inventaire();
        inv.ajouter(p);
        inv.ajouter(m);
        
        assertEquals(m, inv.getStacks().get(2).getItem());/*
         for(int i = 1; i<=36; i++)
         {
             if (inv.getItem().get(i).getItem().getType().equals(m.getType()))
             {
                 //assertEquals(1,inv.getItem().get(i).getQuantite());
                 
             }
         }*/
    }
        
        
    }
    
   
