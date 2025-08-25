package it.peruvianit.pattern.strutture.proxy;

public class MainProxy {
    public static void main(String[] args) {
        // Il proxy viene creato, ma l'immagine reale NON è ancora caricata.
        System.out.println("L'app carica le miniature (i proxy)...");
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        System.out.println("\nUtente clicca sulla prima miniatura.");
        // Qui viene attivato il caricamento effettivo
        image1.display(); // Output: Caricando photo1.jpg... Visualizzando photo1.jpg

        System.out.println("\nUtente clicca di nuovo sulla prima miniatura.");
        // Il proxy ha già l'oggetto, non c'è bisogno di caricarlo di nuovo
        image1.display(); // Output: Visualizzando photo1.jpg

        System.out.println("\nUtente clicca sulla seconda miniatura.");
        // Viene attivato il caricamento della seconda immagine
        image2.display(); // Output: Caricando photo2.jpg... Visualizzando photo2.jpg
    }
}
