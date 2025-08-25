package it.peruvianit.pattern.strutture.bridge;

public class TV implements Dispositivo {
    @Override
    public void accendi() { System.out.println("TV accesa."); }
    @Override
    public void spegni() { System.out.println("TV spenta."); }
    @Override
    public void impostaCanale(int numero) { System.out.println("TV canale impostato su " + numero + "."); }
}
