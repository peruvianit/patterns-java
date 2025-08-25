package it.peruvianit.pattern.comportamentali.observer;

public class ConcreteEcommerceObserver implements  EcommerceObserver{
    private final String name;

    public ConcreteEcommerceObserver(String name){
        this.name = name;
    }
    @Override
    public void updateObserver() {
        System.out.println(this.name + " received push notification from Ecommerce Subject");
    }
}
