package it.peruvianit.pattern.creazionale.abstract_factory;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Hai creato una checkbox di MacOS.");
    }
}
