package com.example.sae.modele;

public class Terrain {

    private int[][] tileMap;
    private int tileSize;

    public Terrain(int tileSize) {
        this.tileSize = tileSize;
        this.tileMap = new int[][]{
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 2},
        };
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
}
