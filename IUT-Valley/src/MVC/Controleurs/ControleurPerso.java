/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Controleurs;

import MVC.Controleurs.Controleur;
import Metier.Carte.Coordonnee;
import Metier.Personnage.Personnage;

/**
 *
 * @author ea058452
 */
public class ControleurPerso extends Controleur {
    
    private Personnage personnage;
    private int vitesse = 25;
    
    public ControleurPerso(Personnage p){
        
    }

    @Override
    public void update(String message) {
        if(message.equals("haut")){
            personnage.Deplacer(new Coordonnee(0, -vitesse));
            System.out.println(personnage.getPosition());
        }
        
        else if(message.equals("bas")){
            personnage.Deplacer(new Coordonnee(0, vitesse));
        }   
        
        else if(message.equals("gauche")){
            personnage.Deplacer(new Coordonnee(-vitesse, 0));
        }  
        
        else if(message.equals("droit")){
            personnage.Deplacer(new Coordonnee(vitesse, 0));
        }         
        
        super.update(message);
        
            
    }
}
