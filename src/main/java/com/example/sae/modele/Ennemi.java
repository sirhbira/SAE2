package com.example.sae.modele;

import javafx.scene.image.ImageView;

public class Ennemi extends Acteur{
    private int x;
    private int y;
    private int vitesse;

    public Ennemi(int x, int y, int vitesse) {
        super();
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
    }



    @Override
    public void decrementerPv(int n) {

    }

    @Override
    public void seDeplace() {

    }

    public void moveUp() {
        y -= vitesse;
    }

    public void moveDown() {
        y += vitesse;
    }

    public void moveLeft() {
        x -= vitesse;
    }

    public void moveRight() {
        x += vitesse;
    }
}
