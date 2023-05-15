package com.example.sae.controleur;

import com.example.sae.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.example.sae.modele.Ennemi;
import com.example.sae.modele.Terrain;

import java.net.URL;
import java.util.ResourceBundle;

public class Controleur implements Initializable {


    @FXML
    private Pane PaneauDeJeu;

    @FXML
    private TilePane tilePane;

    private Ennemi personnage;

     private Image imageEnn;
     private Terrain terrain;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int tileSize = 70;
        Terrain t = new Terrain(tileSize); // initialisation du terrain avec une taille de case de 32

        personnage = new Ennemi(0, 0, 40);



        afficherTerrain(t.getTileMap(), tileSize);

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


    private void afficherTerrain(int[][] terrain, int tileSize) {
        URL urlImageSol = Main.class.getResource("sol.png");
        Image imageSol = new Image(String.valueOf(urlImageSol));

        URL urlImageEnn = Main.class.getResource("Alien.png");
        Image imageEnn = new Image(String.valueOf(urlImageEnn));

        URL urlImageSol2 = Main.class.getResource("sol2.png");
        Image imageSol2 = new Image(String.valueOf(urlImageSol2));

        URL urlImageStation = Main.class.getResource("station.png");
        Image imageStation = new Image(String.valueOf(urlImageStation));
        for (int y = 0; y < terrain.length; y++) {
            for (int x = 0; x < terrain[y].length; x++) {
                if (terrain[y][x] == 0) {
                    ImageView iv3 = new ImageView(imageSol2);
                    this.tilePane.getChildren().add(iv3);
                } else if (terrain[y][x] == 1) {
                    ImageView iv1 = new ImageView(imageSol);
                    this.tilePane.getChildren().add(iv1);
                } else if (terrain[y][x] == 2) {
                    ImageView iv4 = new ImageView(imageStation);
                    this.tilePane.getChildren().add(iv4);
                }
            }
        }
    }
}