package it.peruvianit.pattern.strutture.bridge;

public class Radio implements Dispositivo {
    @Override
    public void accendi() { System.out.println("Radio accesa."); }
    @Override
    public void spegni() { System.out.println("Radio spenta."); }
    @Override
    public void impostaCanale(int numero) { System.out.println("Radio frequenza impostata su " + numero + "."); }
}
