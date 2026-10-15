package org.example;

public class Rettangolo extends Forma {
    private double Base;
    private double Altezza;
    public Rettangolo(double Base, double Altezza) {
        this.Base = Base;
        this.Altezza = Altezza;
    }

    @Override
    public double Area() {
        return Base * Altezza;
    }
}
