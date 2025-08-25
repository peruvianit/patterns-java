package it.peruvianit.pattern.comportamentali.observer;

public interface EcommerceSubject {
    void register(EcommerceObserver ecommerceObserver);

    void unregister(EcommerceObserver ecommerceObserver);

    void notifyObservers();
}
