package it.peruvianit.pattern.strutture.proxy;

public class ImageProxy implements Image {
    private RealImage realImage; // Riferimento all'oggetto reale
    private final String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // L'oggetto reale viene creato solo la prima volta che serve
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        // Delega la chiamata al metodo dell'oggetto reale
        realImage.display();
    }
}
