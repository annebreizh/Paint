package fr.ensea.projet2A;

public class Point_class {
    private final int X;
    private final int Y;

    //constructeur
    public Point_class (int a, int b){
        this.X = a;
        this.Y = b;
    }

    //getters et setters methodes
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }




    //toString
    public String toString() {
        return ("(X,Y) = (" + this.X + "," + this.Y + ")");
    }

}
