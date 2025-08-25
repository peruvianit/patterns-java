package it.peruvianit.pattern.strutture.adapter;

import java.util.ArrayList;
import java.util.List;

public class CalcolatoreFiguraGeometrica {
    List<FiguraGeometrica> figuraGeometricaList = new ArrayList<>();

    public void add(FiguraGeometrica figuraGeometrica){
        figuraGeometricaList.add(figuraGeometrica);
    }

    public void areas(){
        figuraGeometricaList.forEach(
                fig -> System.out.println(fig.getClass().getSimpleName() + "area : " + fig.area())
        );
    }

    public void perimetri(){
        figuraGeometricaList.forEach(
                fig -> System.out.println(fig.getClass().getSimpleName() + "perimetro : " + fig.perimetro())
        );
    }
}
