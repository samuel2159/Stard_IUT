/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import stardewvalley.Vues.Scenes.pSceneMenu.SceneMenu;

/**
 *
 * @author ea058452
 */
public class Main extends Application {
    
    private Scene sceneCourante;
    private static Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {

        //Mémorisation du stage pour les changement de scène
        Main.primaryStage = primaryStage;
        
        //creation de la scène
        this.sceneCourante = new SceneMenu(new Pane(), 1100, 662); 
        
        //création de la fenêtre
        primaryStage.setTitle("Stardew Valley");
        primaryStage.setScene(sceneCourante);
        primaryStage.show();
        
    }

    public static void changementScene(Scene s){
        primaryStage.setScene(s);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
