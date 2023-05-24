package com.example.sae.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Ennemi {

    private IntegerProperty x,y;
    private int v; // vitesse de deplacement
    protected Terrain terrain;
    private int pv;
    private int ligne;
    private int colonne;
    private int c;
    private int direction;


    public Ennemi(int v, Terrain terrain, int pv) {
        this.pv=pv;
        this.x=new SimpleIntegerProperty(16);
        this.y = new SimpleIntegerProperty(0);
        this.v = v;
        this.terrain=terrain;
        this.ligne = 0;
        this.colonne = 1;
        this.c = 0;
        this.direction = 0;
    }

    public IntegerProperty xProperty(){
        return x;
    }

    public IntegerProperty yProperty(){
        return y;
    }


    public final int getX(){
        return this.xProperty().getValue();
    }

    public final void setX (int n){
        this.xProperty().setValue(n);
    }


    public final int getY(){
        return this.yProperty().getValue();
    }

    public final void setY (int n){
        this.yProperty().setValue(n);
    }

    public boolean estVivant() {
        return this.pv>0;
    }

    public void meurt(){
        this.pv=0;
    }


    public void decrementerPv(int n) {
        this.pv -= n;
    }

    public void seDeplace() {
        if (terrain.getTileMap()[ligne][colonne] == 2) {
            setX(this.getX());
        }else {
            if (terrain.getTileMap()[ligne][colonne + 1] == 1 || terrain.getTileMap()[ligne][colonne + 1] == 2 ) {
                setX(this.getX() + v);
                c=c+v;
                if (c >= 16) {
                    c = 0;
                    colonne++;
                }
            } else {
                if (terrain.getTileMap()[ligne + 1][colonne] == 1) {
                    setY(this.getY() + v);
                    c=c+v;
                    if (c >= 16) {
                        c = 0;
                        ligne++;
                    }
                }

            }
        }
    }

}