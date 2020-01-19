package stardewvalley.Vues.Ressources;

import java.util.HashMap;
import javafx.scene.image.Image;

/**
 * Description de la classe
 * @author Matthieu
 */
public class GestionnaireImages {
    
    //DESIGN PATTERN DE LA BIBLIOTHEQUE ----------------------------------------
    private static GestionnaireImages instance;
    private final HashMap<String,Image> listeImage;
    
    public static GestionnaireImages get() {
        if(instance == null) {
            instance = new GestionnaireImages();
        }
        return instance;
    }
    
    //constructeur de la bibliothèque d'images
    private GestionnaireImages() {
        this.listeImage = new HashMap<>();
        //EcranMENU
        this.addImage("Background","MainMenu/background.png");
        this.addImage("Logo","MainMenu/logo.png");
        this.addImage("Creer","MainMenu/creer.png");
        this.addImage("Quitter","MainMenu/quitter.png");
        //Personnages
        this.addImage("Sebastian","Personnages/Sebastian.png");
        //Map
        this.addImage("Cases", "Map/spring.png");
        this.addImage("ObjetPlaces", "Map/spring.png");
    }
    
    //ajout d'une image dans la bibliothèque
    private void addImage(String nom, String nomFichier) {
        this.listeImage.put(nom, new Image("stardewvalley/Vues/Ressources/"+nomFichier));
    }
    
    //getter d'une image
    public static Image getImage(String nom) {
        return get().listeImage.get(nom);
    }
}
