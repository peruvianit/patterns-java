/**
 * <h1>Package it.peruvianit.pattern.creazionale  </h1>
 * I pattern creazionali gestiscono i processi di creazione degli oggetti, fornendo modi flessibili per instanziare
 * gli oggetti. Non usano direttamente l'operatore new ma delegano la logica di creazione, rendendo il sistema più
 * indipendente da come gli oggetti vengono creati.
 *
 *  - Singleton: garantisce che una classe abbia una sola istanza e fornisce un punto di accesso globale ad essa.
 *  - Factory Method: definisce un'interfaccia per la creazione di un oggetto, ma lascia che le sottoclassi decidano
 *    quale classe istanziare. *
 *  - Abstract Factory: fornisce un'interfaccia per la creazione di famiglie di oggetti correlati o dipendenti senza
 *    specificare le loro classi concrete. *
 *  - Builder: separa la costruzione di un oggetto complesso dalla sua rappresentazione, consentendo di creare diverse
 *    rappresentazioni usando lo stesso processo di costruzione.
 *  - Prototype: crea nuovi oggetti clonando un'istanza esistente (il prototipo).
 *
 * @since 1.0
 * @author Sergio Arellano
 */
package it.peruvianit.pattern.creazionale;
