package org.example;

public class Triangolo extends Forma {
    public double Base;
    private double Altezza;
    public Triangolo(double Base, double Altezza) {
        this.Base = Base;
        this.Altezza = Altezza;
    }

    @Override
    public double Area() {
        return (Base * Altezza) / 2.0;
    }
}
