package fr.ensea.projet2A;

public class Point_class {
    private int X;
    private int Y;

    //constructeur
    public Point_class () {
       X = 0;
       Y = 0;
    }

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

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public String toString() {
        return ("(X,Y) = (" + this.X + "," + this.Y + ")");
    }

}
