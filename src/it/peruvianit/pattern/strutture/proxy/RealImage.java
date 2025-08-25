package it.peruvianit.pattern.strutture.proxy;

public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        // Simuliamo un'operazione di caricamento "pesante"
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Visualizzando " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Caricando " + filename + "...");
        try {
            Thread.sleep(2000); // Ritardo simulato
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
