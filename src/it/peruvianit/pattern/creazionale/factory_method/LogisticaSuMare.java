package it.peruvianit.pattern.creazionale.factory_method;

public class LogisticaSuMare extends Logistica {
    @Override
    protected Trasporto creaTrasporto() {
        return new Nave();
    }
}