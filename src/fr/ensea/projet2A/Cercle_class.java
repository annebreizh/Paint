package fr.ensea.projet2A;

import java.awt.Color;

public class Cercle_class extends Ellipse_class {

    public Cercle_class(int px, int py, Color color) {
        super(px, py, color);
        setBoundingBox(0,0);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        if (widthBB<=heightBB){
            setGrandAxeX(widthBB/2);
            setPetitAxeY(widthBB/2);
        }
        else{
            setGrandAxeX(heightBB/2);
            setPetitAxeY(heightBB/2);
        }
    }

    // ameliorations pour dessiner dans tous les sens en changeant les points d'origine
    @Override
    public void setBoundingBox(Point_class point1, Point_class point2) {
        super.setBoundingBox(point1, point2);
        if (getPetitAxeY() < getGrandAxeX()){
            setGrandAxeX(getPetitAxeY());
            //tirer de en haut à droite vers en bas à gauche
            if(point1.getX() > point2.getX() & point1.getY() < point2.getY()){
                Point_class origin = new Point_class(point1.getX()-2*getPetitAxeY(),point1.getY());
                super.setOrigin(origin);
            }
            //tirer de en bas à droite vers en haut à gauche
            if(point1.getX() > point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point1.getX()-2*getPetitAxeY(),point2.getY());
                super.setOrigin(origin);
            }
        }
        else {
            setPetitAxeY(getGrandAxeX());
            //tirer de en bas à droite vers en haut à gauche
            if(point1.getX() > point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point2.getX(),point1.getY()-2*getGrandAxeX());
                super.setOrigin(origin);
            }
            //tirer de en bas à gauche vers en haut à droite
            if(point1.getX() < point2.getX() & point1.getY() > point2.getY()){
                Point_class origin = new Point_class(point1.getX(),point1.getY()-2*getGrandAxeX());
                super.setOrigin(origin);
            }
        }
    }

    //getters et setters methodes
    //ici ils ne sont pas necessaires mais si on souhaite modifier le code, il vaut mieux les mettre
    @Override
    public int getGrandAxeX() {
        return super.getGrandAxeX();
    }

    @Override
    public int getPetitAxeY() {
        return super.getPetitAxeY();
    }

    @Override
    public void setGrandAxeX(int grandAxeX) {
        super.setGrandAxeX(grandAxeX);
    }

    @Override
    public void setPetitAxeY(int petitAxeY) {
        super.setPetitAxeY(petitAxeY);
    }
}
