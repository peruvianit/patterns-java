package it.peruvianit.pattern.creazionale.abstract_factory;

public class MainAbstractFactory {
    private final Button button;
    private final Checkbox checkbox;

    // Il costruttore riceve una factory generica
    public MainAbstractFactory(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paintComponents() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        // Scenario 1: Applicazione su Windows
        System.out.println("Avvio dell'applicazione su Windows...");
        GUIFactory windowsFactory = new WindowsFactory();
        MainAbstractFactory appWindows = new MainAbstractFactory(windowsFactory);
        appWindows.paintComponents();

        System.out.println("\n--------------------------\n");

        // Scenario 2: Applicazione su macOS
        System.out.println("Avvio dell'applicazione su macOS...");
        GUIFactory macOSFactory = new MacOSFactory();
        MainAbstractFactory appMacOS = new MainAbstractFactory(macOSFactory);
        appMacOS.paintComponents();
    }
}
