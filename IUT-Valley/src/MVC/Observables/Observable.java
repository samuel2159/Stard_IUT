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
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void register(Observer o){
        observers.add(o);
    }
    
    public void unregister(Observer o){
        observers.remove(o);
    }
    
    public void Notify(){
        for(Observer o : observers)
            o.update(o);
    }
    
}
