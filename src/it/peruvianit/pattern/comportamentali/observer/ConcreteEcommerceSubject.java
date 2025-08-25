package it.peruvianit.pattern.comportamentali.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteEcommerceSubject implements EcommerceSubject{

    List<EcommerceObserver> ecommerceObserverList = new ArrayList<>();

    @Override
    public void register(EcommerceObserver ecommerceObserver) {
        ecommerceObserverList.add(ecommerceObserver);
    }

    @Override
    public void unregister(EcommerceObserver ecommerceObserver) {
        ecommerceObserverList.remove(ecommerceObserver);
    }

    @Override
    public void notifyObservers() {
        ecommerceObserverList.forEach(EcommerceObserver::updateObserver);
    }
}
