package fr.ensea.projet2A;

import java.awt.Color;

public class Cercle_class extends Ellipse_class {
    private float r; //rayon
    private Color color;


    public Cercle_class(int px, int py, Color color) {
        super(px, py, color);
    }

    public void affiche() { //Affichage des données de la classe
        System.out.println(" Rayon : " + r);
    }
}
