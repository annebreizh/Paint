package fr.ensea.projet2A;

public class Point_class {
    private final int X;
    private final int Y;

    //constructeur
    public Point_class (int a, int b){
        this.X = a;
        this.Y = b;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }


    public String toString() {
        return ("(X,Y) = (" + this.X + "," + this.Y + ")");
    }

}
