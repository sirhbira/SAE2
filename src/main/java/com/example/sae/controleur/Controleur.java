package com.example.sae.controleur;


import com.example.sae.Main;
import com.example.sae.vue.TerrainVue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import com.example.sae.modele.Ennemi;
import com.example.sae.modele.Terrain;

import java.net.URL;
import java.util.ResourceBundle;

public class Controleur implements Initializable {

    @FXML
    private Button boutonVague;

    @FXML
    private Pane PaneauDeJeu;

    @FXML
    private TilePane tilePane;

    private Ennemi personnage;

     private Image imageEnn;

     private Terrain terrain;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        terrain = new Terrain(100); // initialisation du terrain avec une taille de case de 32
        TerrainVue tv = new TerrainVue(terrain, tilePane);
        tv.afficherTerrain();

        URL urlImageEnn = Main.class.getResource("Alien.png");
        imageEnn = new Image(String.valueOf(urlImageEnn));

       personnage = new Ennemi(0,0,40);
            ImageView iv2 = new ImageView(imageEnn);
            this.PaneauDeJeu.getChildren().add(iv2);


    }


    @FXML
    private void moveUp(){
        personnage.moveUp();
        ImageView iv2 = new ImageView(imageEnn);
        iv2.setY(personnage.getY());
    }

    @FXML
    private void moveDown(){
        personnage.moveDown();
        ImageView iv2 = new ImageView(imageEnn);
        iv2.setY(personnage.getY());
    }
    @FXML
    private void moveLeft(){
        personnage.moveLeft();
        ImageView iv2 = new ImageView(imageEnn);
        iv2.setX(personnage.getX());
    }
    @FXML
    private void moveRight(){
        personnage.moveRight();
        ImageView iv2 = new ImageView(imageEnn);
        iv2.setX(personnage.getX());
    }



}