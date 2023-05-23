package com.example.sae.vue;

import com.example.sae.Main;
import com.example.sae.modele.Acteur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;

public class EnnemisVue {

    private Image imageEnn ;
    private Pane panneauJeu;

    public EnnemisVue(Pane panneauJeu) {
        this.panneauJeu = panneauJeu;
        URL urlImageEnn = Main.class.getResource("Alien.png");
        imageEnn = new Image(String.valueOf(urlImageEnn));
    }

    public void créerSprite(Acteur personnage) {
        ImageView iv2 = new ImageView(imageEnn);
        iv2.translateXProperty().bind(personnage.xProperty());
        iv2.translateYProperty().bind(personnage.yProperty());
        this.panneauJeu.getChildren().add(iv2);

    }

}
