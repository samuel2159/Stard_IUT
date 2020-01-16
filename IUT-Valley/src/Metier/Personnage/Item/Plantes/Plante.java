/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Personnage.Item.Plantes;

import Metier.Personnage.Item.Item;

/**
 *
 * @author Vincent Tantet
 */
public class Plante extends Item{
    
    public Plante(String type){
        super(type);
    }
    
    @Override
    public String getFamille() {
        return "plantes";
    }
    
}
