package it.peruvianit.pattern.creazionale.factory_method;

// Creator
public abstract class Logistica {
    // Metodo di business che usa il Factory Method
    public void pianificaConsegna() {
        Trasporto trasporto = creaTrasporto();
        trasporto.spedisci();
    }
    // Il Factory Method astratto
    protected abstract Trasporto creaTrasporto();
}