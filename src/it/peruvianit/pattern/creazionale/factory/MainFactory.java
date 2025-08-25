package it.peruvianit.pattern.creazionale.factory;

public class MainFactory {
    public static void main(String[] args) {
        // Il client usa il creatore per la logistica di terra
        Logistica logisticaTerra = new LogisticaSuTerra();
        logisticaTerra.pianificaConsegna(); // Output: Spedisco via terra con un camion.

        System.out.println("---");

        // Il client usa il creatore per la logistica di mare
        Logistica logisticaMare = new LogisticaSuMare();
        logisticaMare.pianificaConsegna(); // Output: Spedisco via mare con una nave.
    }
}
