/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Controlers;


import java.util.ArrayList;
import stardewvalley.ControleursObservateurs.Observers.Observer;
/**
 *
 * @author ea058452
 */

public abstract class Controler implements Observable{
    
    ArrayList<Observer> observers = new ArrayList<>();
    
    public Controler(){
        
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public ArrayList<Observer> getObservers(){
        return observers;
    }
    
    public abstract void warn();
    
    @Override
    public void update(){
        for(Observer o : observers){
            o.update();
        }
    }
    
}
