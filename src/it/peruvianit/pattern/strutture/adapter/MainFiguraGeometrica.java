package it.peruvianit.pattern.strutture.adapter;

public class MainFiguraGeometrica {
    public static void main(String[] args) {
        CalcolatoreFiguraGeometrica calcolatoreFiguraGeometrica = new CalcolatoreFiguraGeometrica();

        calcolatoreFiguraGeometrica.add(new Triangolo());
        calcolatoreFiguraGeometrica.add(new Quadrato());
        calcolatoreFiguraGeometrica.add(new FiguraGeometricaAdapter(
                new Rettangolo()));

        calcolatoreFiguraGeometrica.areas();
        calcolatoreFiguraGeometrica.perimetri();
    }
}
