package com.example.sae.modele;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Ennemi extends Acteur {


    private int ligne;
    private int colonne;
    private int c;


    public Ennemi(int vitesse, Terrain terrain, int pv) {
        super(16, 0, vitesse, terrain, pv);
        this.ligne = 0;
        this.colonne = 1;
        this.c = 0;
    }

    public boolean arrive(){
        if(terrain.getTileMap()[ligne][colonne] ==2 ){
            return true;
        }
        return false;
    }

    @Override
    public void seDeplace() {
        if (terrain.getTileMap()[ligne][colonne + 1] == 1 || terrain.getTileMap()[ligne][colonne + 1] == 2) {
            setX(this.getX() + 1);
            c++;
            if (c == 16) {
                c = 0;
                colonne++;
            }
        } else {
            if (terrain.getTileMap()[ligne + 1][colonne] == 1) {
                setY(this.getY() + 1);
                c++;
                if (c == 16) {
                    c = 0;
                    ligne++;
                }
            }
        }
    }
}


