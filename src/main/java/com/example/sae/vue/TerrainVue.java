package com.example.sae.vue;

import com.example.sae.Main;
import com.example.sae.modele.Terrain;
import com.example.sae.modele.Ennemi;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

import java.net.URL;


public class TerrainVue {
    private TilePane tilePane;
    private Terrain terrain;
    private Ennemi ennemi;

    public TerrainVue(Terrain terrain, TilePane tilePane) {
        this.terrain = terrain;
        this.tilePane = tilePane;
        this.ennemi = new Ennemi(0, 0, 1.0); // Initialisation de l'ennemi à la position (0, 0) et vitesse 1.0
    }

    public void afficherTerrain() {
        int[][] codesTuiles = this.terrain.getTileMap();
        URL urlImageSol = Main.class.getResource("sol.png");
        Image imageSol = new Image(String.valueOf(urlImageSol));

        URL urlImageEnn = Main.class.getResource("Alien.png");
        Image imageEnn = new Image(String.valueOf(urlImageEnn));

        URL urlImageSol2 = Main.class.getResource("sol2.png");
        Image imageSol2 = new Image(String.valueOf(urlImageSol2));

        URL urlImageStation = Main.class.getResource("station.png");
        Image imageStation = new Image(String.valueOf(urlImageStation));
        for (int y = 0; y < codesTuiles.length; y++) {
            for (int x = 0; x < codesTuiles[y].length; x++) {
                if (codesTuiles[y][x] == 0) {
                    ImageView iv3 = new ImageView(imageSol2);
                    this.tilePane.getChildren().add(iv3);
                } else if (codesTuiles[y][x] == 1) {
                    ImageView iv1 = new ImageView(imageSol);
                    this.tilePane.getChildren().add(iv1);
                } else if (codesTuiles[y][x] == 2) {
                    ImageView iv4 = new ImageView(imageStation);
                    this.tilePane.getChildren().add(iv4);
                }
            }
        }
    }



    public Ennemi getEnnemi() {
        return ennemi;
    }
}
