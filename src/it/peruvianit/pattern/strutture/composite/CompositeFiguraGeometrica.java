package it.peruvianit.pattern.strutture.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeFiguraGeometrica implements Figura{
    List<Figura> figuraList = new ArrayList<>();

    public void aggiungiFigura(Figura figura){
        figuraList.add(figura);
    }

    @Override
    public void disegnaFigura() {
        figuraList.forEach(Figura::disegnaFigura);
    }
}
