package org.example;

public abstract class Forma {
    public String Base;

    public abstract double Area();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + Area();
    }
}