/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Observables;

import MVC.Observers.Observer;
import java.util.ArrayList;

/**
 *
 * @author telli
 */
public class Observable {
    
    private ArrayList<Observer> inscrits;
    
    public void update(String message){
        for(Observer o : inscrits){
            o.update(message);
        }
    }
    
    public void register(Observer o){
        inscrits.add(o);
    }
    
    public void unregister(Observer o){
        inscrits.remove(o);
    }
    
    public void notifyObserver(){
        
    }
    
}
