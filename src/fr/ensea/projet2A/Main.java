package fr.ensea.projet2A;

public class Main {
    static public void main (String[] args){
        Point_class point1 = new Point_class(5,2);
        System.out.println(point1);
        //Figure_class figure1 = new Figure_class (point1, Color.blue);
        new Window ("Paint it black", 800,600);
    }
}
