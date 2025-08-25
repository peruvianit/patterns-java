package it.peruvianit.pattern.strutture.adapter;

public class Triangolo implements FiguraGeometrica{

    private double lato1 = 1.0;
    private double lato2 = 1.0;
    private double lato3 = 1.0;

    private double base;
    private double altura;

    public Triangolo(){}

    public Triangolo(double lato1, double lato2, double lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    @Override
    public double perimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
    public double area() {
        double p = perimetro() /2;
        return Math.sqrt(p * (p -lato1) * (p -lato2) * (p -lato3));
    }
}
