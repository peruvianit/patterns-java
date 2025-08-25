/**
 * <h1>Package it.peruvianit.pattern.strutture.bridge</h1>
 * Il pattern Bridge separa l'astrazione (ciò che il client vede, come un telecomando) dalla sua implementazione
 * (il dispositivo che riceve i comandi, come una TV o una radio), permettendo a entrambe di variare in modo indipendente.
 * Senza il Bridge, dovresti creare una classe per ogni combinazione possibile (es. TelecomandoTV, TelecomandoRadio).
 * Il Bridge evita questa proliferazione di classi collegando dinamicamente un'astrazione (il telecomando) a un'implementazione
 * (il dispositivo), tramite composizione. Questo ti permette di usare lo stesso TelecomandoBase con qualsiasi TV o Radio e
 * di aggiungere nuovi telecomandi o dispositivi in futuro senza dover modificare le classi esistenti, rendendo il sistema
 * flessibile e disaccoppiato.
 *
 * @since 1.0
 * @author Sergio Arellano
 */
package it.peruvianit.pattern.strutture.bridge;
