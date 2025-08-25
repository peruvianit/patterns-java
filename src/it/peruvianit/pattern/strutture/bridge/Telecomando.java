package it.peruvianit.pattern.strutture.bridge;

public abstract class Telecomando {
    protected Dispositivo dispositivo;
    public Telecomando(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    public abstract void accendi();
    public abstract void spegni();
}
