package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse_class extends Rectangle_class {
    private int grandAxe;
    private int petitAxe;
    private Color color;

    // Constructor
    public Ellipse_class(int px, int py, Color color) {
        super(px, py, color);
    }

    // DRAW

    public void draw (Graphics g){

    }


    //getters methodes
    public Color getColor() {
        return color;
    }

    public int getPerimeter() {
        Double temp = (double) (petitAxe * petitAxe + grandAxe * grandAxe) / 2;
        return (int) (2 * Math.PI * Math.sqrt(temp));
    }

    public int getSurface() {
        return (int) Math.PI * grandAxe * petitAxe;
    }

    // Override toString
    @Override
    public String toString() {
        return ("l'ellipse de grand axe "+grandAxe + ", de petit axe " + petitAxe);
    }
}
