package it.peruvianit.pattern.strutture.bridge;

public class MainBridge {
    public static void main(String[] args) {
        Dispositivo myTV = new TV();
        Dispositivo myRadio = new Radio();

        // Creo un telecomando base per la TV
        Telecomando baseTV = new TelecomandoBase(myTV);
        baseTV.accendi(); // Output: Accendo con il telecomando base. TV accesa.

        // Creo lo stesso telecomando base, ma per la radio
        Telecomando baseRadio = new TelecomandoBase(myRadio);
        baseRadio.accendi(); // Output: Accendo con il telecomando base. Radio accesa.
    }
}
