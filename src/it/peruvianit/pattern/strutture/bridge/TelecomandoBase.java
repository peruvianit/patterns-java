package it.peruvianit.pattern.strutture.bridge;

public class TelecomandoBase extends Telecomando {
    public TelecomandoBase(Dispositivo dispositivo) {
        super(dispositivo);
    }
    @Override
    public void accendi() {
        System.out.println("Accendo con il telecomando base.");
        dispositivo.accendi();
    }
    @Override
    public void spegni() {
        System.out.println("Spengo con il telecomando base.");
        dispositivo.spegni();
    }
}