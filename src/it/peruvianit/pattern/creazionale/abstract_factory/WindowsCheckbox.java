package it.peruvianit.pattern.creazionale.abstract_factory;

public class WindowsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Hai creato una checkbox di Windows.");
    }
}
