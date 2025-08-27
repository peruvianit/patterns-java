/**
 * <h1>Package t.peruvianit.pattern.comportamentali.strategy</h1>
 *🔌 L'Analogia del Pattern Strategy
 *  Un'applicazione di navigazione GPS.  Quando devi raggiungere una destinazione, l'app (il nostro Contesto) può
 *  offrirti diverse "strategie" per calcolare il percorso: la strategia "più veloce", "più corta", "senza autostrade"
 *  o "più panoramica". Ognuna di queste opzioni è un algoritmo diverso, incapsulato in una classe separata (la Strategia
 *  Concreta). Tu, come utente (il client), scegli una strategia in base alle tue preferenze, e l'app delega il calcolo a
 *  quella specifica strategia. Questo permette di cambiare dinamicamente il comportamento dell'app senza dover alterare
 *  il suo codice interno, rendendola estremamente flessibile.
 *
 * @since 1.0
 * @author Sergio Arellano
 */
package it.peruvianit.pattern.comportamentali.strategy;
