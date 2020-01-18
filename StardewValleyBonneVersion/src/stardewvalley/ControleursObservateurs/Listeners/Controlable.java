/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Listeners;

/**
 *
 * @author ea058452
 */
import java.util.ArrayList;
import stardewvalley.ControleursObservateurs.Controlers.Controler;



public interface Controlable {
    
    
    public void update();
    
    public void addControleur(Controler c);
}
