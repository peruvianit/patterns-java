package it.peruvianit.pattern.creazionale.builder;

public class Pizza {

    // 1. Attributi final del prodotto
    private final String impasto;
    private final String salsa;
    private final String formaggio;
    private final boolean salamePiccante;
    private final boolean olive;

    // 2. Costruttore privato, accessibile solo dal Builder
    private Pizza(PizzaBuilder builder) {
        this.impasto = builder.impasto;
        this.salsa = builder.salsa;
        this.formaggio = builder.formaggio;
        this.salamePiccante = builder.salamePiccante;
        this.olive = builder.olive;
    }

    // Metodi Getter pubblici
    public String getImpasto() { return impasto; }
    public String getSalsa() { return salsa; }
    public String getFormaggio() { return formaggio; }
    public boolean hasSalamePiccante() { return salamePiccante; }
    public boolean hasOlive() { return olive; }

    @Override
    public String toString() {
        return "Pizza{" +
                "impasto='" + impasto + '\'' +
                ", salsa='" + salsa + '\'' +
                ", formaggio='" + formaggio + '\'' +
                ", salamePiccante=" + salamePiccante +
                ", olive=" + olive +
                '}';
    }

    // --- La classe Builder ---

    // 3. Il Builder come classe innestata statica
    public static class PizzaBuilder {
        private String impasto;
        private String salsa;
        private String formaggio;
        private boolean salamePiccante = false;
        private boolean olive = false;

        // Metodi setter "fluent" che restituiscono l'istanza del builder
        public PizzaBuilder withImpasto(String impasto) {
            this.impasto = impasto;
            return this;
        }

        public PizzaBuilder withSalsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public PizzaBuilder withFormaggio(String formaggio) {
            this.formaggio = formaggio;
            return this;
        }

        public PizzaBuilder addSalamePiccante() {
            this.salamePiccante = true;
            return this;
        }

        public PizzaBuilder addOlive() {
            this.olive = true;
            return this;
        }

        // 4. Metodo build() che crea l'istanza finale
        public Pizza build() {
            if (impasto == null || salsa == null || formaggio == null) {
                throw new IllegalStateException("Gli ingredienti di base sono obbligatori.");
            }
            return new Pizza(this);
        }
    }
}