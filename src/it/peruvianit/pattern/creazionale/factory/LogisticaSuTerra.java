package it.peruvianit.pattern.creazionale.factory;

public class LogisticaSuTerra extends Logistica {
    @Override
    protected Trasporto creaTrasporto() {
        return new Camion();
    }
}