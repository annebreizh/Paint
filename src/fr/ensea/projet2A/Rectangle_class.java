package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle_class extends Figure_class {
    private int longueur;
    private int largeur;

    //constructeur
    public void Rectangle_class(){
        this.longueur=0;
        this.largeur=0;
    }
    public Rectangle_class (int px, int py, Color c){
        super(new Point_class(px,py),c);
        setBoundingBox(0,0);
    }

    // DRAW
    @Override
    public void draw (Graphics g){
        g.setColor(super.getColor());
        Point_class p = super.getOrigin();
        g.fillRect(p.getX(),p.getY(),longueur,largeur);
    }


    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.largeur=heightBB;
        this.longueur=widthBB;
    }

    public void setBoundingBox(Point_class point1, Point_class point2) {
        //tirer de en haut à gauche vers en bas à droite
        if (point1.getX() < point2.getX() & point1.getY() < point2.getY()){
            this.largeur = point2.getY() - point1.getY();
            this.longueur = point2.getX() - point1.getX();
        }
        //tirer de en haut à droite vers en bas à gauche
        else if (point1.getX() > point2.getX() & point1.getY() < point2.getY()){
            Point_class origin = new Point_class(point2.getX(),point1.getY());
            Point_class arriv = new Point_class(point1.getX(),point2.getY());
            super.setOrigin(origin);
            this.largeur = arriv.getY() - origin.getY();
            this.longueur = arriv.getX() - origin.getX();
        }
        //tirer de en bas à gauche vers en haut à droite
        else if (point1.getX() < point2.getX() & point1.getY() > point2.getY()){
            Point_class origin = new Point_class(point1.getX(),point2.getY());
            Point_class arriv = new Point_class(point2.getX(),point1.getY());
            super.setOrigin(origin);
            this.largeur = arriv.getY() - origin.getY();
            this.longueur = arriv.getX() - origin.getX();
        }
        //tirer de en bas à droite vers en haut à gauche
        else if (point1.getX() > point2.getY() & point1.getY() > point2.getY()){
            Point_class origin = new Point_class(point2.getX(), point2.getY());
            Point_class arriv = new Point_class(point1.getX(), point1.getY());
            super.setOrigin(origin);
            this.largeur = arriv.getY()-origin.getY();
            this.longueur = arriv.getX()-origin.getX();
        }
    }

    //getter et setter

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
//override toString

    @Override
    public String toString() {
        return "Rectangle_class{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
