package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse_class extends Figure_class {
    private int grandAxeX;
    private int petitAxeY;

    // Constructeurs
    public Ellipse_class(int px, int py, Color color) {
        super(new Point_class(px, py), color);
        setBoundingBox(0, 0);
    }

    // DRAW

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.petitAxeY = heightBB / 2;
        this.grandAxeX = widthBB / 2;
    }

    // ameliorations pour dessiner dans tous les sens en changeant les points d'origine
    @Override
    public void setBoundingBox(Point_class point1, Point_class point2) {
        //tirer de en haut à gauche vers en bas à droite
        if (point1.getX() < point2.getX() & point1.getY() < point2.getY()) {
            this.petitAxeY = (point2.getY() - point1.getY()) / 2;
            this.grandAxeX = (point2.getX() - point1.getX()) / 2;
        }
        //tirer de en haut à droite vers en bas à gauche
        else if (point1.getX() > point2.getX() & point1.getY() < point2.getY()) {
            Point_class origin = new Point_class(point2.getX(), point1.getY());
            Point_class arriv = new Point_class(point1.getX(), point2.getY());
            super.setOrigin(origin);
            this.petitAxeY = (arriv.getY() - origin.getY()) / 2;
            this.grandAxeX = (arriv.getX() - origin.getX()) / 2;
        }
        //tirer de en bas à gauche vers en haut à droite
        else if (point1.getX() < point2.getX() & point1.getY() > point2.getY()) {
            Point_class origin = new Point_class(point1.getX(), point2.getY());
            Point_class arriv = new Point_class(point2.getX(), point1.getY());
            super.setOrigin(origin);
            this.petitAxeY = (arriv.getY() - origin.getY()) / 2;
            this.grandAxeX = (arriv.getX() - origin.getX()) / 2;
        }
        //tirer de en bas à droite vers en haut à gauche
        else if (point1.getX() > point2.getY() & point1.getY() > point2.getY()) {
            Point_class origin = new Point_class(point2.getX(), point2.getY());
            Point_class arriv = new Point_class(point1.getX(), point1.getY());
            super.setOrigin(origin);
            this.petitAxeY = (arriv.getY() - origin.getY()) / 2;
            this.grandAxeX = (arriv.getX() - origin.getX()) / 2;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        Point_class p = super.getOrigin();
        g.fillOval(p.getX(), p.getY(), 2 * grandAxeX, 2 * petitAxeY);
    }


    //getters et setters methodes
    public int getGrandAxeX() {
        return grandAxeX;
    }

    public void setGrandAxeX(int grandAxeX) {
        this.grandAxeX = grandAxeX;
    }

    public int getPetitAxeY() {
        return petitAxeY;
    }

    public void setPetitAxeY(int petitAxeY) {
        this.petitAxeY = petitAxeY;
    }


    // Override toString
    @Override
    public String toString() {
        return ("l'ellipse de grand axe " + grandAxeX + ", de petit axe " + petitAxeY);
    }
}
