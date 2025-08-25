package it.peruvianit.pattern.creazionale.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        // Il client ottiene l'istanza del Singleton
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect(); // Output: Connesso al database.

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.connect(); // Output: Connesso al database.

        // connection1 e connection2 puntano allo stesso oggetto
        System.out.println(connection1 == connection2); // Output: true
    }
}
