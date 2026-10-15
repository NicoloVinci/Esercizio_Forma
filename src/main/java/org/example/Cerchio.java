package org.example;

public class Cerchio extends Forma {

    private double Raggio;

    public Cerchio(double Raggio) {
        this.Raggio = Raggio;
    }
    @Override
    public double Area() {
        return Math.round(Math.PI * Raggio * Raggio);
    }
}
