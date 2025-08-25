package it.peruvianit.pattern.creazionale.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        // 1. Creiamo l'oggetto prototipo originale
        Circle redCirclePrototype = new Circle("Red");
        System.out.println("Oggetto prototipo originale creato:");
        redCirclePrototype.draw();

        System.out.println("---");

        // 2. Cloniamo il prototipo per creare un nuovo oggetto
        Circle clonedCircle = (Circle) redCirclePrototype.clone();
        System.out.println("Oggetto clonato creato:");
        clonedCircle.draw();

        System.out.println("---");

        // 3. Modifichiamo il colore dell'oggetto clonato
        // Questo dimostra che sono due istanze separate in memoria
        System.out.println("Modificando il colore dell'oggetto clonato...");
        clonedCircle.setColor("Blue");
        System.out.println("Stato dell'oggetto clonato dopo la modifica:");
        clonedCircle.draw();

        System.out.println("---");

        System.out.println("Stato dell'oggetto prototipo originale (non è stato modificato):");
        redCirclePrototype.draw();

        // 4. Verifichiamo che i due oggetti siano istanze separate
        System.out.println("\nVerifica delle istanze:");
        System.out.println("Le istanze sono uguali? " + (redCirclePrototype == clonedCircle));

    }
}
