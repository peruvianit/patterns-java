package it.peruvianit.pattern.strutture.adapter;

public class Quadrato implements FiguraGeometrica {

    private double lato = 1.0;

    public Quadrato(){}

    public Quadrato(double lato){
        this.lato = lato;
    }

    @Override
    public double perimetro() {
        return this.lato * 4;
    }

    @Override
    public double area() {
        return lato * lato;
    }
}
