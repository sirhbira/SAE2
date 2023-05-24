package com.example.sae.controleur;


import com.example.sae.modele.Vaisseau;
import com.example.sae.vue.EnnemisVue;
import com.example.sae.vue.TerrainVue;
import com.example.sae.vue.VaisseauxVue;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import com.example.sae.modele.Ennemi;
import com.example.sae.modele.Terrain;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controleur implements Initializable {

    @FXML
    private Button boutonVague;

    @FXML
    private Pane PaneauDeJeu;

    @FXML
    private TilePane tilePane;

    private Timeline gameLoop;

    private Ennemi personnage;

     private Image imageEnn;

     private Terrain terrain;

     private Vaisseau vaiseau;


    @FXML
    ImageView boutonVague(ActionEvent event) {
        if (boutonVague.isPressed()){
            personnage = new Ennemi(4,terrain,100);
            ImageView iv2 = new ImageView(imageEnn);


            iv2.translateXProperty().bind(personnage.xProperty());
            iv2.translateYProperty().bind(personnage.yProperty());
            return iv2;
        }
        return null;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        terrain = new Terrain(40); // initialisation du terrain avec une taille de case de 32
        TerrainVue tv = new TerrainVue(terrain, tilePane);
        tv.afficherTerrain();

        EnnemisVue ennemisVue = new EnnemisVue(PaneauDeJeu);

        personnage = new Ennemi(4, terrain, 100);
        ennemisVue.créerSprite(personnage);

        VaisseauxVue vaisseauxVue = new VaisseauxVue(PaneauDeJeu);

        vaiseau = new Vaisseau(50,70,terrain,50);
        vaisseauxVue.créerSprite(vaiseau);


        initAnimation();
        gameLoop.play();

//        ListChangeListener<Ennemi> listen = new ListObs();
//        terrain.getActeurs().addListener(listen);



        }


    private void initAnimation() {
        gameLoop = new Timeline();
         gameLoop.setCycleCount(Timeline.INDEFINITE);

        KeyFrame kf = new KeyFrame(
                // on définit le FPS (nbre de frame par seconde)
                Duration.seconds(0.1),
                // on définit ce qui se passe à chaque frame
                // c'est un eventHandler d'ou le lambda
                (ev ->{
                    personnage.seDeplace();
                })
        );
        gameLoop.getKeyFrames().add(kf);
    }


}