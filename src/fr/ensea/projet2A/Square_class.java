package fr.ensea.projet2A;

import java.awt.Color;

public class Square_class extends Rectangle_class {

    public Square_class(int px, int py, Color color) {
        super(px, py, color);
    }

    // Methods
    public void setBoundingBox(int sideBB) {
        super.setBoundingBox(sideBB, sideBB);
        System.out.println("longueur du carré " + sideBB);

    }
}