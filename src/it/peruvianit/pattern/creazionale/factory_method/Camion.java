package it.peruvianit.pattern.creazionale.factory_method;

// Concrete Products
public class Camion implements Trasporto {
    @Override
    public void spedisci() {
        System.out.println("Spedisco via terra con un camion.");
    }
}
