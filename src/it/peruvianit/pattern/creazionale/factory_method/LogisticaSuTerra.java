package it.peruvianit.pattern.creazionale.factory_method;

public class LogisticaSuTerra extends Logistica {
    @Override
    protected Trasporto creaTrasporto() {
        return new Camion();
    }
}