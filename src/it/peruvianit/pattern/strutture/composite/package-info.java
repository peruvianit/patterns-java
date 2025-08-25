/**
 * <h1>Package it.peruvianit.pattern.strutture.composite</h1>
 * La struttura di un file system è un'ottima analogia per il pattern Composite. L'interfaccia FileSystemItem con
 * un metodo come getSize() serve a unificare il trattamento di ogni entità.  Un file è un oggetto Foglia; è
 * un'entità singola e non può contenere altre entità. Una cartella, invece, è un oggetto Composito; pur implementando
 * la stessa interfaccia FileSystemItem, può contenere altri FileSystemItem, che siano file o altre sottocartelle.
 * Quando un'applicazione chiede la dimensione di una cartella, il Composito delega la richiesta a tutti i suoi figli
 * e ne somma i risultati. Questo permette di trattare un'intera cartella (una composizione di oggetti) e un singolo
 * file (un oggetto individuale) in modo uniforme.
 *
 * @since 1.0
 * @author Sergio Arellano
 */
package it.peruvianit.pattern.strutture.composite;
