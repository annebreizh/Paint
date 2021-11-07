package fr.ensea.projet2A;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure_class {
    private Point_class Point;
    private Color color;
    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);

    //constructeurs
    public Figure_class (){
        color = new Color(255,0,0);
        Point = new Point_class(0,0);
    }
    public Figure_class (Point_class Point, Color color){
        this.color = color;
        this.Point = Point;
    }

    public Color getColor() {
        return color;
    }

    public Point_class getPoint() {
        return Point;
    }

    public abstract int getPerimeter();
    public abstract int getSurface();

    public String toString() {
        return ("point ="+Point+ "\ncolor =" +color);
    }
}
