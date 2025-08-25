package it.peruvianit.pattern.creazionale.abstract_factory;

public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Hai creato un pulsante MacOS.");
    }
}
