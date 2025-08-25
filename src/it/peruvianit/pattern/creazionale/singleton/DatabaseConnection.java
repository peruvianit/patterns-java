package it.peruvianit.pattern.creazionale.singleton;

public class DatabaseConnection {
    // 2. L'unica istanza della classe
    private static DatabaseConnection instance;

    // 1. Il costruttore privato
    private DatabaseConnection() {
        // Simuliamo l'inizializzazione di una connessione costosa
        System.out.println("Creazione di una connessione al database...");
    }

    // 3. Il metodo di accesso pubblico e statico
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // L'istanza viene creata solo se non esiste
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Metodi di business logici
    public void connect() {
        System.out.println("Connesso al database.");
    }
}