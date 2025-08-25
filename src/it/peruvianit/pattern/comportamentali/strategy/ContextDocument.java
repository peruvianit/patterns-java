package it.peruvianit.pattern.comportamentali.strategy;

public class ContextDocument {
    private SavingStrategy savingStrategy;

    public ContextDocument(){}

    public  ContextDocument(SavingStrategy savingStrategy){
        this.savingStrategy = savingStrategy;
    }

    public void setSavingStrategy(SavingStrategy savingStrategy) {
        this.savingStrategy = savingStrategy;
    }

    public void saveStrategy(String filename){
        this.savingStrategy.saveStrategy(filename);
    }
}
