package com.example.sae.modele;

import javafx.scene.image.ImageView;

public class Ennemi {
    private int x;
    private int y;
    private int vitesse;

    public Ennemi(int x, int y, int vitesse) {
        this.x = x;
        this.y = y;
        this.vitesse = vitesse;
    }
//    public void deplacerEnnemi(int[][] codesTuiles) {
//        int destX = codesTuiles[0].length - 1;
//        int destY = codesTuiles.length - 1;
//
//        while (x != destX || y != destY) {
//            if (y - 1 >= 0 && codesTuiles[y - 1][x] == 1) {
//                moveUp();
//            } else if (y + 1 < codesTuiles.length && codesTuiles[y + 1][x] == 1) {
//                moveDown();
//            } else if (x - 1 >= 0 && codesTuiles[y][x - 1] == 1) {
//                moveLeft();
//            } else if (x + 1 < codesTuiles[y].length && codesTuiles[y][x + 1] == 1) {
//                moveRight();
//            }
//        }
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
