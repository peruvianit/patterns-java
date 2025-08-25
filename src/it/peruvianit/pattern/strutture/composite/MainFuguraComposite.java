package it.peruvianit.pattern.strutture.composite;

import it.peruvianit.pattern.strutture.adapter.CalcolatoreFiguraGeometrica;

public class MainFuguraComposite {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo();
        Quadrato quadrato = new Quadrato();

        CompositeFiguraGeometrica compositeFiguraGeometrica = new CompositeFiguraGeometrica();

        compositeFiguraGeometrica.aggiungiFigura(triangolo);
        compositeFiguraGeometrica.aggiungiFigura(quadrato);

        CompositeFiguraGeometrica compositeFiguraGeometricaSeconda  = new CompositeFiguraGeometrica();
        compositeFiguraGeometricaSeconda.aggiungiFigura(triangolo);

        compositeFiguraGeometrica.aggiungiFigura(compositeFiguraGeometricaSeconda);
        compositeFiguraGeometrica.disegnaFigura();
    }
}
