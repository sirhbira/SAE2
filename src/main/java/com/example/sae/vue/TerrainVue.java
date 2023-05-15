package com.example.sae.vue;

import com.example.sae.modele.Terrain;
import com.example.sae.modele.Ennemi;


public class TerrainVue {
    private Terrain terrain;
    private Ennemi ennemi;

    public TerrainVue(Terrain terrain) {
        this.terrain = terrain;
        this.ennemi = new Ennemi(0, 0, 1.0); // Initialisation de l'ennemi à la position (0, 0) et vitesse 1.0
    }

    public void afficherTerrain(){
        // Affichage du terrain
        int[][] tileMap = terrain.getTileMap();
        for (int i = 0; i < tileMap.length; i++) {
            for (int j = 0; j < tileMap[0].length; j++) {
                // Affichage de la tuile
            }
        }
    }



    public Ennemi getEnnemi() {
        return ennemi;
    }
}
