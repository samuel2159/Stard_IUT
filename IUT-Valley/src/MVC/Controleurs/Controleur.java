/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Controleurs;

import MVC.Observables.Observable;

/**
 *
 * @author Astérisk
 */
public abstract class Controleur extends Observable{
    
    public abstract void Update();
}
