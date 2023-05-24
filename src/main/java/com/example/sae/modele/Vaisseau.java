package com.example.sae.modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;



public abstract class Vaisseau {

    private IntegerProperty x,y;
    private int v; // vitesse de deplacement
    protected Terrain terrain;
    private int pv;
    public Vaisseau(int x, int y, int v, Terrain terrain, int pv) {
        this.pv=pv;
        this.x=new SimpleIntegerProperty(x);
        this.y = new SimpleIntegerProperty(y);
        this.v = v;
        this.terrain=terrain;
    }

    public Vaisseau(int v, Terrain terrain, int pv) {
        this.pv=pv;
        this.x=new SimpleIntegerProperty(0);
        this.y = new SimpleIntegerProperty(1);
        this.v = v;
        this.terrain=terrain;

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

    public abstract void seDeplace();




    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }


}