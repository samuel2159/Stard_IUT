/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Controleurs;

import MVC.Observables.Observable;
import MVC.Observers.Observer;
import MVC.Vue.Vue;
import java.util.ArrayList;

/**
 *
 * @author Astérisk
 */
public abstract class Controleur extends Observable{
    
    private ArrayList<Vue> subs = new ArrayList();
    
    public Controleur(){
        
    }
    
    
    public ArrayList<Vue> getSubs(){
        return subs;
    }
    
    public void Subcribe(Vue v){
        subs.add(v);
    }
}
