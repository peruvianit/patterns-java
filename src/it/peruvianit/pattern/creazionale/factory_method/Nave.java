package it.peruvianit.pattern.creazionale.factory_method;

public class Nave implements Trasporto {
    @Override
    public void spedisci() {
        System.out.println("Spedisco via mare con una nave.");
    }
}
