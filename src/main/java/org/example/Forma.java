package org.example;

public abstract class Forma {
    public abstract double Area();

    @Override
    public String toString() {
        return "Forma: " + Area();
    }
}
