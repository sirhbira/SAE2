package com.example.sae.modele;

import javafx.collections.ObservableList;

public class Terrain {

    private int[][] tileMap;
    private int tileSize;
    private ObservableList<Acteur> acteurs;


    public Terrain(int tileSize) {

        this.tileSize = tileSize;
        this.tileMap = new int[][]{
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 2}
        };
    }
    public ObservableList<Acteur> getActeurs() {
        return acteurs;
    }

    public int[][] getTileMap() {
        return tileMap;
    }

    public void setTileMap(int[][] tileMap) {
        this.tileMap = tileMap;
    }

    public int getTileSize() {
        return tileSize;
    }

    public void setTileSize(int tileSize) {
        this.tileSize = tileSize;
    }



//    public boolean dansTerrain (int x,int y){
//        return (0<= x&& x<this.width && 0<= y&& y < this.height);
//    }
}
