package fr.ensea.projet2A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {
    private Color c;
    private final ArrayList<Figure_class> list;
    private String nameFigure;
    private Point_class point1;
    private Point_class point2;
    private Rectangle_class figure;

    public Drawing(){
        this.setBackground(Color.white);
        list = new ArrayList<>();
        c = Color.black;
        point1 = new Point_class(0,0);
        point2 = new Point_class(0,0);
        nameFigure = "Rectangle";
        figure = null;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public ArrayList<Rectangle_class> getList() {
        return list;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        point1 = new Point(e.getX(),e.getY());
        switch (nameFigure){
            case "Rectangle" :
                list.add(figure = new Rectangle_class(point1.getX(), point1.getY(), c));
                break;

            case "Square" :
                list.add(figure = new Square_class(point1.getX(), point1.getY(), c));
                break;

            case "Ellipse" :
                list.add(figure = new Ellipse_class(point1.getX(), point1.getY(), c));
                break;

            case "Circle" :
                list.add(figure = new Cercle_class(point1.getX(), point1.getY(), c));
                break;
        }
        System.out.println(list);
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        point2 = new Point(e.getX(),e.getY());
        figure.setBoundingBox(point1,point2);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public String toString() {
        return "Drawing{" +
                "c=" + c +
                ", list=" + list +
                ", nameFigure='" + nameFigure + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        for (Rectangle_class figure:list){
            figure.draw(g);
            repaint();
        }
    }

}