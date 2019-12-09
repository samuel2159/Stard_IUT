/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Listener;

import IHM.MenuPerso;
import IHM.MenuPrincipal;
import MVC.Controleurs.Controleur;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author ea058452
 */
public class HandlerPerso implements EventHandler<MouseEvent>{
    
    private MenuPerso source;
    private ArrayList<Controleur> listeControleur;
    
    public HandlerPerso(MenuPerso source) {
        this.source = source;
        this.listeControleur = new ArrayList<>();
    }
    
    private void avertirControleur() {
        for(Controleur c : this.listeControleur) {
            c.Update();
        }
    }
    public void ajouterControleur(Controleur c){
        this.listeControleur.add(c);
    }

    @Override
    public void handle(MouseEvent arg0) {
        avertirControleur();
    }
}
