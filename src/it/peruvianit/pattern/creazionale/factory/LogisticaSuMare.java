package it.peruvianit.pattern.creazionale.factory;

public class LogisticaSuMare extends Logistica {
    @Override
    protected Trasporto creaTrasporto() {
        return new Nave();
    }
}