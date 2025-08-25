package it.peruvianit.pattern.strutture.adapter;

public class FiguraGeometricaAdapter implements FiguraGeometrica{
    private FiguraGeometricaSeconda figuraGeometricaSeconda;

    public FiguraGeometricaAdapter(){}

    public FiguraGeometricaAdapter(FiguraGeometricaSeconda figuraGeometricaSeconda){
        this.figuraGeometricaSeconda = figuraGeometricaSeconda;
    }


    @Override
    public double perimetro() {
        return figuraGeometricaSeconda.perimetro();
    }

    @Override
    public double area() {
        return figuraGeometricaSeconda.area();
    }
}