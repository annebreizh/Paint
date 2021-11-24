package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure_class {
    private final Color color;
    private Point_class origin;

    public Figure_class(Point_class origin, Color color) {
        this.color = color;
        this.origin = origin;
    }

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void setBoundingBox(Point_class point1, Point_class point2);

    //constructeurs

    public abstract void draw(Graphics g);


    //methodes getters et setters

    public Color getColor() {
        return color;
    }

    public Point_class getOrigin() {
        return origin;
    }

    public void setOrigin(Point_class origin) {
        this.origin = origin;
    }


    public String toString() {
        return ("point =" + origin + "\ncolor =" + color);
    }
}
