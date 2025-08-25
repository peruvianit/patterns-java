/**
 * <h1>Package it.peruvianit.pattern.strutture.proxy</h1>
 *🔌 L'Analogia del Patter proxy
 *  un'applicazione per una galleria fotografica. Per non rallentare l'avvio, l'app mostra subito delle miniature a
 *  bassa risoluzione. Queste miniature agiscono da sostituti o proxy per le foto originali ad alta risoluzione.
 *  L'app carica l'immagine "pesante" e completa solo nel momento in cui un utente fa clic sulla miniatura per
 *  vederla ingrandita. In questo modo, il proxy gestisce il "caricamento su richiesta," garantendo che la galleria
 *  sia veloce e reattiva. L'utente interagisce sempre con un'entità (la miniatura), che delega il lavoro effettivo a
 *  un'altra entità (il file ad alta risoluzione) solo quando è strettamente necessario, ottimizzando le risorse
 *  del sistema.
 *
 * @since 1.0
 * @author Sergio Arellano
 */
package it.peruvianit.pattern.strutture.proxy;
