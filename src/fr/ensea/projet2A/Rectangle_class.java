package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle_class {
    private double longueur;
    private double largeur;
    private Color color;
    //private int lenght = 0;
    //private int width = 0;

    //constructeur
    public Rectangle_class (double px, double py, Color c){
        this.longueur = px;
        this.largeur = py;
        this.color = c;
    }

    // DRAW

    public void draw (Graphics g){

    }

    //getters methodes
    public Color getColor() {
        return color;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    //setters methodes
    public void setLongueur(double px) {
        this.longueur = px;
    }

    public void setLargeur(double py) {
        this.largeur = py;
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        longueur = heightBB;
        largeur = widthBB;
    }

    /*public String toString() {
        return ("px ="+px+ "\npy =+px+\ncolor =" +c);
    }
}*/
    public double perimetre() {
        return (this.longueur + this.largeur) * 2;
    }

    public double aire() {
        return longueur * largeur;
    }

    //override toString
    @Override
    public String toString() {
        return "-Longueur : " + this.longueur + " -Largeur : " + this.largeur
                + " -Perimetre : " + this.perimetre() + " -Aire : "
                + this.aire() + "Couleur :"+ color;
    }

}
