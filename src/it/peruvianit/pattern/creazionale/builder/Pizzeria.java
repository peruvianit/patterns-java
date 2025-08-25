package it.peruvianit.pattern.creazionale.builder;

public class Pizzeria {
    public static void main(String[] args) {
        // Costruiamo una pizza Margherita
        Pizza margherita = new Pizza.PizzaBuilder()
                .withImpasto("Sottile")
                .withSalsa("Pomodoro")
                .withFormaggio("Mozzarella")
                .build();
        System.out.println("Pizza creata: " + margherita);

        // Costruiamo una pizza Diavola
        Pizza diavola = new Pizza.PizzaBuilder()
                .withImpasto("Napoletano")
                .withSalsa("Pomodoro")
                .withFormaggio("Mozzarella")
                .addSalamePiccante()
                .build();
        System.out.println("Pizza creata: " + diavola);
    }
}
