package it.peruvianit.pattern.comportamentali.strategy;

public class ConcreteTxtStrategy implements SavingStrategy{
    @Override
    public void saveStrategy(String filename) {
        System.out.println("Sto salvando il file " + filename + ".txt");
    }
}
