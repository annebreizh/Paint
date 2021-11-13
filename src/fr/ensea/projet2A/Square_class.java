package fr.ensea.projet2A;

import java.awt.Color;

public class Square_class extends Rectangle_class {

    public Square_class(int px, int py, Color color) {
        super(px,py,color);
        setBoundingBox(0,0);
    }

    // Methods

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        if (widthBB<=heightBB){
            setLongueur(widthBB);
            setLargeur(widthBB);
        }
        else{
            setLargeur(heightBB);
            setLongueur(heightBB);
        }
    }

    @Override
    public void setBoundingBox(Point_class point1, Point_class point2) {
        super.setBoundingBox(point1, point2);
        if (getLargeur() < getLongueur()){
            setLongueur(getLargeur());
            //tirer de en haut à droite vers en bas à gauche
            if(point1.getX() > point2.getX() & point1.getY() < point2.getY()){
                Point_class origin = new Point_class(point1.getX()-getLargeur(),point1.getY());
                super.setOrigin(origin);
            }
            //tirer de en bas à droite vers en haut à gauche
            if(point1.getX() > point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point1.getX()-getLargeur(),point2.getY());
                super.setOrigin(origin);
            }
        }
        else {
            setLargeur(getLongueur());
            //tirer de en bas à droite vers en haut à gauche
            if(point1.getX() > point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point2.getX(),point1.getY()-getLongueur());
                super.setOrigin(origin);
            }
            //tirer de en bas à gauche vers en haut à droite
            if(point1.getX() < point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point1.getX(),point1.getY()-getLongueur());
                super.setOrigin(origin);
            }
        }
    }

    //getter et setter
    @Override
    public void setLongueur(int length){
        super.setLongueur(length);
    }

    @Override
    public void setLargeur(int largeur) {
        super.setLargeur(largeur);
    }
}