package com.example.sae.modele;


public class Ennemi {
    private double x, y; // position de l'ennemi
    private double moveSpeed;

    public Ennemi(int x, int y, double moveSpeed) {
        this.x = x;
        this.y = y;
        this.moveSpeed = moveSpeed;
    }


    // Getters et setters
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp(){
        y-=moveSpeed;
    }

    public void moveDown (){
        y+=moveSpeed;
    }

    public void moveLeft (){
        x-=moveSpeed;
    }
    public void moveRight (){
        x+=moveSpeed;
    }
}
