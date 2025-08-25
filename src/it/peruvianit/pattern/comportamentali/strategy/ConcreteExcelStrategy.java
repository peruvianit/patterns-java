package it.peruvianit.pattern.comportamentali.strategy;

public class ConcreteExcelStrategy implements SavingStrategy{
    @Override
    public void saveStrategy(String filename) {
        System.out.println("Sto salvando il file " + filename + ".xlsx");
    }
}
