package it.peruvianit.pattern.strutture.adapter;

public class Rettangolo implements FiguraGeometricaSeconda{

    private double lato1 = 1.0;
    private double lato2 = 1.0;

    private double base;
    private double altura;

    public Rettangolo(){}

    public Rettangolo(double lato1, double lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }
    @Override
    public double perimetro() {
        return (lato1 * 2) + (lato2 * 2);
    }

    @Override
    public double area() {
        return lato1 * lato2;
    }
}
