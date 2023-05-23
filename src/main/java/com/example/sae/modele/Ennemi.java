package com.example.sae.modele;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Ennemi extends Acteur{

    public Ennemi( int vitesse,Terrain terrain,int pv) {
        super(17, 0, vitesse,terrain,pv);

    }




    @Override
    public void seDeplace() {
        // Implémentation de la méthode pour faire se déplacer l'ennemi



        this.setY(this.getY() + 1);
        for (int y = 0; y < terrain.getTileMap().length; y++) {
            for (int x = 0; x < terrain.getTileMap().length; x++) {
                if (terrain.getTileMap()[y][x] == 1) {
                    setY(this.getY() + 1);
                }
            }
        }
    }




//
//    public void moveUp() {
//        y -= vitesse;
//    }
//
//    public void moveDown() {
//        y += vitesse;
//    }
//
//    public void moveLeft() {
//        x -= vitesse;
//    }
//
//    public void moveRight() {
//        x += vitesse;
//    }
}
